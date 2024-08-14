// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/enums.proto
// Protobuf Java Version: 4.27.3

package build.buf.validate.conformance.cases;

/**
 * Protobuf enum {@code buf.validate.conformance.cases.TestEnum}
 */
public enum TestEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TEST_ENUM_UNSPECIFIED = 0;</code>
   */
  TEST_ENUM_UNSPECIFIED(0),
  /**
   * <code>TEST_ENUM_ONE = 1;</code>
   */
  TEST_ENUM_ONE(1),
  /**
   * <code>TEST_ENUM_TWO = 2;</code>
   */
  TEST_ENUM_TWO(2),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      TestEnum.class.getName());
  }
  /**
   * <code>TEST_ENUM_UNSPECIFIED = 0;</code>
   */
  public static final int TEST_ENUM_UNSPECIFIED_VALUE = 0;
  /**
   * <code>TEST_ENUM_ONE = 1;</code>
   */
  public static final int TEST_ENUM_ONE_VALUE = 1;
  /**
   * <code>TEST_ENUM_TWO = 2;</code>
   */
  public static final int TEST_ENUM_TWO_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TestEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TestEnum forNumber(int value) {
    switch (value) {
      case 0: return TEST_ENUM_UNSPECIFIED;
      case 1: return TEST_ENUM_ONE;
      case 2: return TEST_ENUM_TWO;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TestEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TestEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TestEnum>() {
          public TestEnum findValueByNumber(int number) {
            return TestEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.EnumsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TestEnum[] VALUES = values();

  public static TestEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TestEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:buf.validate.conformance.cases.TestEnum)
}

