package rawfish.minebrawlstars.brawl;

import net.minecraft.entity.player.ServerPlayerEntity;

public interface Hero {
    HeroFactory getFactory();

    void attack();
}
