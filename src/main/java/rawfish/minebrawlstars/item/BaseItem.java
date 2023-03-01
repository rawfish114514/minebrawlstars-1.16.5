package rawfish.minebrawlstars.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class BaseItem extends Item {

    public BaseItem(Properties properties) {
        super(properties);
    }

    @Override
    public void fillItemCategory(ItemGroup itemGroup, NonNullList<ItemStack> itemList) {
    }
}
