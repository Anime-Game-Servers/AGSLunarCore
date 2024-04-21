package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.KeyDataOuterClass.KeyData;
import emu.lunarcore.proto.GetVideoVersionKeyScRspOuterClass.GetVideoVersionKeyScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;
import java.util.ArrayList;
import java.util.List;

public class PacketGetVideoVersionKeyScRsp extends BasePacket {

    public PacketGetVideoVersionKeyScRsp() {
        super(CmdId.GetVideoVersionKeyScRsp);

        // Have no choice
        List<KeyValuePair> keyPairs = new ArrayList<>();
        keyPairs.add(new KeyValuePair(3280, 2561596943881963L));
        keyPairs.add(new KeyValuePair(3270, 8879370645472013L));
        keyPairs.add(new KeyValuePair(3260, 2097603869107987L));
        keyPairs.add(new KeyValuePair(2440, 90220927L));
        keyPairs.add(new KeyValuePair(2420, 90220927L));
        keyPairs.add(new KeyValuePair(1222, 14220714L));
        keyPairs.add(new KeyValuePair(2580, 12230627L));
        keyPairs.add(new KeyValuePair(1221, 14220714L));
        keyPairs.add(new KeyValuePair(3140, 20231023L));
        keyPairs.add(new KeyValuePair(3180, 20231025L));
        keyPairs.add(new KeyValuePair(1190, 14220714L));
        keyPairs.add(new KeyValuePair(3130, 20230828L));
        keyPairs.add(new KeyValuePair(3160, 20230828L));
        keyPairs.add(new KeyValuePair(1170, 14220714L));
        keyPairs.add(new KeyValuePair(3110, 20230828L));
        keyPairs.add(new KeyValuePair(420, 16231009L));
        keyPairs.add(new KeyValuePair(1304, 13230706L));
        keyPairs.add(new KeyValuePair(3050, 20230828L));
        keyPairs.add(new KeyValuePair(411, 16231009L));
        keyPairs.add(new KeyValuePair(3030, 15230830L));
        keyPairs.add(new KeyValuePair(410, 16231009L));
        keyPairs.add(new KeyValuePair(390, 16231009L));
        keyPairs.add(new KeyValuePair(400, 16231009L));
        keyPairs.add(new KeyValuePair(2, 60220919L));
        keyPairs.add(new KeyValuePair(320, 11230119L));
        keyPairs.add(new KeyValuePair(1240, 14220714L));
        keyPairs.add(new KeyValuePair(3230, 1603427538481255L));
        keyPairs.add(new KeyValuePair(2450, 90220919L));
        keyPairs.add(new KeyValuePair(100, 12230601L));
        keyPairs.add(new KeyValuePair(3, 62220927L));
        keyPairs.add(new KeyValuePair(3010, 15230830L));
        keyPairs.add(new KeyValuePair(3301, 20231030L));
        keyPairs.add(new KeyValuePair(101, 12230601L));
        keyPairs.add(new KeyValuePair(4, 62220927L));
        keyPairs.add(new KeyValuePair(2720, 15230830L));
        keyPairs.add(new KeyValuePair(3302, 20231030L));
        keyPairs.add(new KeyValuePair(1224, 14220714L));
        keyPairs.add(new KeyValuePair(370, 16231009L));
        keyPairs.add(new KeyValuePair(1223, 14220714L));
        keyPairs.add(new KeyValuePair(350, 16231009L));
        keyPairs.add(new KeyValuePair(330, 16231009L));
        keyPairs.add(new KeyValuePair(3240, 5468538194758078L));
        keyPairs.add(new KeyValuePair(1, 60220919L));
        keyPairs.add(new KeyValuePair(2620, 13230602L));
        keyPairs.add(new KeyValuePair(2690, 15230830L));
        keyPairs.add(new KeyValuePair(302, 16230928L));
        keyPairs.add(new KeyValuePair(2630, 13230615L));
        keyPairs.add(new KeyValuePair(2460, 90220927L));
        keyPairs.add(new KeyValuePair(3120, 20230828L));
        keyPairs.add(new KeyValuePair(3150, 20230828L));
        keyPairs.add(new KeyValuePair(1160, 71220919L));
        keyPairs.add(new KeyValuePair(3100, 20231023L));
        keyPairs.add(new KeyValuePair(5, 62220927L));
        keyPairs.add(new KeyValuePair(21, 70220927L));
        keyPairs.add(new KeyValuePair(2640, 14220714L));
        keyPairs.add(new KeyValuePair(1180, 14220714L));
        keyPairs.add(new KeyValuePair(3170, 20230828L));
        keyPairs.add(new KeyValuePair(8, 70220919L));
        keyPairs.add(new KeyValuePair(2530, 11230119L));
        keyPairs.add(new KeyValuePair(310, 71220927L));
        keyPairs.add(new KeyValuePair(1230, 14220714L));
        keyPairs.add(new KeyValuePair(3220, 7306477623361936L));
        keyPairs.add(new KeyValuePair(340, 16231009L));
        keyPairs.add(new KeyValuePair(3250, 6314041275143045L));
        keyPairs.add(new KeyValuePair(360, 16231009L));
        keyPairs.add(new KeyValuePair(380, 16231009L));
        keyPairs.add(new KeyValuePair(2480, 90220927L));
        keyPairs.add(new KeyValuePair(301, 16230928L));
        keyPairs.add(new KeyValuePair(102, 12230601L));
        keyPairs.add(new KeyValuePair(2490, 90220927L));
        keyPairs.add(new KeyValuePair(361, 16231009L));
        keyPairs.add(new KeyValuePair(2550, 12230627L));
        keyPairs.add(new KeyValuePair(2560, 12230525L));
        keyPairs.add(new KeyValuePair(2570, 12230525L));
        keyPairs.add(new KeyValuePair(2660, 15230830L));
        keyPairs.add(new KeyValuePair(2670, 15230830L));
        keyPairs.add(new KeyValuePair(2680, 15230830L));
        keyPairs.add(new KeyValuePair(2302, 13230706L));
        keyPairs.add(new KeyValuePair(2700, 15230906L));
        keyPairs.add(new KeyValuePair(2701, 15230830L));
        keyPairs.add(new KeyValuePair(2710, 15230830L));
        keyPairs.add(new KeyValuePair(2730, 13230602L));
        keyPairs.add(new KeyValuePair(2740, 13230602L));
        keyPairs.add(new KeyValuePair(2750, 13230602L));
        keyPairs.add(new KeyValuePair(2760, 13230602L));
        keyPairs.add(new KeyValuePair(3020, 15230830L));
        keyPairs.add(new KeyValuePair(3040, 20230828L));
        keyPairs.add(new KeyValuePair(3060, 20231023L));
        keyPairs.add(new KeyValuePair(3070, 20230828L));
        keyPairs.add(new KeyValuePair(3080, 20230828L));
        keyPairs.add(new KeyValuePair(3090, 20230828L));
        keyPairs.add(new KeyValuePair(1200, 14220714L));
        keyPairs.add(new KeyValuePair(3190, 6934685122749340L));
        keyPairs.add(new KeyValuePair(7, 62220927L));
        keyPairs.add(new KeyValuePair(3191, 9082263766138238L));
        keyPairs.add(new KeyValuePair(1210, 14220714L));
        keyPairs.add(new KeyValuePair(16, 70220919L));
        keyPairs.add(new KeyValuePair(3200, 9030866044638228L));
        keyPairs.add(new KeyValuePair(1220, 14220714L));
        keyPairs.add(new KeyValuePair(3210, 6363892035972617L));
        
        var data = GetVideoVersionKeyScRsp.newInstance();
        
        for (KeyValuePair pair : keyPairs) {
            var keydata = KeyData.newInstance()
                .setId(pair.keyId)
                .setKey(pair.key);
            data.addKeys(keydata);
        }
        
        this.setData(data);
    }

    private static class KeyValuePair {
        int keyId;
        long key;

        KeyValuePair(int keyId, long key) {
            this.keyId = keyId;
            this.key = key;
        }
    }
}
