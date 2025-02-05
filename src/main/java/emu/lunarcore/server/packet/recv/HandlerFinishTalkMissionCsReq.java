package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.FinishTalkMissionCsReqOuterClass.FinishTalkMissionCsReq;
import emu.lunarcore.server.packet.send.PacketFinishTalkMissionScRsp;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;

@Opcodes(CmdId.FinishTalkMissionCsReq)
public class HandlerFinishTalkMissionCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = FinishTalkMissionCsReq.parseFrom(data);

        session.send(new PacketFinishTalkMissionScRsp(req, session.getPlayer()));
    }

}
