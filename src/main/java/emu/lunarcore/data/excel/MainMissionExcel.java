package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import lombok.Getter;

@Getter
@ResourceType(name = {"MainMission.json"})
public class MainMissionExcel extends GameResource {
    private int MainMissionID;
    private int RewardID;
    private String Type;

    @Override
    public int getId() {
        return MainMissionID;
    }
}
