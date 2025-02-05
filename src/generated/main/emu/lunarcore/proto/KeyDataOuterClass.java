// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class KeyDataOuterClass {
  /**
   * Protobuf type {@code KeyData}
   */
  public static final class KeyData extends ProtoMessage<KeyData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint64 key = 8;</code>
     */
    private long key;

    /**
     * <code>optional uint32 id = 1;</code>
     */
    private int id;

    private KeyData() {
    }

    /**
     * @return a new empty instance of {@code KeyData}
     */
    public static KeyData newInstance() {
      return new KeyData();
    }

    /**
     * <code>optional uint64 key = 8;</code>
     * @return whether the key field is set
     */
    public boolean hasKey() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint64 key = 8;</code>
     * @return this
     */
    public KeyData clearKey() {
      bitField0_ &= ~0x00000001;
      key = 0L;
      return this;
    }

    /**
     * <code>optional uint64 key = 8;</code>
     * @return the key
     */
    public long getKey() {
      return key;
    }

    /**
     * <code>optional uint64 key = 8;</code>
     * @param value the key to set
     * @return this
     */
    public KeyData setKey(final long value) {
      bitField0_ |= 0x00000001;
      key = value;
      return this;
    }

    /**
     * <code>optional uint32 id = 1;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 id = 1;</code>
     * @return this
     */
    public KeyData clearId() {
      bitField0_ &= ~0x00000002;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 id = 1;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 id = 1;</code>
     * @param value the id to set
     * @return this
     */
    public KeyData setId(final int value) {
      bitField0_ |= 0x00000002;
      id = value;
      return this;
    }

    @Override
    public KeyData copyFrom(final KeyData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        key = other.key;
        id = other.id;
      }
      return this;
    }

    @Override
    public KeyData mergeFrom(final KeyData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasKey()) {
        setKey(other.key);
      }
      if (other.hasId()) {
        setId(other.id);
      }
      return this;
    }

    @Override
    public KeyData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      key = 0L;
      id = 0;
      return this;
    }

    @Override
    public KeyData clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof KeyData)) {
        return false;
      }
      KeyData other = (KeyData) o;
      return bitField0_ == other.bitField0_
        && (!hasKey() || key == other.key)
        && (!hasId() || id == other.id);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt64NoTag(key);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(id);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(key);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public KeyData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // key
            key = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 8) {
              break;
            }
          }
          case 8: {
            // id
            id = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt64(FieldNames.key, key);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.id, id);
      }
      output.endObject();
    }

    @Override
    public KeyData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 106079: {
            if (input.isAtField(FieldNames.key)) {
              if (!input.trySkipNullValue()) {
                key = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3355: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public KeyData clone() {
      return new KeyData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static KeyData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new KeyData(), data).checkInitialized();
    }

    public static KeyData parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new KeyData(), input).checkInitialized();
    }

    public static KeyData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new KeyData(), input).checkInitialized();
    }

    /**
     * @return factory for creating KeyData messages
     */
    public static MessageFactory<KeyData> getFactory() {
      return KeyDataFactory.INSTANCE;
    }

    private enum KeyDataFactory implements MessageFactory<KeyData> {
      INSTANCE;

      @Override
      public KeyData create() {
        return KeyData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName key = FieldName.forField("key");

      static final FieldName id = FieldName.forField("id");
    }
  }
}
