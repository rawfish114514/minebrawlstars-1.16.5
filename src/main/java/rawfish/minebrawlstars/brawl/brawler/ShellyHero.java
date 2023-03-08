package rawfish.minebrawlstars.brawl.brawler;

import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.play.client.CChatMessagePacket;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import rawfish.minebrawlstars.MineBrawlStars;
import rawfish.minebrawlstars.brawl.Hero;
import rawfish.minebrawlstars.brawl.HeroFactory;
import rawfish.minebrawlstars.item.ItemInit;
import rawfish.minebrawlstars.item.brawler.AttackItem;

import java.io.IOException;

public class ShellyHero implements Hero {

    public HeroFactory factory;

    public ServerPlayerEntity player;

    @Override
    public HeroFactory getFactory() {
        return factory;
    }



    //base actions

    @Override
    public void attack(){
        emission(0f);
        emission(10f);
        emission(20f);
        emission(-10f);
        emission(-20f);
    }

    public void emission(float rot){
        AbstractArrowEntity abstractarrowentity;
        abstractarrowentity= ((ArrowItem)Items.ARROW).createArrow(
                player.getLevel(),
                new ItemStack(ItemInit.NULL.get()),
                player);
        //角度制
        abstractarrowentity.shootFromRotation(player, player.xRot, player.yRot+rot, 0.0F, 2, 0);
        abstractarrowentity.setBaseDamage(2);
        abstractarrowentity.setKnockback(1);
        player.getLevel().addFreshEntity(abstractarrowentity);
    }


}
