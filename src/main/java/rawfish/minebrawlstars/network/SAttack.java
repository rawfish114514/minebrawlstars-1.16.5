package rawfish.minebrawlstars.network;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.fml.network.NetworkEvent;
import rawfish.minebrawlstars.brawl.Hero;
import rawfish.minebrawlstars.client.PlayerManager;
import rawfish.minebrawlstars.item.util.SoundInit;
import rawfish.minebrawlstars.network.sync.Vector3dIDataSerializer;

import java.util.function.Supplier;

public class SAttack {
    public int id;
    public Vector3d position;
    public double xRot;
    public double yRot;
    public double scale;
    public SAttack(int id,Vector3d position,double xRot,double yRot,double scale){
        this.id=id;
        this.position=position;
        this.xRot=xRot;
        this.yRot=yRot;
        this.scale=scale;
    }

    public static SAttack decode(PacketBuffer buffer){
        return new SAttack(
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


    public static void handle(SAttack mes, Supplier<NetworkEvent.Context> ctxSupplier) {
        if(mes.id!=PlayerManager.thisPlayer.getId()) {
            handleImplement(mes,ctxSupplier);
        }
    }

    public static void handleImplement(SAttack mes, Supplier<NetworkEvent.Context> ctxSupplier){
        Hero hero = PlayerManager.playerMap.get(mes.id);
        if (hero != null) {
            hero.attack(mes.position, mes.xRot, mes.yRot, mes.scale);
        }
    }
}
