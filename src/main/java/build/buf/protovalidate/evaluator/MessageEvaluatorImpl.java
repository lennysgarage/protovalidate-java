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

package build.buf.protovalidate.evaluator;

import build.buf.protovalidate.results.ExecutionException;
import build.buf.protovalidate.results.ValidationResult;
import com.google.protobuf.Message;

import java.util.ArrayList;
import java.util.List;

class MessageEvaluatorImpl implements MessageEvaluator {
    private final List<MessageEvaluator> evaluators = new ArrayList<>();

    @Override
    public boolean tautology() {
        for (MessageEvaluator evaluator : evaluators) {
            if (!evaluator.tautology()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ValidationResult evaluate(Value val, boolean failFast) throws ExecutionException {
        return evaluateMessage(val.messageValue(), failFast);
    }

    @Override
    public void append(Evaluator eval) {
        if (eval instanceof MessageEvaluator) {
            evaluators.add((MessageEvaluator) eval);
        }
    }

    @Override
    public ValidationResult evaluateMessage(Message val, boolean failFast) throws ExecutionException {
        ValidationResult validationResult = new ValidationResult();
        for (MessageEvaluator evaluator : evaluators) {
            ValidationResult evalResult = evaluator.evaluateMessage(val, failFast);
            if (!validationResult.merge(evalResult, failFast)) {
                return evalResult;
            }
        }
        return validationResult;
    }
}
