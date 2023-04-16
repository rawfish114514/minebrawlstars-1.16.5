package rawfish.minebrawlstars.event;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import rawfish.minebrawlstars.system.ActionEntity;

import java.util.List;

/**
 * 简单攻击事件
 * 一般是子弹和方块碰撞判断时产生
 */
public class MBSEAttackBlockEvent extends BrawlEvent{
    public MBSEAttackBlockEvent(Entity source, BlockPos target, List<ActionEntity> actionEntityListe){

    }
}
