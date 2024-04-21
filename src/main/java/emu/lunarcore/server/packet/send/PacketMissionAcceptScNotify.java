package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.MissionAcceptScNotifyOuterClass.MissionAcceptScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketMissionAcceptScNotify extends BasePacket {

    public PacketMissionAcceptScNotify(int...subMissionIds) {
        super(CmdId.MissionAcceptScNotify);
        
        var data = MissionAcceptScNotify.newInstance()
            .addAllSubMissionIdList(subMissionIds);
        
        this.setData(data);
    }
}
