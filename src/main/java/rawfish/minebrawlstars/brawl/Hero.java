package rawfish.minebrawlstars.brawl;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.vector.Vector3d;


public interface Hero {
    HeroFactory getFactory();
    PlayerEntity getPlayer();
    AttackResult attack(Vector3d position, double xRot, double yRot, double scale);
}
