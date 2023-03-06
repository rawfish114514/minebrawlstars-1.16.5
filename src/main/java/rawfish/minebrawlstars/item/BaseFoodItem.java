package rawfish.minebrawlstars.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class BaseFoodItem extends Item {
    public BaseFoodItem(Properties properties,Food food) {
        super(properties.food(food));
    }

    @Override
    public void fillItemCategory(ItemGroup itemGroup, NonNullList<ItemStack> itemList) {
    }
}
