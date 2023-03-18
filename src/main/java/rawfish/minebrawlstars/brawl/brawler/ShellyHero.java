package rawfish.minebrawlstars.brawl.brawler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fml.network.PacketDistributor;
import org.lwjgl.system.CallbackI;
import rawfish.minebrawlstars.brawl.Hero;
import rawfish.minebrawlstars.brawl.HeroFactory;
import rawfish.minebrawlstars.common.ChannelInit;
import rawfish.minebrawlstars.entity.EntityInit;
import rawfish.minebrawlstars.entity.brawl.ShellyAttackBulletEntity;
import rawfish.minebrawlstars.math.Matrix33;
import rawfish.minebrawlstars.math.Toolkit;
import rawfish.minebrawlstars.network.AttackAction;
import rawfish.minebrawlstars.network.BulletAction;

public class ShellyHero implements Hero {

    public HeroFactory factory;

    public ServerPlayerEntity player;

    @Override
    public HeroFactory getFactory() {
        return factory;
    }



    //base actions

    @Override
    public boolean attack(){
        emission(10);
        return true;
    }

    public void emission(double rot){
        ShellyAttackBulletEntity bullet;
        double mod=10;
        double xRot=player.xRot*Math.PI/180;
        double yRot=-player.yRot*Math.PI/180;

        //这个单位向量表示玩家正面向外 fv=Ry*Rx*Ez
        Vector3d fv=Toolkit.rotMatrix(Toolkit.axisY,yRot).multiply(
                Toolkit.rotMatrix(Toolkit.axisX,xRot).multiply(
                        Toolkit.axisZ));
        //这个单位向量表示玩家侧面向外 sv=Ry*Ex
        Vector3d sv=Toolkit.rotMatrix(Toolkit.axisY,yRot).multiply(
                Toolkit.axisX
        );
        //av=Rfv(90)*sv
        Vector3d av=Toolkit.rotMatrix(fv,Math.PI/2).multiply(
                sv
        );
        //am=Rav
        Matrix33 am=Toolkit.rotMatrix(av,rot*Math.PI/180);

        //修正起始位置
        fv=Toolkit.rotMatrix(av,-rot*Math.PI/90).multiply(fv);

        for(int i=0;i<5;i++) {
            Vector3d bulletSpeed=fv.scale(mod);
            bullet=new ShellyAttackBulletEntity(EntityInit.SHELLY_ATTACK_BULLET.get(),player.level);
            bullet.speed=bulletSpeed;
            bullet.basePosition=player.position();

            player.level.addFreshEntity(bullet);
            bullet.hasMove=true;

            fv=am.multiply(fv);
        }
    }
}
