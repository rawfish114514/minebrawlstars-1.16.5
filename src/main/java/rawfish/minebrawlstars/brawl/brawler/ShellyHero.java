package rawfish.minebrawlstars.brawl.brawler;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.vector.Vector3d;
import rawfish.minebrawlstars.brawl.AttackResult;
import rawfish.minebrawlstars.brawl.Hero;
import rawfish.minebrawlstars.brawl.HeroFactory;
import rawfish.minebrawlstars.client.PlayerManager;
import rawfish.minebrawlstars.entity.EntityInit;
import rawfish.minebrawlstars.entity.EntityPut;
import rawfish.minebrawlstars.entity.brawl.ShellyAttackBulletEntity;
import rawfish.minebrawlstars.item.util.SoundInit;
import rawfish.minebrawlstars.math.Matrix33;
import rawfish.minebrawlstars.math.Toolkit;

public class ShellyHero implements Hero {

    public HeroFactory factory;

    public PlayerEntity player;

    @Override
    public HeroFactory getFactory() {
        return factory;
    }



    //base actions

    @Override
    public AttackResult attack(Vector3d position, double xRot, double yRot, double scale){
        emission(10,position,xRot,yRot);
        if(player.level.isClientSide) {
            player.level.playSound(
                    PlayerManager.thisPlayer,
                    player.blockPosition(),
                    SoundInit.SHELLY_ATTACK.get(),
                    SoundCategory.VOICE, 1, (float) player.position().distanceTo(PlayerManager.thisPlayer.position()));
        }
        return null;
    }

    @Override
    public PlayerEntity getPlayer(){
        return player;
    }

    public void emission(double rot,Vector3d position,double xRot,double yRot){
        ShellyAttackBulletEntity bullet;
        double mod=10;

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
            bullet.basePosition=position;
            bullet.setPos(position.x,position.y,position.z);

            if(player.level.isClientSide){
                EntityPut.addRenderEntity(player.level,bullet);
            }else{
                EntityPut.addServerEntity(player.level,bullet);
            }
            bullet.hasMove=true;

            fv=am.multiply(fv);
        }
    }
}
