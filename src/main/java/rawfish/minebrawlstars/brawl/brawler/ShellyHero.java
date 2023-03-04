package rawfish.minebrawlstars.brawl.brawler;

import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.play.client.CChatMessagePacket;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import rawfish.minebrawlstars.brawl.Hero;
import rawfish.minebrawlstars.brawl.HeroFactory;
import rawfish.minebrawlstars.item.brawl.AttackItem;

public class ShellyHero implements Hero {

    public HeroFactory factory;

    public ServerPlayerEntity player;

    @Override
    public HeroFactory getFactory() {
        return factory;
    }

    @Override
    public void deploy() {
        MinecraftForge.EVENT_BUS.register(this);
        System.out.println("\u00a75-----注册！！！！！！！");
    }

    @Override
    public void cancel() {
        MinecraftForge.EVENT_BUS.unregister(this);
    }

    @SubscribeEvent
    public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event){
        Entity entity=event.getEntityLiving();
        if(entity==player){
            ItemStack itemStack=event.getItemStack();
            System.out.println(itemStack);
            if(itemStack.getItem() instanceof AttackItem){
                System.out.println("\u00a75攻击！！！");
                event.setCanceled(true);
            }
        }
    }
}
