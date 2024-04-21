package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.UpdateTrackMainMissionIdScRspOuterClass.UpdateTrackMainMissionIdScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketUpdateTrackMainMissionIdScRsp extends BasePacket {

    public PacketUpdateTrackMainMissionIdScRsp(int id) {
        super(CmdId.UpdateTrackMainMissionIdScRsp);
        
        var data = UpdateTrackMainMissionIdScRsp.newInstance()
            .setCurMissionId(id);
        
        this.setData(data);
    }
}
