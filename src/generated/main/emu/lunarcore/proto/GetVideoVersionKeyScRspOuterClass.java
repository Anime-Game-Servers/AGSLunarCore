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
import us.hebi.quickbuf.RepeatedMessage;

public final class GetVideoVersionKeyScRspOuterClass {
  /**
   * Protobuf type {@code GetVideoVersionKeyScRsp}
   */
  public static final class GetVideoVersionKeyScRsp extends ProtoMessage<GetVideoVersionKeyScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 2;</code>
     */
    private int retcode;

    /**
     * <code>repeated .KeyData keys = 7;</code>
     */
    private final RepeatedMessage<KeyDataOuterClass.KeyData> keys = RepeatedMessage.newEmptyInstance(KeyDataOuterClass.KeyData.getFactory());

    private GetVideoVersionKeyScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetVideoVersionKeyScRsp}
     */
    public static GetVideoVersionKeyScRsp newInstance() {
      return new GetVideoVersionKeyScRsp();
    }

    /**
     * <code>optional uint32 retcode = 2;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 2;</code>
     * @return this
     */
    public GetVideoVersionKeyScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 2;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 2;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetVideoVersionKeyScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .KeyData keys = 7;</code>
     * @return whether the keys field is set
     */
    public boolean hasKeys() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .KeyData keys = 7;</code>
     * @return this
     */
    public GetVideoVersionKeyScRsp clearKeys() {
      bitField0_ &= ~0x00000002;
      keys.clear();
      return this;
    }

    /**
     * <code>repeated .KeyData keys = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableKeys()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<KeyDataOuterClass.KeyData> getKeys() {
      return keys;
    }

    /**
     * <code>repeated .KeyData keys = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<KeyDataOuterClass.KeyData> getMutableKeys() {
      bitField0_ |= 0x00000002;
      return keys;
    }

    /**
     * <code>repeated .KeyData keys = 7;</code>
     * @param value the keys to add
     * @return this
     */
    public GetVideoVersionKeyScRsp addKeys(final KeyDataOuterClass.KeyData value) {
      bitField0_ |= 0x00000002;
      keys.add(value);
      return this;
    }

    /**
     * <code>repeated .KeyData keys = 7;</code>
     * @param values the keys to add
     * @return this
     */
    public GetVideoVersionKeyScRsp addAllKeys(final KeyDataOuterClass.KeyData... values) {
      bitField0_ |= 0x00000002;
      keys.addAll(values);
      return this;
    }

    @Override
    public GetVideoVersionKeyScRsp copyFrom(final GetVideoVersionKeyScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        keys.copyFrom(other.keys);
      }
      return this;
    }

    @Override
    public GetVideoVersionKeyScRsp mergeFrom(final GetVideoVersionKeyScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasKeys()) {
        getMutableKeys().addAll(other.keys);
      }
      return this;
    }

    @Override
    public GetVideoVersionKeyScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      keys.clear();
      return this;
    }

    @Override
    public GetVideoVersionKeyScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      keys.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetVideoVersionKeyScRsp)) {
        return false;
      }
      GetVideoVersionKeyScRsp other = (GetVideoVersionKeyScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasKeys() || keys.equals(other.keys));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < keys.length(); i++) {
          output.writeRawByte((byte) 58);
          output.writeMessageNoTag(keys.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * keys.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(keys);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetVideoVersionKeyScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // keys
            tag = input.readRepeatedMessage(keys, tag);
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.keys, keys);
      }
      output.endObject();
    }

    @Override
    public GetVideoVersionKeyScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3288564: {
            if (input.isAtField(FieldNames.keys)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(keys);
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
    public GetVideoVersionKeyScRsp clone() {
      return new GetVideoVersionKeyScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetVideoVersionKeyScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetVideoVersionKeyScRsp(), data).checkInitialized();
    }

    public static GetVideoVersionKeyScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetVideoVersionKeyScRsp(), input).checkInitialized();
    }

    public static GetVideoVersionKeyScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetVideoVersionKeyScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetVideoVersionKeyScRsp messages
     */
    public static MessageFactory<GetVideoVersionKeyScRsp> getFactory() {
      return GetVideoVersionKeyScRspFactory.INSTANCE;
    }

    private enum GetVideoVersionKeyScRspFactory implements MessageFactory<GetVideoVersionKeyScRsp> {
      INSTANCE;

      @Override
      public GetVideoVersionKeyScRsp create() {
        return GetVideoVersionKeyScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName keys = FieldName.forField("keys");
    }
  }
}
