// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/repeated.proto
// Protobuf Java Version: 4.27.3

package build.buf.validate.conformance.cases;

public interface RepeatedEmbedCrossPackageNoneOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.RepeatedEmbedCrossPackageNone)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .buf.validate.conformance.cases.other_package.Embed val = 1 [json_name = "val"];</code>
   */
  java.util.List<build.buf.validate.conformance.cases.other_package.Embed> 
      getValList();
  /**
   * <code>repeated .buf.validate.conformance.cases.other_package.Embed val = 1 [json_name = "val"];</code>
   */
  build.buf.validate.conformance.cases.other_package.Embed getVal(int index);
  /**
   * <code>repeated .buf.validate.conformance.cases.other_package.Embed val = 1 [json_name = "val"];</code>
   */
  int getValCount();
  /**
   * <code>repeated .buf.validate.conformance.cases.other_package.Embed val = 1 [json_name = "val"];</code>
   */
  java.util.List<? extends build.buf.validate.conformance.cases.other_package.EmbedOrBuilder> 
      getValOrBuilderList();
  /**
   * <code>repeated .buf.validate.conformance.cases.other_package.Embed val = 1 [json_name = "val"];</code>
   */
  build.buf.validate.conformance.cases.other_package.EmbedOrBuilder getValOrBuilder(
      int index);
}
