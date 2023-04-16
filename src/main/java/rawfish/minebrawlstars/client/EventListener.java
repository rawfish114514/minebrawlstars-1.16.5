package rawfish.minebrawlstars.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.EntityLeaveWorldEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import rawfish.minebrawlstars.common.ChannelInit;
import rawfish.minebrawlstars.item.brawler.AttackItem;
import rawfish.minebrawlstars.network.CAttack;
import rawfish.minebrawlstars.network.SAttack;

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
                //server
                ChannelInit.simpleChannel.sendToServer(new CAttack(
                        player.getId(),
                        player.position().add(0,1,0),
                        player.xRot*Math.PI/180,
                        -player.yRot*Math.PI/180,
                        1
                ));

                //client
                SAttack.handleImplement(new SAttack(
                        player.getId(),
                        player.position().add(0,1,0),
                        player.xRot*Math.PI/180,
                        -player.yRot*Math.PI/180,
                        1
                ),null);

            }
        }
    }

    @SubscribeEvent
    public static void onEntityJoinWorldEvent(EntityJoinWorldEvent event){
        Entity entity=event.getEntity();
        if(entity instanceof AbstractClientPlayerEntity){
            onPlayerJoinWorldEvent((AbstractClientPlayerEntity)entity);
        }
    }

    @SubscribeEvent
    public static void onEntityLeaveWorldEvent(EntityLeaveWorldEvent event){
        Entity entity=event.getEntity();
        if(entity instanceof AbstractClientPlayerEntity){
            onPlayerLeaveWorldEvent((AbstractClientPlayerEntity)entity);
        }
    }

    @SubscribeEvent
    public static void onClientTickEvent(TickEvent.ClientTickEvent event){
        PlayerManager.revalue();
    }

    public static void onPlayerJoinWorldEvent(AbstractClientPlayerEntity player){
        PlayerManager.add(player);
    }

    public static void onPlayerLeaveWorldEvent(AbstractClientPlayerEntity player){
        PlayerManager.remove(player);
    }
}
