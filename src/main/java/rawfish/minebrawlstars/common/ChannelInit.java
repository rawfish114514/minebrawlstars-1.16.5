package rawfish.minebrawlstars.common;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import rawfish.minebrawlstars.MineBrawlStars;
import rawfish.minebrawlstars.client.ClientHandler;
import rawfish.minebrawlstars.network.AttackAction;
import rawfish.minebrawlstars.network.BulletAction;
import rawfish.minebrawlstars.server.ServerHandler;

import java.util.Optional;

import static net.minecraftforge.fml.network.NetworkDirection.PLAY_TO_CLIENT;
import static net.minecraftforge.fml.network.NetworkDirection.PLAY_TO_SERVER;

public class ChannelInit {
    public static SimpleChannel simpleChannel;
    public static final String MESSAGE_PROTOCOL_VERSION = "1.0";
    public static final ResourceLocation simpleChannelRL = new ResourceLocation(MineBrawlStars.MODID, "channel");


    public static void register(FMLCommonSetupEvent event) {

        simpleChannel = NetworkRegistry.newSimpleChannel(simpleChannelRL, () -> MESSAGE_PROTOCOL_VERSION,
                ClientHandler::isThisProtocolAcceptedByClient,
                ServerHandler::isThisProtocolAcceptedByServer);

        simpleChannel.registerMessage(MessageType.ATTACK, AttackAction.class,
                AttackAction::encode,
                AttackAction::decode,
                AttackAction::handle,
                Optional.of(PLAY_TO_SERVER));

        simpleChannel.registerMessage(MessageType.BULLET, BulletAction.class,
                BulletAction::encode,
                BulletAction::decode,
                BulletAction::handle,
                Optional.of(PLAY_TO_CLIENT));
    }

    public static class MessageType{
        public static final int ATTACK=128;

        public static final int BULLET=10321;
    }
}
