// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/numbers.proto

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.Int64BigConstraints}
 */
public final class Int64BigConstraints extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.Int64BigConstraints)
    Int64BigConstraintsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Int64BigConstraints.newBuilder() to construct.
  private Int64BigConstraints(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Int64BigConstraints() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Int64BigConstraints();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.NumbersProto.internal_static_buf_validate_conformance_cases_Int64BigConstraints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.NumbersProto.internal_static_buf_validate_conformance_cases_Int64BigConstraints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.Int64BigConstraints.class, build.buf.validate.conformance.cases.Int64BigConstraints.Builder.class);
  }

  public static final int LT_POS_FIELD_NUMBER = 1;
  private long ltPos_ = 0L;
  /**
   * <pre>
   * Intentionally choose limits that are outside the range of both signed and unsigned 32-bit integers.
   * </pre>
   *
   * <code>int64 lt_pos = 1 [json_name = "ltPos", (.buf.validate.field) = { ... }</code>
   * @return The ltPos.
   */
  @java.lang.Override
  public long getLtPos() {
    return ltPos_;
  }

  public static final int LT_NEG_FIELD_NUMBER = 2;
  private long ltNeg_ = 0L;
  /**
   * <code>int64 lt_neg = 2 [json_name = "ltNeg", (.buf.validate.field) = { ... }</code>
   * @return The ltNeg.
   */
  @java.lang.Override
  public long getLtNeg() {
    return ltNeg_;
  }

  public static final int GT_POS_FIELD_NUMBER = 3;
  private long gtPos_ = 0L;
  /**
   * <code>int64 gt_pos = 3 [json_name = "gtPos", (.buf.validate.field) = { ... }</code>
   * @return The gtPos.
   */
  @java.lang.Override
  public long getGtPos() {
    return gtPos_;
  }

  public static final int GT_NEG_FIELD_NUMBER = 4;
  private long gtNeg_ = 0L;
  /**
   * <code>int64 gt_neg = 4 [json_name = "gtNeg", (.buf.validate.field) = { ... }</code>
   * @return The gtNeg.
   */
  @java.lang.Override
  public long getGtNeg() {
    return gtNeg_;
  }

  public static final int LTE_POS_FIELD_NUMBER = 5;
  private long ltePos_ = 0L;
  /**
   * <code>int64 lte_pos = 5 [json_name = "ltePos", (.buf.validate.field) = { ... }</code>
   * @return The ltePos.
   */
  @java.lang.Override
  public long getLtePos() {
    return ltePos_;
  }

  public static final int LTE_NEG_FIELD_NUMBER = 6;
  private long lteNeg_ = 0L;
  /**
   * <code>int64 lte_neg = 6 [json_name = "lteNeg", (.buf.validate.field) = { ... }</code>
   * @return The lteNeg.
   */
  @java.lang.Override
  public long getLteNeg() {
    return lteNeg_;
  }

  public static final int GTE_POS_FIELD_NUMBER = 7;
  private long gtePos_ = 0L;
  /**
   * <code>int64 gte_pos = 7 [json_name = "gtePos", (.buf.validate.field) = { ... }</code>
   * @return The gtePos.
   */
  @java.lang.Override
  public long getGtePos() {
    return gtePos_;
  }

  public static final int GTE_NEG_FIELD_NUMBER = 8;
  private long gteNeg_ = 0L;
  /**
   * <code>int64 gte_neg = 8 [json_name = "gteNeg", (.buf.validate.field) = { ... }</code>
   * @return The gteNeg.
   */
  @java.lang.Override
  public long getGteNeg() {
    return gteNeg_;
  }

  public static final int CONSTANT_POS_FIELD_NUMBER = 9;
  private long constantPos_ = 0L;
  /**
   * <code>int64 constant_pos = 9 [json_name = "constantPos", (.buf.validate.field) = { ... }</code>
   * @return The constantPos.
   */
  @java.lang.Override
  public long getConstantPos() {
    return constantPos_;
  }

  public static final int CONSTANT_NEG_FIELD_NUMBER = 10;
  private long constantNeg_ = 0L;
  /**
   * <code>int64 constant_neg = 10 [json_name = "constantNeg", (.buf.validate.field) = { ... }</code>
   * @return The constantNeg.
   */
  @java.lang.Override
  public long getConstantNeg() {
    return constantNeg_;
  }

  public static final int IN_FIELD_NUMBER = 11;
  private long in_ = 0L;
  /**
   * <code>int64 in = 11 [json_name = "in", (.buf.validate.field) = { ... }</code>
   * @return The in.
   */
  @java.lang.Override
  public long getIn() {
    return in_;
  }

  public static final int NOTIN_FIELD_NUMBER = 12;
  private long notin_ = 0L;
  /**
   * <code>int64 notin = 12 [json_name = "notin", (.buf.validate.field) = { ... }</code>
   * @return The notin.
   */
  @java.lang.Override
  public long getNotin() {
    return notin_;
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
    if (ltPos_ != 0L) {
      output.writeInt64(1, ltPos_);
    }
    if (ltNeg_ != 0L) {
      output.writeInt64(2, ltNeg_);
    }
    if (gtPos_ != 0L) {
      output.writeInt64(3, gtPos_);
    }
    if (gtNeg_ != 0L) {
      output.writeInt64(4, gtNeg_);
    }
    if (ltePos_ != 0L) {
      output.writeInt64(5, ltePos_);
    }
    if (lteNeg_ != 0L) {
      output.writeInt64(6, lteNeg_);
    }
    if (gtePos_ != 0L) {
      output.writeInt64(7, gtePos_);
    }
    if (gteNeg_ != 0L) {
      output.writeInt64(8, gteNeg_);
    }
    if (constantPos_ != 0L) {
      output.writeInt64(9, constantPos_);
    }
    if (constantNeg_ != 0L) {
      output.writeInt64(10, constantNeg_);
    }
    if (in_ != 0L) {
      output.writeInt64(11, in_);
    }
    if (notin_ != 0L) {
      output.writeInt64(12, notin_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ltPos_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, ltPos_);
    }
    if (ltNeg_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, ltNeg_);
    }
    if (gtPos_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, gtPos_);
    }
    if (gtNeg_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, gtNeg_);
    }
    if (ltePos_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, ltePos_);
    }
    if (lteNeg_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, lteNeg_);
    }
    if (gtePos_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, gtePos_);
    }
    if (gteNeg_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, gteNeg_);
    }
    if (constantPos_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(9, constantPos_);
    }
    if (constantNeg_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(10, constantNeg_);
    }
    if (in_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(11, in_);
    }
    if (notin_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(12, notin_);
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
    if (!(obj instanceof build.buf.validate.conformance.cases.Int64BigConstraints)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.Int64BigConstraints other = (build.buf.validate.conformance.cases.Int64BigConstraints) obj;

    if (getLtPos()
        != other.getLtPos()) return false;
    if (getLtNeg()
        != other.getLtNeg()) return false;
    if (getGtPos()
        != other.getGtPos()) return false;
    if (getGtNeg()
        != other.getGtNeg()) return false;
    if (getLtePos()
        != other.getLtePos()) return false;
    if (getLteNeg()
        != other.getLteNeg()) return false;
    if (getGtePos()
        != other.getGtePos()) return false;
    if (getGteNeg()
        != other.getGteNeg()) return false;
    if (getConstantPos()
        != other.getConstantPos()) return false;
    if (getConstantNeg()
        != other.getConstantNeg()) return false;
    if (getIn()
        != other.getIn()) return false;
    if (getNotin()
        != other.getNotin()) return false;
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
    hash = (37 * hash) + LT_POS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLtPos());
    hash = (37 * hash) + LT_NEG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLtNeg());
    hash = (37 * hash) + GT_POS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGtPos());
    hash = (37 * hash) + GT_NEG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGtNeg());
    hash = (37 * hash) + LTE_POS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLtePos());
    hash = (37 * hash) + LTE_NEG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLteNeg());
    hash = (37 * hash) + GTE_POS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGtePos());
    hash = (37 * hash) + GTE_NEG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGteNeg());
    hash = (37 * hash) + CONSTANT_POS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getConstantPos());
    hash = (37 * hash) + CONSTANT_NEG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getConstantNeg());
    hash = (37 * hash) + IN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIn());
    hash = (37 * hash) + NOTIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNotin());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.Int64BigConstraints parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.Int64BigConstraints parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Int64BigConstraints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.Int64BigConstraints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Int64BigConstraints parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.Int64BigConstraints parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Int64BigConstraints parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.Int64BigConstraints parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.Int64BigConstraints parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.Int64BigConstraints parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Int64BigConstraints parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.Int64BigConstraints parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(build.buf.validate.conformance.cases.Int64BigConstraints prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code buf.validate.conformance.cases.Int64BigConstraints}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.Int64BigConstraints)
      build.buf.validate.conformance.cases.Int64BigConstraintsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.NumbersProto.internal_static_buf_validate_conformance_cases_Int64BigConstraints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.NumbersProto.internal_static_buf_validate_conformance_cases_Int64BigConstraints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.Int64BigConstraints.class, build.buf.validate.conformance.cases.Int64BigConstraints.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.Int64BigConstraints.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ltPos_ = 0L;
      ltNeg_ = 0L;
      gtPos_ = 0L;
      gtNeg_ = 0L;
      ltePos_ = 0L;
      lteNeg_ = 0L;
      gtePos_ = 0L;
      gteNeg_ = 0L;
      constantPos_ = 0L;
      constantNeg_ = 0L;
      in_ = 0L;
      notin_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.NumbersProto.internal_static_buf_validate_conformance_cases_Int64BigConstraints_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.Int64BigConstraints getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.Int64BigConstraints.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.Int64BigConstraints build() {
      build.buf.validate.conformance.cases.Int64BigConstraints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.Int64BigConstraints buildPartial() {
      build.buf.validate.conformance.cases.Int64BigConstraints result = new build.buf.validate.conformance.cases.Int64BigConstraints(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.Int64BigConstraints result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ltPos_ = ltPos_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ltNeg_ = ltNeg_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.gtPos_ = gtPos_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.gtNeg_ = gtNeg_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.ltePos_ = ltePos_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.lteNeg_ = lteNeg_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.gtePos_ = gtePos_;
      }
      if (((from_bitField0_ & 0x00000080) != 0)) {
        result.gteNeg_ = gteNeg_;
      }
      if (((from_bitField0_ & 0x00000100) != 0)) {
        result.constantPos_ = constantPos_;
      }
      if (((from_bitField0_ & 0x00000200) != 0)) {
        result.constantNeg_ = constantNeg_;
      }
      if (((from_bitField0_ & 0x00000400) != 0)) {
        result.in_ = in_;
      }
      if (((from_bitField0_ & 0x00000800) != 0)) {
        result.notin_ = notin_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.Int64BigConstraints) {
        return mergeFrom((build.buf.validate.conformance.cases.Int64BigConstraints)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.Int64BigConstraints other) {
      if (other == build.buf.validate.conformance.cases.Int64BigConstraints.getDefaultInstance()) return this;
      if (other.getLtPos() != 0L) {
        setLtPos(other.getLtPos());
      }
      if (other.getLtNeg() != 0L) {
        setLtNeg(other.getLtNeg());
      }
      if (other.getGtPos() != 0L) {
        setGtPos(other.getGtPos());
      }
      if (other.getGtNeg() != 0L) {
        setGtNeg(other.getGtNeg());
      }
      if (other.getLtePos() != 0L) {
        setLtePos(other.getLtePos());
      }
      if (other.getLteNeg() != 0L) {
        setLteNeg(other.getLteNeg());
      }
      if (other.getGtePos() != 0L) {
        setGtePos(other.getGtePos());
      }
      if (other.getGteNeg() != 0L) {
        setGteNeg(other.getGteNeg());
      }
      if (other.getConstantPos() != 0L) {
        setConstantPos(other.getConstantPos());
      }
      if (other.getConstantNeg() != 0L) {
        setConstantNeg(other.getConstantNeg());
      }
      if (other.getIn() != 0L) {
        setIn(other.getIn());
      }
      if (other.getNotin() != 0L) {
        setNotin(other.getNotin());
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
              ltPos_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              ltNeg_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              gtPos_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              gtNeg_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              ltePos_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              lteNeg_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              gtePos_ = input.readInt64();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
            case 64: {
              gteNeg_ = input.readInt64();
              bitField0_ |= 0x00000080;
              break;
            } // case 64
            case 72: {
              constantPos_ = input.readInt64();
              bitField0_ |= 0x00000100;
              break;
            } // case 72
            case 80: {
              constantNeg_ = input.readInt64();
              bitField0_ |= 0x00000200;
              break;
            } // case 80
            case 88: {
              in_ = input.readInt64();
              bitField0_ |= 0x00000400;
              break;
            } // case 88
            case 96: {
              notin_ = input.readInt64();
              bitField0_ |= 0x00000800;
              break;
            } // case 96
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

    private long ltPos_ ;
    /**
     * <pre>
     * Intentionally choose limits that are outside the range of both signed and unsigned 32-bit integers.
     * </pre>
     *
     * <code>int64 lt_pos = 1 [json_name = "ltPos", (.buf.validate.field) = { ... }</code>
     * @return The ltPos.
     */
    @java.lang.Override
    public long getLtPos() {
      return ltPos_;
    }
    /**
     * <pre>
     * Intentionally choose limits that are outside the range of both signed and unsigned 32-bit integers.
     * </pre>
     *
     * <code>int64 lt_pos = 1 [json_name = "ltPos", (.buf.validate.field) = { ... }</code>
     * @param value The ltPos to set.
     * @return This builder for chaining.
     */
    public Builder setLtPos(long value) {

      ltPos_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Intentionally choose limits that are outside the range of both signed and unsigned 32-bit integers.
     * </pre>
     *
     * <code>int64 lt_pos = 1 [json_name = "ltPos", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearLtPos() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ltPos_ = 0L;
      onChanged();
      return this;
    }

    private long ltNeg_ ;
    /**
     * <code>int64 lt_neg = 2 [json_name = "ltNeg", (.buf.validate.field) = { ... }</code>
     * @return The ltNeg.
     */
    @java.lang.Override
    public long getLtNeg() {
      return ltNeg_;
    }
    /**
     * <code>int64 lt_neg = 2 [json_name = "ltNeg", (.buf.validate.field) = { ... }</code>
     * @param value The ltNeg to set.
     * @return This builder for chaining.
     */
    public Builder setLtNeg(long value) {

      ltNeg_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 lt_neg = 2 [json_name = "ltNeg", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearLtNeg() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ltNeg_ = 0L;
      onChanged();
      return this;
    }

    private long gtPos_ ;
    /**
     * <code>int64 gt_pos = 3 [json_name = "gtPos", (.buf.validate.field) = { ... }</code>
     * @return The gtPos.
     */
    @java.lang.Override
    public long getGtPos() {
      return gtPos_;
    }
    /**
     * <code>int64 gt_pos = 3 [json_name = "gtPos", (.buf.validate.field) = { ... }</code>
     * @param value The gtPos to set.
     * @return This builder for chaining.
     */
    public Builder setGtPos(long value) {

      gtPos_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 gt_pos = 3 [json_name = "gtPos", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearGtPos() {
      bitField0_ = (bitField0_ & ~0x00000004);
      gtPos_ = 0L;
      onChanged();
      return this;
    }

    private long gtNeg_ ;
    /**
     * <code>int64 gt_neg = 4 [json_name = "gtNeg", (.buf.validate.field) = { ... }</code>
     * @return The gtNeg.
     */
    @java.lang.Override
    public long getGtNeg() {
      return gtNeg_;
    }
    /**
     * <code>int64 gt_neg = 4 [json_name = "gtNeg", (.buf.validate.field) = { ... }</code>
     * @param value The gtNeg to set.
     * @return This builder for chaining.
     */
    public Builder setGtNeg(long value) {

      gtNeg_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 gt_neg = 4 [json_name = "gtNeg", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearGtNeg() {
      bitField0_ = (bitField0_ & ~0x00000008);
      gtNeg_ = 0L;
      onChanged();
      return this;
    }

    private long ltePos_ ;
    /**
     * <code>int64 lte_pos = 5 [json_name = "ltePos", (.buf.validate.field) = { ... }</code>
     * @return The ltePos.
     */
    @java.lang.Override
    public long getLtePos() {
      return ltePos_;
    }
    /**
     * <code>int64 lte_pos = 5 [json_name = "ltePos", (.buf.validate.field) = { ... }</code>
     * @param value The ltePos to set.
     * @return This builder for chaining.
     */
    public Builder setLtePos(long value) {

      ltePos_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int64 lte_pos = 5 [json_name = "ltePos", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearLtePos() {
      bitField0_ = (bitField0_ & ~0x00000010);
      ltePos_ = 0L;
      onChanged();
      return this;
    }

    private long lteNeg_ ;
    /**
     * <code>int64 lte_neg = 6 [json_name = "lteNeg", (.buf.validate.field) = { ... }</code>
     * @return The lteNeg.
     */
    @java.lang.Override
    public long getLteNeg() {
      return lteNeg_;
    }
    /**
     * <code>int64 lte_neg = 6 [json_name = "lteNeg", (.buf.validate.field) = { ... }</code>
     * @param value The lteNeg to set.
     * @return This builder for chaining.
     */
    public Builder setLteNeg(long value) {

      lteNeg_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>int64 lte_neg = 6 [json_name = "lteNeg", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearLteNeg() {
      bitField0_ = (bitField0_ & ~0x00000020);
      lteNeg_ = 0L;
      onChanged();
      return this;
    }

    private long gtePos_ ;
    /**
     * <code>int64 gte_pos = 7 [json_name = "gtePos", (.buf.validate.field) = { ... }</code>
     * @return The gtePos.
     */
    @java.lang.Override
    public long getGtePos() {
      return gtePos_;
    }
    /**
     * <code>int64 gte_pos = 7 [json_name = "gtePos", (.buf.validate.field) = { ... }</code>
     * @param value The gtePos to set.
     * @return This builder for chaining.
     */
    public Builder setGtePos(long value) {

      gtePos_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>int64 gte_pos = 7 [json_name = "gtePos", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearGtePos() {
      bitField0_ = (bitField0_ & ~0x00000040);
      gtePos_ = 0L;
      onChanged();
      return this;
    }

    private long gteNeg_ ;
    /**
     * <code>int64 gte_neg = 8 [json_name = "gteNeg", (.buf.validate.field) = { ... }</code>
     * @return The gteNeg.
     */
    @java.lang.Override
    public long getGteNeg() {
      return gteNeg_;
    }
    /**
     * <code>int64 gte_neg = 8 [json_name = "gteNeg", (.buf.validate.field) = { ... }</code>
     * @param value The gteNeg to set.
     * @return This builder for chaining.
     */
    public Builder setGteNeg(long value) {

      gteNeg_ = value;
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     * <code>int64 gte_neg = 8 [json_name = "gteNeg", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearGteNeg() {
      bitField0_ = (bitField0_ & ~0x00000080);
      gteNeg_ = 0L;
      onChanged();
      return this;
    }

    private long constantPos_ ;
    /**
     * <code>int64 constant_pos = 9 [json_name = "constantPos", (.buf.validate.field) = { ... }</code>
     * @return The constantPos.
     */
    @java.lang.Override
    public long getConstantPos() {
      return constantPos_;
    }
    /**
     * <code>int64 constant_pos = 9 [json_name = "constantPos", (.buf.validate.field) = { ... }</code>
     * @param value The constantPos to set.
     * @return This builder for chaining.
     */
    public Builder setConstantPos(long value) {

      constantPos_ = value;
      bitField0_ |= 0x00000100;
      onChanged();
      return this;
    }
    /**
     * <code>int64 constant_pos = 9 [json_name = "constantPos", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearConstantPos() {
      bitField0_ = (bitField0_ & ~0x00000100);
      constantPos_ = 0L;
      onChanged();
      return this;
    }

    private long constantNeg_ ;
    /**
     * <code>int64 constant_neg = 10 [json_name = "constantNeg", (.buf.validate.field) = { ... }</code>
     * @return The constantNeg.
     */
    @java.lang.Override
    public long getConstantNeg() {
      return constantNeg_;
    }
    /**
     * <code>int64 constant_neg = 10 [json_name = "constantNeg", (.buf.validate.field) = { ... }</code>
     * @param value The constantNeg to set.
     * @return This builder for chaining.
     */
    public Builder setConstantNeg(long value) {

      constantNeg_ = value;
      bitField0_ |= 0x00000200;
      onChanged();
      return this;
    }
    /**
     * <code>int64 constant_neg = 10 [json_name = "constantNeg", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearConstantNeg() {
      bitField0_ = (bitField0_ & ~0x00000200);
      constantNeg_ = 0L;
      onChanged();
      return this;
    }

    private long in_ ;
    /**
     * <code>int64 in = 11 [json_name = "in", (.buf.validate.field) = { ... }</code>
     * @return The in.
     */
    @java.lang.Override
    public long getIn() {
      return in_;
    }
    /**
     * <code>int64 in = 11 [json_name = "in", (.buf.validate.field) = { ... }</code>
     * @param value The in to set.
     * @return This builder for chaining.
     */
    public Builder setIn(long value) {

      in_ = value;
      bitField0_ |= 0x00000400;
      onChanged();
      return this;
    }
    /**
     * <code>int64 in = 11 [json_name = "in", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearIn() {
      bitField0_ = (bitField0_ & ~0x00000400);
      in_ = 0L;
      onChanged();
      return this;
    }

    private long notin_ ;
    /**
     * <code>int64 notin = 12 [json_name = "notin", (.buf.validate.field) = { ... }</code>
     * @return The notin.
     */
    @java.lang.Override
    public long getNotin() {
      return notin_;
    }
    /**
     * <code>int64 notin = 12 [json_name = "notin", (.buf.validate.field) = { ... }</code>
     * @param value The notin to set.
     * @return This builder for chaining.
     */
    public Builder setNotin(long value) {

      notin_ = value;
      bitField0_ |= 0x00000800;
      onChanged();
      return this;
    }
    /**
     * <code>int64 notin = 12 [json_name = "notin", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearNotin() {
      bitField0_ = (bitField0_ & ~0x00000800);
      notin_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.Int64BigConstraints)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.Int64BigConstraints)
  private static final build.buf.validate.conformance.cases.Int64BigConstraints DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.Int64BigConstraints();
  }

  public static build.buf.validate.conformance.cases.Int64BigConstraints getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Int64BigConstraints>
      PARSER = new com.google.protobuf.AbstractParser<Int64BigConstraints>() {
    @java.lang.Override
    public Int64BigConstraints parsePartialFrom(
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

  public static com.google.protobuf.Parser<Int64BigConstraints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Int64BigConstraints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.Int64BigConstraints getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

