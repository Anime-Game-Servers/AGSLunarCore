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

public final class UpdateTrackMainMissionIdScRspOuterClass {
  /**
   * Protobuf type {@code UpdateTrackMainMissionIdScRsp}
   */
  public static final class UpdateTrackMainMissionIdScRsp extends ProtoMessage<UpdateTrackMainMissionIdScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 3;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 cur_mission_id = 5;</code>
     */
    private int curMissionId;

    /**
     * <code>optional uint32 unk_uint = 14;</code>
     */
    private int unkUint;

    private UpdateTrackMainMissionIdScRsp() {
    }

    /**
     * @return a new empty instance of {@code UpdateTrackMainMissionIdScRsp}
     */
    public static UpdateTrackMainMissionIdScRsp newInstance() {
      return new UpdateTrackMainMissionIdScRsp();
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return this
     */
    public UpdateTrackMainMissionIdScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @param value the retcode to set
     * @return this
     */
    public UpdateTrackMainMissionIdScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 cur_mission_id = 5;</code>
     * @return whether the curMissionId field is set
     */
    public boolean hasCurMissionId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 cur_mission_id = 5;</code>
     * @return this
     */
    public UpdateTrackMainMissionIdScRsp clearCurMissionId() {
      bitField0_ &= ~0x00000002;
      curMissionId = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_mission_id = 5;</code>
     * @return the curMissionId
     */
    public int getCurMissionId() {
      return curMissionId;
    }

    /**
     * <code>optional uint32 cur_mission_id = 5;</code>
     * @param value the curMissionId to set
     * @return this
     */
    public UpdateTrackMainMissionIdScRsp setCurMissionId(final int value) {
      bitField0_ |= 0x00000002;
      curMissionId = value;
      return this;
    }

    /**
     * <code>optional uint32 unk_uint = 14;</code>
     * @return whether the unkUint field is set
     */
    public boolean hasUnkUint() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 unk_uint = 14;</code>
     * @return this
     */
    public UpdateTrackMainMissionIdScRsp clearUnkUint() {
      bitField0_ &= ~0x00000004;
      unkUint = 0;
      return this;
    }

    /**
     * <code>optional uint32 unk_uint = 14;</code>
     * @return the unkUint
     */
    public int getUnkUint() {
      return unkUint;
    }

    /**
     * <code>optional uint32 unk_uint = 14;</code>
     * @param value the unkUint to set
     * @return this
     */
    public UpdateTrackMainMissionIdScRsp setUnkUint(final int value) {
      bitField0_ |= 0x00000004;
      unkUint = value;
      return this;
    }

    @Override
    public UpdateTrackMainMissionIdScRsp copyFrom(final UpdateTrackMainMissionIdScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        curMissionId = other.curMissionId;
        unkUint = other.unkUint;
      }
      return this;
    }

    @Override
    public UpdateTrackMainMissionIdScRsp mergeFrom(final UpdateTrackMainMissionIdScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasCurMissionId()) {
        setCurMissionId(other.curMissionId);
      }
      if (other.hasUnkUint()) {
        setUnkUint(other.unkUint);
      }
      return this;
    }

    @Override
    public UpdateTrackMainMissionIdScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      curMissionId = 0;
      unkUint = 0;
      return this;
    }

    @Override
    public UpdateTrackMainMissionIdScRsp clearQuick() {
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
      if (!(o instanceof UpdateTrackMainMissionIdScRsp)) {
        return false;
      }
      UpdateTrackMainMissionIdScRsp other = (UpdateTrackMainMissionIdScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasCurMissionId() || curMissionId == other.curMissionId)
        && (!hasUnkUint() || unkUint == other.unkUint);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(curMissionId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(unkUint);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curMissionId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(unkUint);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public UpdateTrackMainMissionIdScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // curMissionId
            curMissionId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // unkUint
            unkUint = input.readUInt32();
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.curMissionId, curMissionId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.unkUint, unkUint);
      }
      output.endObject();
    }

    @Override
    public UpdateTrackMainMissionIdScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -1870430873:
          case 50847757: {
            if (input.isAtField(FieldNames.curMissionId)) {
              if (!input.trySkipNullValue()) {
                curMissionId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -285591700:
          case -253820281: {
            if (input.isAtField(FieldNames.unkUint)) {
              if (!input.trySkipNullValue()) {
                unkUint = input.readUInt32();
                bitField0_ |= 0x00000004;
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
    public UpdateTrackMainMissionIdScRsp clone() {
      return new UpdateTrackMainMissionIdScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static UpdateTrackMainMissionIdScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new UpdateTrackMainMissionIdScRsp(), data).checkInitialized();
    }

    public static UpdateTrackMainMissionIdScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new UpdateTrackMainMissionIdScRsp(), input).checkInitialized();
    }

    public static UpdateTrackMainMissionIdScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new UpdateTrackMainMissionIdScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating UpdateTrackMainMissionIdScRsp messages
     */
    public static MessageFactory<UpdateTrackMainMissionIdScRsp> getFactory() {
      return UpdateTrackMainMissionIdScRspFactory.INSTANCE;
    }

    private enum UpdateTrackMainMissionIdScRspFactory implements MessageFactory<UpdateTrackMainMissionIdScRsp> {
      INSTANCE;

      @Override
      public UpdateTrackMainMissionIdScRsp create() {
        return UpdateTrackMainMissionIdScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName curMissionId = FieldName.forField("curMissionId", "cur_mission_id");

      static final FieldName unkUint = FieldName.forField("unkUint", "unk_uint");
    }
  }
}
