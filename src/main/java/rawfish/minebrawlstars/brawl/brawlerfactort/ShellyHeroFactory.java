package rawfish.minebrawlstars.brawl.brawlerfactort;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import rawfish.minebrawlstars.brawl.Hero;
import rawfish.minebrawlstars.brawl.HeroFactory;
import rawfish.minebrawlstars.brawl.brawler.ShellyHero;

public class ShellyHeroFactory implements HeroFactory {
    @Override
    public boolean isReasonable(HeroFactory target) {
        return target==this;
    }

    @Override
    public Hero createHero(PlayerEntity player) {
        ShellyHero shellyHero=new ShellyHero();
        shellyHero.factory=this;
        shellyHero.player=player;
        return shellyHero;
    }
}
