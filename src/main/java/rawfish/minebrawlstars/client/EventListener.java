package rawfish.minebrawlstars.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import rawfish.minebrawlstars.common.ChannelInit;
import rawfish.minebrawlstars.item.brawler.AttackItem;
import rawfish.minebrawlstars.network.AttackAction;

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
        PlayerEntity entity=event.getPlayer();
        if(entity instanceof ClientPlayerEntity){
            ItemStack itemStack=event.getItemStack();
            if(itemStack.getItem() instanceof AttackItem){
                ChannelInit.simpleChannel.sendToServer(new AttackAction(entity.getId()));
            }
        }
    }
}
