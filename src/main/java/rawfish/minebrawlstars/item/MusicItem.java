package rawfish.minebrawlstars.item;

import net.minecraft.item.*;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public class MusicItem extends BaseMusicDiscItem {
    public MusicItem(Supplier<SoundEvent> soundSupplier) {
        super(0, soundSupplier,
                new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
    }
}
