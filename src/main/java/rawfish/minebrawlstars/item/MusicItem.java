package rawfish.minebrawlstars.item;

import net.minecraft.item.*;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public class MusicItem extends MusicDiscItem {
    public MusicItem(Supplier<SoundEvent> soundSupplier) {
        super(0, soundSupplier, new Item.Properties().stacksTo(1).tab(ItemInit.SOUND_TAB).rarity(Rarity.EPIC));
    }
}
