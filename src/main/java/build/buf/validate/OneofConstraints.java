// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/validate.proto
// Protobuf Java Version: 4.27.3

package build.buf.validate;

/**
 * <pre>
 * The `OneofConstraints` message type enables you to manage constraints for
 * oneof fields in your protobuf messages.
 * </pre>
 *
 * Protobuf type {@code buf.validate.OneofConstraints}
 */
public final class OneofConstraints extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.OneofConstraints)
    OneofConstraintsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      OneofConstraints.class.getName());
  }
  // Use OneofConstraints.newBuilder() to construct.
  private OneofConstraints(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private OneofConstraints() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.ValidateProto.internal_static_buf_validate_OneofConstraints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.ValidateProto.internal_static_buf_validate_OneofConstraints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.OneofConstraints.class, build.buf.validate.OneofConstraints.Builder.class);
  }

  private int bitField0_;
  public static final int REQUIRED_FIELD_NUMBER = 1;
  private boolean required_ = false;
  /**
   * <pre>
   * If `required` is true, exactly one field of the oneof must be present. A
   * validation error is returned if no fields in the oneof are present. The
   * field itself may still be a default value; further constraints
   * should be placed on the fields themselves to ensure they are valid values,
   * such as `min_len` or `gt`.
   *
   * ```proto
   * message MyMessage {
   * oneof value {
   * // Either `a` or `b` must be set. If `a` is set, it must also be
   * // non-empty; whereas if `b` is set, it can still be an empty string.
   * option (buf.validate.oneof).required = true;
   * string a = 1 [(buf.validate.field).string.min_len = 1];
   * string b = 2;
   * }
   * }
   * ```
   * </pre>
   *
   * <code>optional bool required = 1 [json_name = "required"];</code>
   * @return Whether the required field is set.
   */
  @java.lang.Override
  public boolean hasRequired() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * If `required` is true, exactly one field of the oneof must be present. A
   * validation error is returned if no fields in the oneof are present. The
   * field itself may still be a default value; further constraints
   * should be placed on the fields themselves to ensure they are valid values,
   * such as `min_len` or `gt`.
   *
   * ```proto
   * message MyMessage {
   * oneof value {
   * // Either `a` or `b` must be set. If `a` is set, it must also be
   * // non-empty; whereas if `b` is set, it can still be an empty string.
   * option (buf.validate.oneof).required = true;
   * string a = 1 [(buf.validate.field).string.min_len = 1];
   * string b = 2;
   * }
   * }
   * ```
   * </pre>
   *
   * <code>optional bool required = 1 [json_name = "required"];</code>
   * @return The required.
   */
  @java.lang.Override
  public boolean getRequired() {
    return required_;
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
      output.writeBool(1, required_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, required_);
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
    if (!(obj instanceof build.buf.validate.OneofConstraints)) {
      return super.equals(obj);
    }
    build.buf.validate.OneofConstraints other = (build.buf.validate.OneofConstraints) obj;

    if (hasRequired() != other.hasRequired()) return false;
    if (hasRequired()) {
      if (getRequired()
          != other.getRequired()) return false;
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
    if (hasRequired()) {
      hash = (37 * hash) + REQUIRED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getRequired());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.OneofConstraints parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.OneofConstraints parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.OneofConstraints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.OneofConstraints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.OneofConstraints parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.OneofConstraints parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.OneofConstraints parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.OneofConstraints parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.OneofConstraints parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.OneofConstraints parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.OneofConstraints parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.OneofConstraints parseFrom(
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
  public static Builder newBuilder(build.buf.validate.OneofConstraints prototype) {
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
   * <pre>
   * The `OneofConstraints` message type enables you to manage constraints for
   * oneof fields in your protobuf messages.
   * </pre>
   *
   * Protobuf type {@code buf.validate.OneofConstraints}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.OneofConstraints)
      build.buf.validate.OneofConstraintsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_OneofConstraints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_OneofConstraints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.OneofConstraints.class, build.buf.validate.OneofConstraints.Builder.class);
    }

    // Construct using build.buf.validate.OneofConstraints.newBuilder()
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
      required_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_OneofConstraints_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.OneofConstraints getDefaultInstanceForType() {
      return build.buf.validate.OneofConstraints.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.OneofConstraints build() {
      build.buf.validate.OneofConstraints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.OneofConstraints buildPartial() {
      build.buf.validate.OneofConstraints result = new build.buf.validate.OneofConstraints(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.OneofConstraints result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.required_ = required_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.OneofConstraints) {
        return mergeFrom((build.buf.validate.OneofConstraints)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.OneofConstraints other) {
      if (other == build.buf.validate.OneofConstraints.getDefaultInstance()) return this;
      if (other.hasRequired()) {
        setRequired(other.getRequired());
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
            case 8: {
              required_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private boolean required_ ;
    /**
     * <pre>
     * If `required` is true, exactly one field of the oneof must be present. A
     * validation error is returned if no fields in the oneof are present. The
     * field itself may still be a default value; further constraints
     * should be placed on the fields themselves to ensure they are valid values,
     * such as `min_len` or `gt`.
     *
     * ```proto
     * message MyMessage {
     * oneof value {
     * // Either `a` or `b` must be set. If `a` is set, it must also be
     * // non-empty; whereas if `b` is set, it can still be an empty string.
     * option (buf.validate.oneof).required = true;
     * string a = 1 [(buf.validate.field).string.min_len = 1];
     * string b = 2;
     * }
     * }
     * ```
     * </pre>
     *
     * <code>optional bool required = 1 [json_name = "required"];</code>
     * @return Whether the required field is set.
     */
    @java.lang.Override
    public boolean hasRequired() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * If `required` is true, exactly one field of the oneof must be present. A
     * validation error is returned if no fields in the oneof are present. The
     * field itself may still be a default value; further constraints
     * should be placed on the fields themselves to ensure they are valid values,
     * such as `min_len` or `gt`.
     *
     * ```proto
     * message MyMessage {
     * oneof value {
     * // Either `a` or `b` must be set. If `a` is set, it must also be
     * // non-empty; whereas if `b` is set, it can still be an empty string.
     * option (buf.validate.oneof).required = true;
     * string a = 1 [(buf.validate.field).string.min_len = 1];
     * string b = 2;
     * }
     * }
     * ```
     * </pre>
     *
     * <code>optional bool required = 1 [json_name = "required"];</code>
     * @return The required.
     */
    @java.lang.Override
    public boolean getRequired() {
      return required_;
    }
    /**
     * <pre>
     * If `required` is true, exactly one field of the oneof must be present. A
     * validation error is returned if no fields in the oneof are present. The
     * field itself may still be a default value; further constraints
     * should be placed on the fields themselves to ensure they are valid values,
     * such as `min_len` or `gt`.
     *
     * ```proto
     * message MyMessage {
     * oneof value {
     * // Either `a` or `b` must be set. If `a` is set, it must also be
     * // non-empty; whereas if `b` is set, it can still be an empty string.
     * option (buf.validate.oneof).required = true;
     * string a = 1 [(buf.validate.field).string.min_len = 1];
     * string b = 2;
     * }
     * }
     * ```
     * </pre>
     *
     * <code>optional bool required = 1 [json_name = "required"];</code>
     * @param value The required to set.
     * @return This builder for chaining.
     */
    public Builder setRequired(boolean value) {

      required_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If `required` is true, exactly one field of the oneof must be present. A
     * validation error is returned if no fields in the oneof are present. The
     * field itself may still be a default value; further constraints
     * should be placed on the fields themselves to ensure they are valid values,
     * such as `min_len` or `gt`.
     *
     * ```proto
     * message MyMessage {
     * oneof value {
     * // Either `a` or `b` must be set. If `a` is set, it must also be
     * // non-empty; whereas if `b` is set, it can still be an empty string.
     * option (buf.validate.oneof).required = true;
     * string a = 1 [(buf.validate.field).string.min_len = 1];
     * string b = 2;
     * }
     * }
     * ```
     * </pre>
     *
     * <code>optional bool required = 1 [json_name = "required"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequired() {
      bitField0_ = (bitField0_ & ~0x00000001);
      required_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.OneofConstraints)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.OneofConstraints)
  private static final build.buf.validate.OneofConstraints DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.OneofConstraints();
  }

  public static build.buf.validate.OneofConstraints getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OneofConstraints>
      PARSER = new com.google.protobuf.AbstractParser<OneofConstraints>() {
    @java.lang.Override
    public OneofConstraints parsePartialFrom(
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

  public static com.google.protobuf.Parser<OneofConstraints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OneofConstraints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.OneofConstraints getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

