// Copyright 2023 Buf Technologies, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package build.buf;

import build.buf.gen.buf.validate.ValidateProto;
import build.buf.gen.buf.validate.Violations;
import build.buf.gen.buf.validate.conformance.harness.ConformanceServiceGrpc;
import build.buf.gen.buf.validate.conformance.harness.StreamingConformanceRequest;
import build.buf.gen.buf.validate.conformance.harness.StreamingConformanceResponse;
import build.buf.gen.buf.validate.conformance.harness.TestConformanceRequest;
import build.buf.gen.buf.validate.conformance.harness.TestConformanceResponse;
import build.buf.gen.buf.validate.conformance.harness.TestResult;
import build.buf.protovalidate.Config;
import build.buf.protovalidate.ValidationResult;
import build.buf.protovalidate.Validator;
import build.buf.protovalidate.exceptions.CompilationException;
import build.buf.protovalidate.exceptions.ExecutionException;
import com.google.common.base.Splitter;
import com.google.errorprone.annotations.FormatMethod;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DynamicMessage;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.Server;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.Map;

public class Main {

  public static final class Service extends ConformanceServiceGrpc.ConformanceServiceImplBase {
    static ExtensionRegistry extensionRegistry = ExtensionRegistry.newInstance();
    static {
      extensionRegistry.add(ValidateProto.message);
      extensionRegistry.add(ValidateProto.field);
      extensionRegistry.add(ValidateProto.oneof);
    }

    @Override
    public void testConformance(TestConformanceRequest request, StreamObserver<TestConformanceResponse> responseObserver) {
      StreamingConformanceResponse streamingConformanceResponse = test(StreamingConformanceRequest.newBuilder()
              .setFdset(request.getFdset())
              .putAllCases(request.getCasesMap())
              .build());
      responseObserver.onNext(TestConformanceResponse.newBuilder().putAllResults(streamingConformanceResponse.getResultsMap()).build());
      responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<StreamingConformanceRequest> streamingConformance(StreamObserver<StreamingConformanceResponse> responseObserver) {
      return new StreamObserver<>() {
        @Override
        public void onNext(StreamingConformanceRequest request) {
          try {
            StreamingConformanceRequest hydratedRequest = StreamingConformanceRequest.parseFrom(request.toByteString(), extensionRegistry);
            StreamingConformanceResponse streamingConformanceResponse = test(hydratedRequest);
            responseObserver.onNext(streamingConformanceResponse);
          } catch (InvalidProtocolBufferException e) {
            responseObserver.onError(e);
          }
        }

        @Override
        public void onError(Throwable t) {
          responseObserver.onError(t);
        }

        @Override
        public void onCompleted() {
          responseObserver.onCompleted();
        }
      };
    }
  }
  public static void main(String[] args) {
    try {
      Service bindableService = new Service();
      Server server = NettyServerBuilder.forPort(1235)
              .addService(bindableService)
              .build();
      server.start();
      server.awaitTermination();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private static StreamingConformanceResponse test(StreamingConformanceRequest request) {
    try {
      Map<String, Descriptors.Descriptor> descriptorMap =
          FileDescriptorUtil.parse(request.getFdset());
      Validator validator = new Validator(Config.builder().build());
      StreamingConformanceResponse.Builder responseBuilder = StreamingConformanceResponse.newBuilder().setSuiteName(request.getSuiteName());
      for (Map.Entry<String, Any> entry : request.getCasesMap().entrySet()) {
        TestResult testResult = testCase(validator, descriptorMap, entry.getValue());
        responseBuilder.putResults(entry.getKey(), testResult);
      }
      return responseBuilder.build();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private static TestResult testCase(
      Validator validator, Map<String, Descriptors.Descriptor> fileDescriptors, Any testCase)
      throws InvalidProtocolBufferException {
    List<String> urlParts = Splitter.on('/').limit(2).splitToList(testCase.getTypeUrl());
    String fullName = urlParts.get(urlParts.size() - 1);
    Descriptors.Descriptor descriptor = fileDescriptors.get(fullName);
    if (descriptor == null) {
      return unexpectedErrorResult("Unable to find descriptor: %s", fullName);
    }
    ByteString testCaseValue = testCase.getValue();
    DynamicMessage dynamicMessage =
        DynamicMessage.newBuilder(descriptor).mergeFrom(testCaseValue).build();
    return validate(validator, dynamicMessage);
  }

  private static TestResult validate(Validator validator, DynamicMessage dynamicMessage) {
    try {
      ValidationResult result = validator.validate(dynamicMessage);
      if (result.getViolations().isEmpty()) {
        return TestResult.newBuilder().setSuccess(true).build();
      } else {
        return TestResult.newBuilder()
            .setValidationError(
                Violations.newBuilder().addAllViolations(result.getViolations()).build())
            .build();
      }
    } catch (CompilationException e) {
      return TestResult.newBuilder().setCompilationError(e.getMessage()).build();
    } catch (ExecutionException e) {
      return TestResult.newBuilder().setRuntimeError(e.getMessage()).build();
    } catch (Exception e) {
      return unexpectedErrorResult("unknown error: %s", e.toString());
    }
  }

  @FormatMethod
  private static TestResult unexpectedErrorResult(String format, Object... args) {
    String errorMessage = String.format(format, args);
    return TestResult.newBuilder().setUnexpectedError(errorMessage).build();
  }
}
