// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iquan.proto

package com.taobao.search.iquan.client.common.pb;

/**
 * Protobuf type {@code iquan.pb.AnyValueMap}
 */
public  final class AnyValueMap extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iquan.pb.AnyValueMap)
    AnyValueMapOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnyValueMap.newBuilder() to construct.
  private AnyValueMap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnyValueMap() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnyValueMap();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnyValueMap(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              value_ = com.google.protobuf.MapField.newMapField(
                  ValueDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue>
            value__ = input.readMessage(
                ValueDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            value_.getMutableMap().put(
                value__.getKey(), value__.getValue());
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.taobao.search.iquan.client.common.pb.Iquan.internal_static_iquan_pb_AnyValueMap_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetValue();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.taobao.search.iquan.client.common.pb.Iquan.internal_static_iquan_pb_AnyValueMap_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.taobao.search.iquan.client.common.pb.AnyValueMap.class, com.taobao.search.iquan.client.common.pb.AnyValueMap.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private static final class ValueDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue>newDefaultInstance(
                com.taobao.search.iquan.client.common.pb.Iquan.internal_static_iquan_pb_AnyValueMap_ValueEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.taobao.search.iquan.client.common.pb.AnyValue.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue> value_;
  private com.google.protobuf.MapField<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue>
  internalGetValue() {
    if (value_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ValueDefaultEntryHolder.defaultEntry);
    }
    return value_;
  }

  public int getValueCount() {
    return internalGetValue().getMap().size();
  }
  /**
   * <code>map&lt;string, .iquan.pb.AnyValue&gt; value = 1;</code>
   */

  public boolean containsValue(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetValue().getMap().containsKey(key);
  }
  /**
   * Use {@link #getValueMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue> getValue() {
    return getValueMap();
  }
  /**
   * <code>map&lt;string, .iquan.pb.AnyValue&gt; value = 1;</code>
   */

  public java.util.Map<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue> getValueMap() {
    return internalGetValue().getMap();
  }
  /**
   * <code>map&lt;string, .iquan.pb.AnyValue&gt; value = 1;</code>
   */

  public com.taobao.search.iquan.client.common.pb.AnyValue getValueOrDefault(
      java.lang.String key,
      com.taobao.search.iquan.client.common.pb.AnyValue defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue> map =
        internalGetValue().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .iquan.pb.AnyValue&gt; value = 1;</code>
   */

  public com.taobao.search.iquan.client.common.pb.AnyValue getValueOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue> map =
        internalGetValue().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetValue(),
        ValueDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue> entry
         : internalGetValue().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue>
      value__ = ValueDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, value__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.taobao.search.iquan.client.common.pb.AnyValueMap)) {
      return super.equals(obj);
    }
    com.taobao.search.iquan.client.common.pb.AnyValueMap other = (com.taobao.search.iquan.client.common.pb.AnyValueMap) obj;

    if (!internalGetValue().equals(
        other.internalGetValue())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetValue().getMap().isEmpty()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.taobao.search.iquan.client.common.pb.AnyValueMap parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.taobao.search.iquan.client.common.pb.AnyValueMap parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.taobao.search.iquan.client.common.pb.AnyValueMap parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.taobao.search.iquan.client.common.pb.AnyValueMap parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.taobao.search.iquan.client.common.pb.AnyValueMap parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.taobao.search.iquan.client.common.pb.AnyValueMap parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.taobao.search.iquan.client.common.pb.AnyValueMap parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.taobao.search.iquan.client.common.pb.AnyValueMap parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.taobao.search.iquan.client.common.pb.AnyValueMap parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.taobao.search.iquan.client.common.pb.AnyValueMap parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.taobao.search.iquan.client.common.pb.AnyValueMap parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.taobao.search.iquan.client.common.pb.AnyValueMap parseFrom(
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
  public static Builder newBuilder(com.taobao.search.iquan.client.common.pb.AnyValueMap prototype) {
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
   * Protobuf type {@code iquan.pb.AnyValueMap}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iquan.pb.AnyValueMap)
      com.taobao.search.iquan.client.common.pb.AnyValueMapOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.taobao.search.iquan.client.common.pb.Iquan.internal_static_iquan_pb_AnyValueMap_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetValue();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableValue();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.taobao.search.iquan.client.common.pb.Iquan.internal_static_iquan_pb_AnyValueMap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.taobao.search.iquan.client.common.pb.AnyValueMap.class, com.taobao.search.iquan.client.common.pb.AnyValueMap.Builder.class);
    }

    // Construct using com.taobao.search.iquan.client.common.pb.AnyValueMap.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableValue().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.taobao.search.iquan.client.common.pb.Iquan.internal_static_iquan_pb_AnyValueMap_descriptor;
    }

    @java.lang.Override
    public com.taobao.search.iquan.client.common.pb.AnyValueMap getDefaultInstanceForType() {
      return com.taobao.search.iquan.client.common.pb.AnyValueMap.getDefaultInstance();
    }

    @java.lang.Override
    public com.taobao.search.iquan.client.common.pb.AnyValueMap build() {
      com.taobao.search.iquan.client.common.pb.AnyValueMap result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.taobao.search.iquan.client.common.pb.AnyValueMap buildPartial() {
      com.taobao.search.iquan.client.common.pb.AnyValueMap result = new com.taobao.search.iquan.client.common.pb.AnyValueMap(this);
      int from_bitField0_ = bitField0_;
      result.value_ = internalGetValue();
      result.value_.makeImmutable();
      onBuilt();
      return result;
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
      if (other instanceof com.taobao.search.iquan.client.common.pb.AnyValueMap) {
        return mergeFrom((com.taobao.search.iquan.client.common.pb.AnyValueMap)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.taobao.search.iquan.client.common.pb.AnyValueMap other) {
      if (other == com.taobao.search.iquan.client.common.pb.AnyValueMap.getDefaultInstance()) return this;
      internalGetMutableValue().mergeFrom(
          other.internalGetValue());
      this.mergeUnknownFields(other.unknownFields);
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
      com.taobao.search.iquan.client.common.pb.AnyValueMap parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.taobao.search.iquan.client.common.pb.AnyValueMap) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue> value_;
    private com.google.protobuf.MapField<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue>
    internalGetValue() {
      if (value_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ValueDefaultEntryHolder.defaultEntry);
      }
      return value_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue>
    internalGetMutableValue() {
      onChanged();;
      if (value_ == null) {
        value_ = com.google.protobuf.MapField.newMapField(
            ValueDefaultEntryHolder.defaultEntry);
      }
      if (!value_.isMutable()) {
        value_ = value_.copy();
      }
      return value_;
    }

    public int getValueCount() {
      return internalGetValue().getMap().size();
    }
    /**
     * <code>map&lt;string, .iquan.pb.AnyValue&gt; value = 1;</code>
     */

    public boolean containsValue(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetValue().getMap().containsKey(key);
    }
    /**
     * Use {@link #getValueMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue> getValue() {
      return getValueMap();
    }
    /**
     * <code>map&lt;string, .iquan.pb.AnyValue&gt; value = 1;</code>
     */

    public java.util.Map<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue> getValueMap() {
      return internalGetValue().getMap();
    }
    /**
     * <code>map&lt;string, .iquan.pb.AnyValue&gt; value = 1;</code>
     */

    public com.taobao.search.iquan.client.common.pb.AnyValue getValueOrDefault(
        java.lang.String key,
        com.taobao.search.iquan.client.common.pb.AnyValue defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue> map =
          internalGetValue().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .iquan.pb.AnyValue&gt; value = 1;</code>
     */

    public com.taobao.search.iquan.client.common.pb.AnyValue getValueOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue> map =
          internalGetValue().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearValue() {
      internalGetMutableValue().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .iquan.pb.AnyValue&gt; value = 1;</code>
     */

    public Builder removeValue(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableValue().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue>
    getMutableValue() {
      return internalGetMutableValue().getMutableMap();
    }
    /**
     * <code>map&lt;string, .iquan.pb.AnyValue&gt; value = 1;</code>
     */
    public Builder putValue(
        java.lang.String key,
        com.taobao.search.iquan.client.common.pb.AnyValue value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableValue().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .iquan.pb.AnyValue&gt; value = 1;</code>
     */

    public Builder putAllValue(
        java.util.Map<java.lang.String, com.taobao.search.iquan.client.common.pb.AnyValue> values) {
      internalGetMutableValue().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:iquan.pb.AnyValueMap)
  }

  // @@protoc_insertion_point(class_scope:iquan.pb.AnyValueMap)
  private static final com.taobao.search.iquan.client.common.pb.AnyValueMap DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.taobao.search.iquan.client.common.pb.AnyValueMap();
  }

  public static com.taobao.search.iquan.client.common.pb.AnyValueMap getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnyValueMap>
      PARSER = new com.google.protobuf.AbstractParser<AnyValueMap>() {
    @java.lang.Override
    public AnyValueMap parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AnyValueMap(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnyValueMap> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnyValueMap> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.taobao.search.iquan.client.common.pb.AnyValueMap getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
