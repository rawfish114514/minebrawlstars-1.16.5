package rawfish.minebrawlstars.client;


import rawfish.minebrawlstars.common.ChannelInit;

public class ClientHandler {
    public static boolean isThisProtocolAcceptedByClient(String protocolVersion) {
        return ChannelInit.MESSAGE_PROTOCOL_VERSION.equals(protocolVersion);
    }
}
