// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class GetVideoVersionKeyCsReqOuterClass {
  /**
   * Protobuf type {@code GetVideoVersionKeyCsReq}
   */
  public static final class GetVideoVersionKeyCsReq extends ProtoMessage<GetVideoVersionKeyCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    private GetVideoVersionKeyCsReq() {
    }

    /**
     * @return a new empty instance of {@code GetVideoVersionKeyCsReq}
     */
    public static GetVideoVersionKeyCsReq newInstance() {
      return new GetVideoVersionKeyCsReq();
    }

    @Override
    public GetVideoVersionKeyCsReq copyFrom(final GetVideoVersionKeyCsReq other) {
      cachedSize = other.cachedSize;
      return this;
    }

    @Override
    public GetVideoVersionKeyCsReq mergeFrom(final GetVideoVersionKeyCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      return this;
    }

    @Override
    public GetVideoVersionKeyCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      return this;
    }

    @Override
    public GetVideoVersionKeyCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetVideoVersionKeyCsReq)) {
        return false;
      }
      GetVideoVersionKeyCsReq other = (GetVideoVersionKeyCsReq) o;
      return true;
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetVideoVersionKeyCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
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
      output.endObject();
    }

    @Override
    public GetVideoVersionKeyCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
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
    public GetVideoVersionKeyCsReq clone() {
      return new GetVideoVersionKeyCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetVideoVersionKeyCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetVideoVersionKeyCsReq(), data).checkInitialized();
    }

    public static GetVideoVersionKeyCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetVideoVersionKeyCsReq(), input).checkInitialized();
    }

    public static GetVideoVersionKeyCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetVideoVersionKeyCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetVideoVersionKeyCsReq messages
     */
    public static MessageFactory<GetVideoVersionKeyCsReq> getFactory() {
      return GetVideoVersionKeyCsReqFactory.INSTANCE;
    }

    private enum GetVideoVersionKeyCsReqFactory implements MessageFactory<GetVideoVersionKeyCsReq> {
      INSTANCE;

      @Override
      public GetVideoVersionKeyCsReq create() {
        return GetVideoVersionKeyCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
    }
  }
}
