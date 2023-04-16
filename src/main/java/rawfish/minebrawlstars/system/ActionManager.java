package rawfish.minebrawlstars.system;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import rawfish.minebrawlstars.event.BrawlEvent;

/**
 * 所有和乱斗相关的操作都由这个类管理
 * 它分析每个乱斗刻碰撞的所有乱斗操作的合法，优先级
 * 它接受所有BrawlEvent并在下一个乱斗刻处理
 */
public class ActionManager {
    public static void register(IEventBus eventBus){
        eventBus.register(ActionManager.class);
    }

    @SubscribeEvent
    public static void onBrawlEvent(BrawlEvent event){

    }
}
