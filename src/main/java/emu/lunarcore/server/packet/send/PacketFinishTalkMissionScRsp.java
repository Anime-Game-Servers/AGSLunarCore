package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.FinishTalkMissionCsReqOuterClass.FinishTalkMissionCsReq;
import emu.lunarcore.proto.FinishTalkMissionScRspOuterClass.FinishTalkMissionScRsp;
import emu.lunarcore.proto.MissionStatusOuterClass.MissionStatus;
import emu.lunarcore.server.packet.send.PacketStartFinishMainMissionScNotify;
import emu.lunarcore.data.config.MainMissionInfo;
import emu.lunarcore.data.GameData;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketFinishTalkMissionScRsp extends BasePacket {

    public PacketFinishTalkMissionScRsp(FinishTalkMissionCsReq req, Player target) {
        super(CmdId.FinishTalkMissionScRsp);

        int submissionid = req.getSubMissionId();
        if (submissionid != target.getSubMissionId()) {
            submissionid = Integer.valueOf(req.getTalkStr().replace("Mission_", ""));
        }

        int nextSubMissionId = getNextMissionId(target, submissionid);

        if (nextSubMissionId != 0) {
            target.setSubMissionId(nextSubMissionId);
            target.sendPacket(new PacketPlayerSyncScNotify(target.getMainMissionId(), submissionid, MissionStatus.MISSION_FINISH));
            target.sendPacket(new PacketPlayerSyncScNotify(target.getMainMissionId(), nextSubMissionId, MissionStatus.MISSION_DOING));
        } else {
            target.sendPacket(new PacketStartFinishMainMissionScNotify(target.getMainMissionId()));
            target.sendPacket(new PacketPlayerSyncScNotify(target.getMainMissionId(), submissionid, MissionStatus.MISSION_FINISH));
            target.setMainMissionId(0);
            target.setSubMissionId(0);
        }

        

        var data = FinishTalkMissionScRsp.newInstance()
            .setSubMissionId(submissionid)
            .setTalkStr(req.getTalkStr());
        
        for (var item : req.getCustomValueList()) {
            data.addCustomValueList(item);
        }

        this.setData(data);
    }

    private int getNextMissionId(Player target, int submissionid) {
        int nextId = 0;
        MainMissionInfo missionInfo = GameData.getMainMissionInfos(target.getMainMissionId());
        for (MainMissionInfo.SubMissionInfo subMissionInfo : missionInfo.getSubMissionList()) {
            if (subMissionInfo.getTakeParamIntList() == null) {
                continue;
            }
            if (subMissionInfo.getTakeParamIntList()[0] == submissionid) {
                nextId = subMissionInfo.getId();
            }
        }
        return nextId;
    }
}
