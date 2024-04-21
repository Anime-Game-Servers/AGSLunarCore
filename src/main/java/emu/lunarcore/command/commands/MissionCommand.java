package emu.lunarcore.command.commands;

import emu.lunarcore.data.config.MainMissionInfo;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.data.GameData;
import emu.lunarcore.util.Utils;
import emu.lunarcore.proto.MissionStatusOuterClass.MissionStatus;
import emu.lunarcore.server.packet.send.PacketMissionAcceptScNotify;
import emu.lunarcore.server.packet.send.PacketPlayerSyncScNotify;
import emu.lunarcore.server.packet.send.PacketStartFinishMainMissionScNotify;
import java.util.ArrayList;
import java.util.List;

@Command(label = "mission", aliases = {"mission", "startmission"}, permission = "player.mission", requireTarget = true, desc = "/mission {main missionid}. Starts a mission.")
public class MissionCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {

        Player target = args.getTarget();

        int missionId = Utils.parseSafeInt(args.get(0));

        if (!GameData.getMainMissionExcelMap().containsKey(missionId)) {
            args.sendMessage("Error: Invalid arguments");
        } else {
            if (target.getSubMissionId() != 0) {
                int prev_missionId = target.getMainMissionId();
                int prev_subMissionId = target.getSubMissionId();
                target.sendPacket(new PacketPlayerSyncScNotify(prev_missionId, prev_subMissionId, MissionStatus.MISSION_FINISH));
                target.sendPacket(new PacketStartFinishMainMissionScNotify(missionId));
            }
            MainMissionInfo missionInfo = GameData.getMainMissionInfos(missionId);

            if (missionInfo == null) {
                args.sendMessage("Error: missing resources for mission!");
                return;
            }

            List<Integer> subMissionIdsList = new ArrayList<>();

            if (missionInfo != null && missionInfo.getSubMissionList() != null) {
                for (MainMissionInfo.SubMissionInfo subMissionInfo : missionInfo.getSubMissionList()) {
                    subMissionIdsList.add(subMissionInfo.getId());
                }
            }

            int fistMission = missionInfo.getStartSubMissionList()[0];
            args.sendMessage("fistMission: "+fistMission);

            int[] subMissionIds = subMissionIdsList.stream().mapToInt(Integer::intValue).toArray();

            target.setMainMissionId(missionId);
            target.setSubMissionId(fistMission);

            target.sendPacket(new PacketMissionAcceptScNotify(subMissionIds));
            target.sendPacket(new PacketPlayerSyncScNotify(missionId, fistMission, MissionStatus.MISSION_DOING));

            args.sendMessage("Started Mission "+missionId);
        }
    }
}
