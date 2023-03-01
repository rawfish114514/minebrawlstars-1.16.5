package rawfish.minebrawlstars.item.tab;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import rawfish.minebrawlstars.item.ItemInit;

public class MusicTab extends ItemGroup {
    public MusicTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.MUSIC_DISC_FAR);
    }
}