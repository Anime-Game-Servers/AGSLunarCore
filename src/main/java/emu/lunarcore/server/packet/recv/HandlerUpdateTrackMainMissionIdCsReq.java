package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.UpdateTrackMainMissionIdCsReqOuterClass.UpdateTrackMainMissionIdCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketUpdateTrackMainMissionIdScRsp;

@Opcodes(CmdId.UpdateTrackMainMissionIdCsReq)
public class HandlerUpdateTrackMainMissionIdCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = UpdateTrackMainMissionIdCsReq.parseFrom(data);
        
        if (req.hasCurMissionId()) {
            session.send(new PacketUpdateTrackMainMissionIdScRsp(req.getCurMissionId()));
        } else {
            session.send(CmdId.UpdateTrackMainMissionIdScRsp);
        }
    }

}
