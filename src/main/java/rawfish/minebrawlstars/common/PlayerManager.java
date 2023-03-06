package rawfish.minebrawlstars.common;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import rawfish.minebrawlstars.brawl.Hero;
import rawfish.minebrawlstars.brawl.HeroFactory;
import rawfish.minebrawlstars.item.brawler.HeroedHeadArmorItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerManager {
    public static List<ServerPlayerEntity> playerList=new ArrayList<>();

    public static void add(ServerPlayerEntity player){
        playerList.add(player);
        playerMap.put(player,null);
    }

    public static void remove(ServerPlayerEntity player){
        playerList.remove(player);
        playerMap.remove(player);
    }


    public static Map<ServerPlayerEntity, Hero> playerMap=new HashMap<>();
    /**
     * 每刻调用
     * 检查所有玩家的状态
     * 分配他们的Hero对象
     */
    public static void revalue(){
        for(int i=0;i<playerList.size();i++){
            ServerPlayerEntity player=playerList.get(i);
            pb:
            {
                for (ItemStack itemStack : player.getArmorSlots()) {
                    if (itemStack.getItem() instanceof HeroedHeadArmorItem) {
                        HeroedHeadArmorItem heroHead = (HeroedHeadArmorItem) itemStack.getItem();
                        process(player, heroHead);
                        break pb;
                    }
                }
                process(player, null);
            }
        }
    }

    /**
     * 尝试为玩家创建或取消Hero
     * 如果失败则以死亡为惩罚
     * @param player
     * @param heroHead
     */
    public static void process(ServerPlayerEntity player, HeroedHeadArmorItem heroHead){
        Hero hero=playerMap.get(player);
        if(hero!=null){
            //System.out.println("\u00a75"+hero.getClass());
        }
        if(heroHead==null){
            if(hero!=null){
                //从Hero状态变成null
                //只有玩家处于脱战状态才能这样做 否则死亡
                hero.cancel();
                playerMap.put(player,null);
            }
        }else {
            if (hero == null) {
                //从null变成Hero状态
                //没有限制
                HeroFactory factory=heroHead.heroFactory;
                if(factory!=null) {
                    Hero h = factory.createHero(player);
                    h.deploy();
                    playerMap.put(player, h);
                }else{
                    //System.out.println("\u00a75工厂为空！！！");
                }
            }else{
                //从Hero状态变成Hero状态
                boolean b=hero.getFactory().isReasonable(heroHead.heroFactory);
            }
        }

    }
}
