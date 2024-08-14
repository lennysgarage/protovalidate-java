// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/required_field_proto_editions.proto
// Protobuf Java Version: 4.27.3

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault}
 */
public final class RequiredEditionsScalarExplicitPresenceDefault extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault)
    RequiredEditionsScalarExplicitPresenceDefaultOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      RequiredEditionsScalarExplicitPresenceDefault.class.getName());
  }
  // Use RequiredEditionsScalarExplicitPresenceDefault.newBuilder() to construct.
  private RequiredEditionsScalarExplicitPresenceDefault(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RequiredEditionsScalarExplicitPresenceDefault() {
    val_ = "foo";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.RequiredFieldProtoEditionsProto.internal_static_buf_validate_conformance_cases_RequiredEditionsScalarExplicitPresenceDefault_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.RequiredFieldProtoEditionsProto.internal_static_buf_validate_conformance_cases_RequiredEditionsScalarExplicitPresenceDefault_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault.class, build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault.Builder.class);
  }

  private int bitField0_;
  public static final int VAL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object val_ = "foo";
  /**
   * <code>string val = 1 [default = "foo", json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return Whether the val field is set.
   */
  @java.lang.Override
  public boolean hasVal() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>string val = 1 [default = "foo", json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The val.
   */
  @java.lang.Override
  public java.lang.String getVal() {
    java.lang.Object ref = val_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      val_ = s;
      return s;
    }
  }
  /**
   * <code>string val = 1 [default = "foo", json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The bytes for val.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValBytes() {
    java.lang.Object ref = val_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      val_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, val_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, val_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault other = (build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault) obj;

    if (hasVal() != other.hasVal()) return false;
    if (hasVal()) {
      if (!getVal()
          .equals(other.getVal())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasVal()) {
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + getVal().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault)
      build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefaultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.RequiredFieldProtoEditionsProto.internal_static_buf_validate_conformance_cases_RequiredEditionsScalarExplicitPresenceDefault_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.RequiredFieldProtoEditionsProto.internal_static_buf_validate_conformance_cases_RequiredEditionsScalarExplicitPresenceDefault_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault.class, build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      val_ = "foo";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.RequiredFieldProtoEditionsProto.internal_static_buf_validate_conformance_cases_RequiredEditionsScalarExplicitPresenceDefault_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault build() {
      build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault buildPartial() {
      build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault result = new build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.val_ = val_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault) {
        return mergeFrom((build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault other) {
      if (other == build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault.getDefaultInstance()) return this;
      if (other.hasVal()) {
        val_ = other.val_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              val_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object val_ = "foo";
    /**
     * <code>string val = 1 [default = "foo", json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return Whether the val field is set.
     */
    public boolean hasVal() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>string val = 1 [default = "foo", json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return The val.
     */
    public java.lang.String getVal() {
      java.lang.Object ref = val_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        val_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string val = 1 [default = "foo", json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return The bytes for val.
     */
    public com.google.protobuf.ByteString
        getValBytes() {
      java.lang.Object ref = val_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        val_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string val = 1 [default = "foo", json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param value The val to set.
     * @return This builder for chaining.
     */
    public Builder setVal(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      val_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string val = 1 [default = "foo", json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearVal() {
      val_ = getDefaultInstance().getVal();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string val = 1 [default = "foo", json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for val to set.
     * @return This builder for chaining.
     */
    public Builder setValBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      val_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault)
  private static final build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault();
  }

  public static build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequiredEditionsScalarExplicitPresenceDefault>
      PARSER = new com.google.protobuf.AbstractParser<RequiredEditionsScalarExplicitPresenceDefault>() {
    @java.lang.Override
    public RequiredEditionsScalarExplicitPresenceDefault parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RequiredEditionsScalarExplicitPresenceDefault> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequiredEditionsScalarExplicitPresenceDefault> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.RequiredEditionsScalarExplicitPresenceDefault getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

