package rawfish.minebrawlstars.network;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.fml.network.NetworkEvent;
import rawfish.minebrawlstars.entity.EntityInit;
import rawfish.minebrawlstars.entity.brawl.ShellyAttackBulletEntity;

import java.util.function.Supplier;

public class BulletAction {
    public Vector3d position;
    public Vector3d speed;
    public BulletAction(Vector3d positionin, Vector3d speedin){
        this.position=positionin;
        this.speed=speedin;
    }

    public static BulletAction decode(PacketBuffer buffer){
        BulletAction bulletAction=new BulletAction(null,null);
        bulletAction.position=new Vector3d(
                buffer.readDouble(),
                buffer.readDouble(),
                buffer.readDouble()
        );
        bulletAction.speed=new Vector3d(
                buffer.readDouble(),
                buffer.readDouble(),
                buffer.readDouble()
        );
        return bulletAction;
    }


    public void encode(PacketBuffer buffer){
        buffer.writeDouble(position.x);
        buffer.writeDouble(position.y);
        buffer.writeDouble(position.z);
        buffer.writeDouble(speed.x);
        buffer.writeDouble(speed.y);
        buffer.writeDouble(speed.z);
    }


    public static void handle(BulletAction mes, Supplier<NetworkEvent.Context> ctxSupplier) {
        ShellyAttackBulletEntity bulletEntity=new ShellyAttackBulletEntity(
                EntityInit.SHELLY_ATTACK_BULLET.get(),
                Minecraft.getInstance().player.clientLevel);

        bulletEntity.setPos(mes.position.x,mes.position.y,mes.position.z);
        bulletEntity.speed=mes.speed;

        Minecraft.getInstance().player.level.addFreshEntity(bulletEntity);

        bulletEntity.hasMove=true;


    }
}