package rawfish.minebrawlstars.brawl;

import net.minecraft.entity.player.ServerPlayerEntity;

public interface HeroFactory {
    /**
     * 必须判断显示不切换英雄变更工厂是否是合理的
     * @param target
     * @return
     */
    boolean isReasonable(HeroFactory target);

    Hero createHero(ServerPlayerEntity player);
}
