// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cv.proto

package ru.itis.hr_service.grpc.pb.cv;

/**
 * Protobuf type {@code CVResponse}
 */
public final class CVResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CVResponse)
    CVResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CVResponse.newBuilder() to construct.
  private CVResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CVResponse() {
    firstName_ = "";
    lastName_ = "";
    city_ = "";
    skills_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CVResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.itis.hr_service.grpc.pb.cv.Cv.internal_static_CVResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.itis.hr_service.grpc.pb.cv.Cv.internal_static_CVResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.itis.hr_service.grpc.pb.cv.CVResponse.class, ru.itis.hr_service.grpc.pb.cv.CVResponse.Builder.class);
  }

  public static final int FIRSTNAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object firstName_ = "";
  /**
   * <code>string firstName = 1;</code>
   * @return The firstName.
   */
  @java.lang.Override
  public java.lang.String getFirstName() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firstName_ = s;
      return s;
    }
  }
  /**
   * <code>string firstName = 1;</code>
   * @return The bytes for firstName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFirstNameBytes() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      firstName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LASTNAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object lastName_ = "";
  /**
   * <code>string lastName = 2;</code>
   * @return The lastName.
   */
  @java.lang.Override
  public java.lang.String getLastName() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastName_ = s;
      return s;
    }
  }
  /**
   * <code>string lastName = 2;</code>
   * @return The bytes for lastName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLastNameBytes() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lastName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CITY_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object city_ = "";
  /**
   * <code>string city = 3;</code>
   * @return The city.
   */
  @java.lang.Override
  public java.lang.String getCity() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      city_ = s;
      return s;
    }
  }
  /**
   * <code>string city = 3;</code>
   * @return The bytes for city.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCityBytes() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      city_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPERIENCE_FIELD_NUMBER = 4;
  private int experience_ = 0;
  /**
   * <code>int32 experience = 4;</code>
   * @return The experience.
   */
  @java.lang.Override
  public int getExperience() {
    return experience_;
  }

  public static final int SKILLS_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList skills_;
  /**
   * <code>repeated string skills = 5;</code>
   * @return A list containing the skills.
   */
  public com.google.protobuf.ProtocolStringList
      getSkillsList() {
    return skills_;
  }
  /**
   * <code>repeated string skills = 5;</code>
   * @return The count of skills.
   */
  public int getSkillsCount() {
    return skills_.size();
  }
  /**
   * <code>repeated string skills = 5;</code>
   * @param index The index of the element to return.
   * @return The skills at the given index.
   */
  public java.lang.String getSkills(int index) {
    return skills_.get(index);
  }
  /**
   * <code>repeated string skills = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the skills at the given index.
   */
  public com.google.protobuf.ByteString
      getSkillsBytes(int index) {
    return skills_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(firstName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, firstName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lastName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lastName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(city_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, city_);
    }
    if (experience_ != 0) {
      output.writeInt32(4, experience_);
    }
    for (int i = 0; i < skills_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, skills_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(firstName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, firstName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lastName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lastName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(city_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, city_);
    }
    if (experience_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, experience_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < skills_.size(); i++) {
        dataSize += computeStringSizeNoTag(skills_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSkillsList().size();
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
    if (!(obj instanceof ru.itis.hr_service.grpc.pb.cv.CVResponse)) {
      return super.equals(obj);
    }
    ru.itis.hr_service.grpc.pb.cv.CVResponse other = (ru.itis.hr_service.grpc.pb.cv.CVResponse) obj;

    if (!getFirstName()
        .equals(other.getFirstName())) return false;
    if (!getLastName()
        .equals(other.getLastName())) return false;
    if (!getCity()
        .equals(other.getCity())) return false;
    if (getExperience()
        != other.getExperience()) return false;
    if (!getSkillsList()
        .equals(other.getSkillsList())) return false;
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
    hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFirstName().hashCode();
    hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLastName().hashCode();
    hash = (37 * hash) + CITY_FIELD_NUMBER;
    hash = (53 * hash) + getCity().hashCode();
    hash = (37 * hash) + EXPERIENCE_FIELD_NUMBER;
    hash = (53 * hash) + getExperience();
    if (getSkillsCount() > 0) {
      hash = (37 * hash) + SKILLS_FIELD_NUMBER;
      hash = (53 * hash) + getSkillsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.itis.hr_service.grpc.pb.cv.CVResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.itis.hr_service.grpc.pb.cv.CVResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.itis.hr_service.grpc.pb.cv.CVResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.itis.hr_service.grpc.pb.cv.CVResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.itis.hr_service.grpc.pb.cv.CVResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.itis.hr_service.grpc.pb.cv.CVResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.itis.hr_service.grpc.pb.cv.CVResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.itis.hr_service.grpc.pb.cv.CVResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.itis.hr_service.grpc.pb.cv.CVResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.itis.hr_service.grpc.pb.cv.CVResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.itis.hr_service.grpc.pb.cv.CVResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.itis.hr_service.grpc.pb.cv.CVResponse parseFrom(
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
  public static Builder newBuilder(ru.itis.hr_service.grpc.pb.cv.CVResponse prototype) {
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
   * Protobuf type {@code CVResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CVResponse)
      ru.itis.hr_service.grpc.pb.cv.CVResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.itis.hr_service.grpc.pb.cv.Cv.internal_static_CVResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.itis.hr_service.grpc.pb.cv.Cv.internal_static_CVResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.itis.hr_service.grpc.pb.cv.CVResponse.class, ru.itis.hr_service.grpc.pb.cv.CVResponse.Builder.class);
    }

    // Construct using ru.itis.hr_service.grpc.pb.cv.CVResponse.newBuilder()
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
      firstName_ = "";
      lastName_ = "";
      city_ = "";
      experience_ = 0;
      skills_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.itis.hr_service.grpc.pb.cv.Cv.internal_static_CVResponse_descriptor;
    }

    @java.lang.Override
    public ru.itis.hr_service.grpc.pb.cv.CVResponse getDefaultInstanceForType() {
      return ru.itis.hr_service.grpc.pb.cv.CVResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ru.itis.hr_service.grpc.pb.cv.CVResponse build() {
      ru.itis.hr_service.grpc.pb.cv.CVResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.itis.hr_service.grpc.pb.cv.CVResponse buildPartial() {
      ru.itis.hr_service.grpc.pb.cv.CVResponse result = new ru.itis.hr_service.grpc.pb.cv.CVResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ru.itis.hr_service.grpc.pb.cv.CVResponse result) {
      if (((bitField0_ & 0x00000010) != 0)) {
        skills_ = skills_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.skills_ = skills_;
    }

    private void buildPartial0(ru.itis.hr_service.grpc.pb.cv.CVResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.firstName_ = firstName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lastName_ = lastName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.city_ = city_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.experience_ = experience_;
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
      if (other instanceof ru.itis.hr_service.grpc.pb.cv.CVResponse) {
        return mergeFrom((ru.itis.hr_service.grpc.pb.cv.CVResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.itis.hr_service.grpc.pb.cv.CVResponse other) {
      if (other == ru.itis.hr_service.grpc.pb.cv.CVResponse.getDefaultInstance()) return this;
      if (!other.getFirstName().isEmpty()) {
        firstName_ = other.firstName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getLastName().isEmpty()) {
        lastName_ = other.lastName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCity().isEmpty()) {
        city_ = other.city_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getExperience() != 0) {
        setExperience(other.getExperience());
      }
      if (!other.skills_.isEmpty()) {
        if (skills_.isEmpty()) {
          skills_ = other.skills_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureSkillsIsMutable();
          skills_.addAll(other.skills_);
        }
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
              firstName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              lastName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              city_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              experience_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureSkillsIsMutable();
              skills_.add(s);
              break;
            } // case 42
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

    private java.lang.Object firstName_ = "";
    /**
     * <code>string firstName = 1;</code>
     * @return The firstName.
     */
    public java.lang.String getFirstName() {
      java.lang.Object ref = firstName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string firstName = 1;</code>
     * @return The bytes for firstName.
     */
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string firstName = 1;</code>
     * @param value The firstName to set.
     * @return This builder for chaining.
     */
    public Builder setFirstName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      firstName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string firstName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstName() {
      firstName_ = getDefaultInstance().getFirstName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string firstName = 1;</code>
     * @param value The bytes for firstName to set.
     * @return This builder for chaining.
     */
    public Builder setFirstNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      firstName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object lastName_ = "";
    /**
     * <code>string lastName = 2;</code>
     * @return The lastName.
     */
    public java.lang.String getLastName() {
      java.lang.Object ref = lastName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lastName = 2;</code>
     * @return The bytes for lastName.
     */
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lastName = 2;</code>
     * @param value The lastName to set.
     * @return This builder for chaining.
     */
    public Builder setLastName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      lastName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string lastName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastName() {
      lastName_ = getDefaultInstance().getLastName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string lastName = 2;</code>
     * @param value The bytes for lastName to set.
     * @return This builder for chaining.
     */
    public Builder setLastNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      lastName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object city_ = "";
    /**
     * <code>string city = 3;</code>
     * @return The city.
     */
    public java.lang.String getCity() {
      java.lang.Object ref = city_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        city_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string city = 3;</code>
     * @return The bytes for city.
     */
    public com.google.protobuf.ByteString
        getCityBytes() {
      java.lang.Object ref = city_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        city_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string city = 3;</code>
     * @param value The city to set.
     * @return This builder for chaining.
     */
    public Builder setCity(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      city_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string city = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCity() {
      city_ = getDefaultInstance().getCity();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string city = 3;</code>
     * @param value The bytes for city to set.
     * @return This builder for chaining.
     */
    public Builder setCityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      city_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int experience_ ;
    /**
     * <code>int32 experience = 4;</code>
     * @return The experience.
     */
    @java.lang.Override
    public int getExperience() {
      return experience_;
    }
    /**
     * <code>int32 experience = 4;</code>
     * @param value The experience to set.
     * @return This builder for chaining.
     */
    public Builder setExperience(int value) {
      
      experience_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 experience = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExperience() {
      bitField0_ = (bitField0_ & ~0x00000008);
      experience_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList skills_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSkillsIsMutable() {
      if (!((bitField0_ & 0x00000010) != 0)) {
        skills_ = new com.google.protobuf.LazyStringArrayList(skills_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated string skills = 5;</code>
     * @return A list containing the skills.
     */
    public com.google.protobuf.ProtocolStringList
        getSkillsList() {
      return skills_.getUnmodifiableView();
    }
    /**
     * <code>repeated string skills = 5;</code>
     * @return The count of skills.
     */
    public int getSkillsCount() {
      return skills_.size();
    }
    /**
     * <code>repeated string skills = 5;</code>
     * @param index The index of the element to return.
     * @return The skills at the given index.
     */
    public java.lang.String getSkills(int index) {
      return skills_.get(index);
    }
    /**
     * <code>repeated string skills = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the skills at the given index.
     */
    public com.google.protobuf.ByteString
        getSkillsBytes(int index) {
      return skills_.getByteString(index);
    }
    /**
     * <code>repeated string skills = 5;</code>
     * @param index The index to set the value at.
     * @param value The skills to set.
     * @return This builder for chaining.
     */
    public Builder setSkills(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSkillsIsMutable();
      skills_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string skills = 5;</code>
     * @param value The skills to add.
     * @return This builder for chaining.
     */
    public Builder addSkills(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSkillsIsMutable();
      skills_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string skills = 5;</code>
     * @param values The skills to add.
     * @return This builder for chaining.
     */
    public Builder addAllSkills(
        java.lang.Iterable<java.lang.String> values) {
      ensureSkillsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, skills_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string skills = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkills() {
      skills_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string skills = 5;</code>
     * @param value The bytes of the skills to add.
     * @return This builder for chaining.
     */
    public Builder addSkillsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureSkillsIsMutable();
      skills_.add(value);
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


    // @@protoc_insertion_point(builder_scope:CVResponse)
  }

  // @@protoc_insertion_point(class_scope:CVResponse)
  private static final ru.itis.hr_service.grpc.pb.cv.CVResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.itis.hr_service.grpc.pb.cv.CVResponse();
  }

  public static ru.itis.hr_service.grpc.pb.cv.CVResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CVResponse>
      PARSER = new com.google.protobuf.AbstractParser<CVResponse>() {
    @java.lang.Override
    public CVResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CVResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CVResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.itis.hr_service.grpc.pb.cv.CVResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
