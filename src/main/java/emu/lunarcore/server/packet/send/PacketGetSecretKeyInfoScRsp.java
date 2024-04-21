package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.GetSecretKeyInfoScRspOuterClass.GetSecretKeyInfoScRsp;
import emu.lunarcore.proto.GetSecretKeyInfoScRspOuterClass.GetSecretKeyInfoScRsp.SecretKey;
import emu.lunarcore.proto.GetSecretKeyInfoScRspOuterClass.GetSecretKeyInfoScRsp.SecretKeyType;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetSecretKeyInfoScRsp extends BasePacket {

    public PacketGetSecretKeyInfoScRsp() {
        super(CmdId.GetSecretKeyInfoScRsp);
        
        var data = GetSecretKeyInfoScRsp.newInstance()
            .addSecretKeys(
                SecretKey.newInstance()
                    .setType(SecretKeyType.SECRET_KEY_VIDEO)
                    .setSecretKey("10120425825329403")
            );
    
        this.setData(data);
    }
}
