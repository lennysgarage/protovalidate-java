// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/expression.proto
// Protobuf Java Version: 4.28.0

package build.buf.validate;

public final class ExpressionProto {
  private ExpressionProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 0,
      /* suffix= */ "",
      ExpressionProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_Constraint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_Constraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_Violations_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_Violations_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_Violation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_Violation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035buf/validate/expression.proto\022\014buf.val" +
      "idate\"V\n\nConstraint\022\016\n\002id\030\001 \001(\tR\002id\022\030\n\007m" +
      "essage\030\002 \001(\tR\007message\022\036\n\nexpression\030\003 \001(" +
      "\tR\nexpression\"E\n\nViolations\0227\n\nviolation" +
      "s\030\001 \003(\0132\027.buf.validate.ViolationR\nviolat" +
      "ions\"\202\001\n\tViolation\022\035\n\nfield_path\030\001 \001(\tR\t" +
      "fieldPath\022#\n\rconstraint_id\030\002 \001(\tR\014constr" +
      "aintId\022\030\n\007message\030\003 \001(\tR\007message\022\027\n\007for_" +
      "key\030\004 \001(\010R\006forKeyBp\n\022build.buf.validateB" +
      "\017ExpressionProtoP\001ZGbuf.build/gen/go/buf" +
      "build/protovalidate/protocolbuffers/go/b" +
      "uf/validateb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_buf_validate_Constraint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_buf_validate_Constraint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_Constraint_descriptor,
        new java.lang.String[] { "Id", "Message", "Expression", });
    internal_static_buf_validate_Violations_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_buf_validate_Violations_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_Violations_descriptor,
        new java.lang.String[] { "Violations", });
    internal_static_buf_validate_Violation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_buf_validate_Violation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_Violation_descriptor,
        new java.lang.String[] { "FieldPath", "ConstraintId", "Message", "ForKey", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
