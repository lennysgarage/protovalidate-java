// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/other_package/embed.proto
// Protobuf Java Version: 4.27.3

package build.buf.validate.conformance.cases.other_package;

public final class EmbedProto {
  private EmbedProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      EmbedProto.class.getName());
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
    internal_static_buf_validate_conformance_cases_other_package_Embed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_other_package_Embed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_other_package_Embed_DoubleEmbed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_other_package_Embed_DoubleEmbed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8buf/validate/conformance/cases/other_p" +
      "ackage/embed.proto\022,buf.validate.conform" +
      "ance.cases.other_package\032\033buf/validate/v" +
      "alidate.proto\"\305\001\n\005Embed\022\031\n\003val\030\001 \001(\003B\007\272H" +
      "\004\"\002 \000R\003val\032a\n\013DoubleEmbed\"R\n\020DoubleEnume" +
      "rated\022!\n\035DOUBLE_ENUMERATED_UNSPECIFIED\020\000" +
      "\022\033\n\027DOUBLE_ENUMERATED_VALUE\020\001\">\n\nEnumera" +
      "ted\022\032\n\026ENUMERATED_UNSPECIFIED\020\000\022\024\n\020ENUME" +
      "RATED_VALUE\020\001B\222\002\n2build.buf.validate.con" +
      "formance.cases.other_packageB\nEmbedProto" +
      "P\001\242\002\005BVCCO\252\002+Buf.Validate.Conformance.Ca" +
      "ses.OtherPackage\312\002+Buf\\Validate\\Conforma" +
      "nce\\Cases\\OtherPackage\342\0027Buf\\Validate\\Co" +
      "nformance\\Cases\\OtherPackage\\GPBMetadata" +
      "\352\002/Buf::Validate::Conformance::Cases::Ot" +
      "herPackageb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_buf_validate_conformance_cases_other_package_Embed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_buf_validate_conformance_cases_other_package_Embed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_other_package_Embed_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_other_package_Embed_DoubleEmbed_descriptor =
      internal_static_buf_validate_conformance_cases_other_package_Embed_descriptor.getNestedTypes().get(0);
    internal_static_buf_validate_conformance_cases_other_package_Embed_DoubleEmbed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_other_package_Embed_DoubleEmbed_descriptor,
        new java.lang.String[] { });
    descriptor.resolveAllFeaturesImmutable();
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
