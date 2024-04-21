package emu.lunarcore.data.config;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class MainMissionInfo {
    @SerializedName("MainMissionID")
    private int mainMissionID;
    
    @SerializedName("StartSubMissionList")
    private int[] startSubMissionList;
    
    @SerializedName("FinishSubMissionList")
    private int[] finishSubMissionList;
    
    @SerializedName("SubMissionList")
    private SubMissionInfo[] subMissionList;

    @Getter
    public static class SubMissionInfo {
        @SerializedName("ID")
        private int id;

        @SerializedName("MainMissionID")
        private int mainMissionID;
    }


    @Getter
    public static class MissionSimpleInfo {
        private int mainMissionID;
        private int[] startSubMissionList;
        private int[] finishSubMissionList;
        private SubMissionInfo[] subMissionList;
    }
}