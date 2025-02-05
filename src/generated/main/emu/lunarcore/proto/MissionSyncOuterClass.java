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
import us.hebi.quickbuf.RepeatedInt;
import us.hebi.quickbuf.RepeatedMessage;

public final class MissionSyncOuterClass {
  /**
   * Protobuf type {@code MissionSync}
   */
  public static final class MissionSync extends ProtoMessage<MissionSync> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  BOKOEICFCAB
     * </pre>
     *
     * <code>repeated uint32 main_mission_id = 14;</code>
     */
    private final RepeatedInt mainMissionId = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated .Mission mission_list = 5;</code>
     */
    private final RepeatedMessage<MissionOuterClass.Mission> missionList = RepeatedMessage.newEmptyInstance(MissionOuterClass.Mission.getFactory());

    private MissionSync() {
    }

    /**
     * @return a new empty instance of {@code MissionSync}
     */
    public static MissionSync newInstance() {
      return new MissionSync();
    }

    /**
     * <pre>
     *  BOKOEICFCAB
     * </pre>
     *
     * <code>repeated uint32 main_mission_id = 14;</code>
     * @return whether the mainMissionId field is set
     */
    public boolean hasMainMissionId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  BOKOEICFCAB
     * </pre>
     *
     * <code>repeated uint32 main_mission_id = 14;</code>
     * @return this
     */
    public MissionSync clearMainMissionId() {
      bitField0_ &= ~0x00000001;
      mainMissionId.clear();
      return this;
    }

    /**
     * <pre>
     *  BOKOEICFCAB
     * </pre>
     *
     * <code>repeated uint32 main_mission_id = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMainMissionId()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getMainMissionId() {
      return mainMissionId;
    }

    /**
     * <pre>
     *  BOKOEICFCAB
     * </pre>
     *
     * <code>repeated uint32 main_mission_id = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableMainMissionId() {
      bitField0_ |= 0x00000001;
      return mainMissionId;
    }

    /**
     * <pre>
     *  BOKOEICFCAB
     * </pre>
     *
     * <code>repeated uint32 main_mission_id = 14;</code>
     * @param value the mainMissionId to add
     * @return this
     */
    public MissionSync addMainMissionId(final int value) {
      bitField0_ |= 0x00000001;
      mainMissionId.add(value);
      return this;
    }

    /**
     * <pre>
     *  BOKOEICFCAB
     * </pre>
     *
     * <code>repeated uint32 main_mission_id = 14;</code>
     * @param values the mainMissionId to add
     * @return this
     */
    public MissionSync addAllMainMissionId(final int... values) {
      bitField0_ |= 0x00000001;
      mainMissionId.addAll(values);
      return this;
    }

    /**
     * <code>repeated .Mission mission_list = 5;</code>
     * @return whether the missionList field is set
     */
    public boolean hasMissionList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .Mission mission_list = 5;</code>
     * @return this
     */
    public MissionSync clearMissionList() {
      bitField0_ &= ~0x00000002;
      missionList.clear();
      return this;
    }

    /**
     * <code>repeated .Mission mission_list = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMissionList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<MissionOuterClass.Mission> getMissionList() {
      return missionList;
    }

    /**
     * <code>repeated .Mission mission_list = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<MissionOuterClass.Mission> getMutableMissionList() {
      bitField0_ |= 0x00000002;
      return missionList;
    }

    /**
     * <code>repeated .Mission mission_list = 5;</code>
     * @param value the missionList to add
     * @return this
     */
    public MissionSync addMissionList(final MissionOuterClass.Mission value) {
      bitField0_ |= 0x00000002;
      missionList.add(value);
      return this;
    }

    /**
     * <code>repeated .Mission mission_list = 5;</code>
     * @param values the missionList to add
     * @return this
     */
    public MissionSync addAllMissionList(final MissionOuterClass.Mission... values) {
      bitField0_ |= 0x00000002;
      missionList.addAll(values);
      return this;
    }

    @Override
    public MissionSync copyFrom(final MissionSync other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        mainMissionId.copyFrom(other.mainMissionId);
        missionList.copyFrom(other.missionList);
      }
      return this;
    }

    @Override
    public MissionSync mergeFrom(final MissionSync other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMainMissionId()) {
        getMutableMainMissionId().addAll(other.mainMissionId);
      }
      if (other.hasMissionList()) {
        getMutableMissionList().addAll(other.missionList);
      }
      return this;
    }

    @Override
    public MissionSync clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mainMissionId.clear();
      missionList.clear();
      return this;
    }

    @Override
    public MissionSync clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mainMissionId.clear();
      missionList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof MissionSync)) {
        return false;
      }
      MissionSync other = (MissionSync) o;
      return bitField0_ == other.bitField0_
        && (!hasMainMissionId() || mainMissionId.equals(other.mainMissionId))
        && (!hasMissionList() || missionList.equals(other.missionList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < mainMissionId.length(); i++) {
          output.writeRawByte((byte) 112);
          output.writeUInt32NoTag(mainMissionId.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < missionList.length(); i++) {
          output.writeRawByte((byte) 42);
          output.writeMessageNoTag(missionList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * mainMissionId.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(mainMissionId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * missionList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(missionList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public MissionSync mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 114: {
            // mainMissionId [packed=true]
            input.readPackedUInt32(mainMissionId, tag);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // missionList
            tag = input.readRepeatedMessage(missionList, tag);
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
          case 112: {
            // mainMissionId [packed=false]
            tag = input.readRepeatedUInt32(mainMissionId, tag);
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedUInt32(FieldNames.mainMissionId, mainMissionId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.missionList, missionList);
      }
      output.endObject();
    }

    @Override
    public MissionSync mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1124848142:
          case 885892852: {
            if (input.isAtField(FieldNames.mainMissionId)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(mainMissionId);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1383006282:
          case -58851471: {
            if (input.isAtField(FieldNames.missionList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(missionList);
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
    public MissionSync clone() {
      return new MissionSync().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static MissionSync parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new MissionSync(), data).checkInitialized();
    }

    public static MissionSync parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MissionSync(), input).checkInitialized();
    }

    public static MissionSync parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MissionSync(), input).checkInitialized();
    }

    /**
     * @return factory for creating MissionSync messages
     */
    public static MessageFactory<MissionSync> getFactory() {
      return MissionSyncFactory.INSTANCE;
    }

    private enum MissionSyncFactory implements MessageFactory<MissionSync> {
      INSTANCE;

      @Override
      public MissionSync create() {
        return MissionSync.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName mainMissionId = FieldName.forField("mainMissionId", "main_mission_id");

      static final FieldName missionList = FieldName.forField("missionList", "mission_list");
    }
  }
}
