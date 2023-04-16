package rawfish.minebrawlstars.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.item.ItemStack;
import rawfish.minebrawlstars.brawl.Hero;
import rawfish.minebrawlstars.brawl.HeroFactory;
import rawfish.minebrawlstars.item.brawler.HeroedHeadArmorItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerManager {
    public static List<AbstractClientPlayerEntity> playerList=new ArrayList<>();

    public static void add(AbstractClientPlayerEntity player){
        playerList.add(player);
        playerMap.put(player.getId(),null);
    }

    public static void remove(AbstractClientPlayerEntity player){
        playerList.remove(player);
        playerMap.remove(player.getId());
    }


    public static Map<Integer, Hero> playerMap=new HashMap<>();

    public static ClientPlayerEntity thisPlayer=null;
    /**
     * 每刻调用
     * 检查所有玩家的状态
     * 分配他们的Hero对象
     */
    public static void revalue(){
        thisPlayer=Minecraft.getInstance().player;
        for(int i=0;i<playerList.size();i++){
            AbstractClientPlayerEntity player=playerList.get(i);
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
     * @param player
     * @param heroHead
     */
    public static void process(AbstractClientPlayerEntity player, HeroedHeadArmorItem heroHead){
        Hero hero=playerMap.get(player.getId());
        if(hero!=null){
            //System.out.println("\u00a75"+hero.getClass());
        }
        if(heroHead==null){
            if(hero!=null){
                //从Hero状态变成null
                //如果玩家处于乱斗状态则掉血到极低
                playerMap.put(player.getId(),null);
            }
        }else {
            if (hero == null) {
                //从null变成Hero状态
                //如果玩家处于乱斗状态则无法变成Hero状态
                HeroFactory factory=heroHead.heroFactory;
                if(factory!=null) {
                    Hero h = factory.createHero(player);
                    playerMap.put(player.getId(), h);
                }else{
                    System.out.println("\u00a75工厂为空！！！");
                }
            }else{
                //从Hero状态变成Hero状态
                boolean b=hero.getFactory().isReasonable(heroHead.heroFactory);
            }
        }

    }
}
