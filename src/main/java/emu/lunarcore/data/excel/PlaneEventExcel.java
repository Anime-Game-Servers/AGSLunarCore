package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import emu.lunarcore.game.player.PlayerGender;
import lombok.Getter;

@Getter
@ResourceType(name = {"PlaneEvent.json"})
public class PlaneEventExcel extends GameResource {
    private int EventID;
    private int WorldLevel;
    private int StageID;

    @Override
    public int getId() {
        return (EventID << 8) + WorldLevel;
    }
    
    public int getEventId() {
        return EventID;
    }

    public int getStageId() {
        return StageID;
    }

}
