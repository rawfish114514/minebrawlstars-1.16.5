package rawfish.minebrawlstars.event;

import net.minecraft.entity.Entity;
import rawfish.minebrawlstars.system.ActionEntity;

import java.util.List;

/**
 * 简单攻击事件
 * 一般是子弹和实体碰撞判断时产生
 */
public class MBSEAttackEntityEvent extends BrawlEvent{
    public MBSEAttackEntityEvent(Entity source, Entity target, List<ActionEntity> actionEntityListe){

    }
}
