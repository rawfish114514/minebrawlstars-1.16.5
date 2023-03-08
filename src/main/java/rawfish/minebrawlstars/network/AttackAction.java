package rawfish.minebrawlstars.network;

import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;
import rawfish.minebrawlstars.brawl.Hero;
import rawfish.minebrawlstars.common.ChannelInit;
import rawfish.minebrawlstars.server.PlayerManager;

import java.util.function.Supplier;

public class AttackAction{
    public int id;
    public AttackAction(int playerId){
        id=playerId;
    }

    public static AttackAction decode(PacketBuffer buffer){
        AttackAction attackAction=new AttackAction(0);
        attackAction.id=buffer.readInt();
        return attackAction;
    }


    public void encode(PacketBuffer buffer){
        buffer.writeInt(id);
    }


    public static void handle(AttackAction mes, Supplier<NetworkEvent.Context> ctxSupplier) {
        System.out.println("攻击行为: "+mes.id);
        Hero hero=PlayerManager.playerMap.get(mes.id);
        if(hero!=null){
            hero.attack();
        }

        System.out.println("aaa");
        System.out.println(ChannelInit.simpleChannelRL);
    }
}
