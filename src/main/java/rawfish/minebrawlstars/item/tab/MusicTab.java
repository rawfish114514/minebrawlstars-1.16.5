package rawfish.minebrawlstars.item.tab;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import rawfish.minebrawlstars.item.ItemInit;

public class MusicTab extends ItemGroup {
    public MusicTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.SEASON_BATTLE_S1.get());
    }
}