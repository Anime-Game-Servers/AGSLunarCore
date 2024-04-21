package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.StartFinishMainMissionScNotifyOuterClass.StartFinishMainMissionScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketStartFinishMainMissionScNotify extends BasePacket {

    public PacketStartFinishMainMissionScNotify(int mainMissionId) {
        super(CmdId.StartFinishMainMissionScNotify);
        
        var data = StartFinishMainMissionScNotify.newInstance()
            .setMainMissionId(mainMissionId);
        
        this.setData(data);
    }
}
