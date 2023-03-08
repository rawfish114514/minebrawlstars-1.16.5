package rawfish.minebrawlstars.server;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.EntityLeaveWorldEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventListener {
    public static void register(IEventBus eventBus){
        eventBus.register(EventListener.class);
    }

    @SubscribeEvent
    public static void onEntityJoinWorldEvent(EntityJoinWorldEvent event){
        Entity entity=event.getEntity();
        if(entity instanceof ServerPlayerEntity){
            onPlayerJoinWorldEvent((ServerPlayerEntity)entity);
        }
    }

    @SubscribeEvent
    public static void onEntityLeaveWorldEvent(EntityLeaveWorldEvent event){
        Entity entity=event.getEntity();
        if(entity instanceof ServerPlayerEntity){
            onPlayerLeaveWorldEvent((ServerPlayerEntity)entity);
        }
    }

    @SubscribeEvent
    public static void onServerTickEvent(TickEvent.ServerTickEvent event){
        PlayerManager.revalue();
    }

    public static void onPlayerJoinWorldEvent(ServerPlayerEntity player){
        PlayerManager.add(player);
    }

    public static void onPlayerLeaveWorldEvent(ServerPlayerEntity player){
        PlayerManager.remove(player);
    }
}
