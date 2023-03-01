package rawfish.minebrawlstars.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.RegistryObject;

import java.util.List;

/**
 * 脑瘫ojang使用的迭代器真让我觉得不可思议，从1.8.9我就注意到这个问题，即使到了1.16.5还没有解决这个问题，或许ojang根本不在意物品排列顺序
 */
public class ItemSet extends Item {
    public ItemSet(List<RegistryObject<Item>> list,ItemGroup itemGroup) {
        super(new Properties().tab(itemGroup));
        this.list=list;
    }
    public List<RegistryObject<Item>> list;
    public void fillItemCategory(ItemGroup itemGroup, NonNullList<ItemStack> itemList) {
        if (this.allowdedIn(itemGroup)) {
            Item item;
            for(int i=0;i<list.size();i++){
                item=list.get(i).get();
                itemList.add(new ItemStack(item));
            }
        }
    }
}
