package rawfish.minebrawlstars.brawl.brawlerfactort;

import net.minecraft.entity.player.ServerPlayerEntity;
import rawfish.minebrawlstars.brawl.Hero;
import rawfish.minebrawlstars.brawl.HeroFactory;
import rawfish.minebrawlstars.brawl.brawler.ShellyHero;

public class ShellyHeroFactory implements HeroFactory {
    public static final ShellyHeroFactory thisFactory=new ShellyHeroFactory();
    @Override
    public boolean isReasonable(HeroFactory target) {
        return target==this;
    }

    @Override
    public Hero createHero(ServerPlayerEntity player) {
        ShellyHero shellyHero=new ShellyHero();
        shellyHero.factory=this;
        shellyHero.player=player;
        return shellyHero;
    }
}
