package rawfish.minebrawlstars.client;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.BusBuilder;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class TEventBus {
    public static final EventBus EVENT_BUS=new EventBus(new BusBuilder());

    public static void register(IEventBus eventBus){
        eventBus.register(TEventBus.class);
    }

    @SubscribeEvent
    public static void onRenderTick(TickEvent.RenderTickEvent event){
        EVENT_BUS.post(event);
    }
}
