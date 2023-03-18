package rawfish.minebrawlstars.client;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.OutlineLayerBuffer;
import net.minecraft.client.renderer.RenderTypeBuffers;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import rawfish.minebrawlstars.brawl.Hero;
import rawfish.minebrawlstars.common.ChannelInit;
import rawfish.minebrawlstars.entity.EntityInit;
import rawfish.minebrawlstars.entity.brawl.ShellyAttackBulletEntity;
import rawfish.minebrawlstars.item.brawler.AttackItem;
import rawfish.minebrawlstars.math.Matrix33;
import rawfish.minebrawlstars.math.Toolkit;
import rawfish.minebrawlstars.network.AttackAction;
import rawfish.minebrawlstars.render.renderer.item.ShellyAttackBulletRenderer;
import rawfish.minebrawlstars.server.PlayerManager;

/**
 * 玩家所有行为都在此监听并加工发送给服务端处理
 */
@OnlyIn(Dist.CLIENT)
public class EventListener {
    public static Minecraft minecraft=Minecraft.getInstance();
    public static void register(IEventBus eventBus){
        eventBus.register(rawfish.minebrawlstars.client.EventListener.class);
    }

    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event){
        PlayerEntity player=event.getPlayer();
        if(player instanceof ClientPlayerEntity){
            ItemStack itemStack=event.getItemStack();
            if(itemStack.getItem() instanceof AttackItem){
                //ChannelInit.simpleChannel.sendToServer(new AttackAction(entity.getId()));

                System.out.println("攻击行为: "+player.getDisplayName().getString());
                double rot=10;
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


                    ClientWorld clientWorld=(ClientWorld)player.level;
                    int c=1000;
                    while(true) {
                        Entity entity = clientWorld.getEntity(c);
                        if(entity==null){
                            break;
                        }else{
                            c++;
                        }
                    }
                    System.out.println(c);
                    clientWorld.putNonPlayerEntity(c,bullet);
                    bullet.hasMove=true;

                    fv=am.multiply(fv);
                }


            }
        }


    }
}
