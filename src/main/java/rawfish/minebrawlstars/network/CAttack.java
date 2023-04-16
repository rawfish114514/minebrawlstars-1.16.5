package rawfish.minebrawlstars.network;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.PacketDistributor;
import rawfish.minebrawlstars.brawl.Hero;
import rawfish.minebrawlstars.common.ChannelInit;
import rawfish.minebrawlstars.network.sync.Vector3dIDataSerializer;
import rawfish.minebrawlstars.server.PlayerManager;

import java.util.function.Supplier;

public class CAttack {
    public int id;
    public Vector3d position;
    public double xRot;
    public double yRot;
    public double scale;
    public CAttack(int id,Vector3d position,double xRot,double yRot,double scale){
        this.id=id;
        this.position=position;
        this.xRot=xRot;
        this.yRot=yRot;
        this.scale=scale;
    }

    public static CAttack decode(PacketBuffer buffer){
        return new CAttack(
                buffer.readInt(),
                Vector3dIDataSerializer.SERIALIZER.read(buffer),
                buffer.readDouble(),
                buffer.readDouble(),
                buffer.readDouble()
        );
    }


    public void encode(PacketBuffer buffer){
        buffer.writeInt(id);
        Vector3dIDataSerializer.SERIALIZER.write(buffer,position);
        buffer.writeDouble(xRot);
        buffer.writeDouble(yRot);
        buffer.writeDouble(scale);
    }


    public static void handle(CAttack mes, Supplier<NetworkEvent.Context> ctxSupplier) {
        Hero hero=PlayerManager.playerMap.get(mes.id);
        if(hero!=null){
            hero.attack(mes.position, mes.xRot, mes.yRot, mes.scale);
            PlayerEntity player=hero.getPlayer();
            ChannelInit.simpleChannel.send(
                    PacketDistributor.TRACKING_CHUNK.with(
                            ()-> player.level.getChunk(
                                    (int)player.getX()>>4,
                                    (int)player.getZ()>>4))
                    ,new SAttack(mes.id,mes.position,mes.xRot,mes.yRot,mes.scale));
        }
    }
}
