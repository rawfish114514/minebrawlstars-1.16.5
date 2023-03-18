package rawfish.minebrawlstars;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import rawfish.minebrawlstars.client.TEventBus;
import rawfish.minebrawlstars.common.ChannelInit;
import rawfish.minebrawlstars.entity.EntityInit;
import rawfish.minebrawlstars.item.ItemInit;
import rawfish.minebrawlstars.item.util.SoundInit;
import rawfish.minebrawlstars.network.sync.DataSerializersInit;
import rawfish.minebrawlstars.render.renderer.item.ShellyAttackBulletRenderer;

@Mod(MineBrawlStars.MODID)
public class MineBrawlStars {
    public static final String MODID="minebrawlstars";
    public MineBrawlStars() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.register(modEventBus);
        SoundInit.register(modEventBus);
        EntityInit.register(modEventBus);

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        rawfish.minebrawlstars.server.EventListener.register(MinecraftForge.EVENT_BUS);
        ChannelInit.register(event);
        DataSerializersInit.register();
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        rawfish.minebrawlstars.client.EventListener.register(MinecraftForge.EVENT_BUS);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.SHELLY_ATTACK_BULLET.get(),ShellyAttackBulletRenderer::new);
        //TEventBus.register(MinecraftForge.EVENT_BUS);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {

    }

    private void processIMC(final InterModProcessEvent event)
    {

    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }
}
