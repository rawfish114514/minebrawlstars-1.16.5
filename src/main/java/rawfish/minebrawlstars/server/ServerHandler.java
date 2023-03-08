package rawfish.minebrawlstars.server;


import rawfish.minebrawlstars.common.ChannelInit;

public class ServerHandler {
    public static boolean isThisProtocolAcceptedByServer(String protocolVersion) {
        return ChannelInit.MESSAGE_PROTOCOL_VERSION.equals(protocolVersion);
    }
}
