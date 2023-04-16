package rawfish.minebrawlstars.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.RegistryObject;

import java.util.List;

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
                if(item.getClass()==NullItem.class) {
                    itemList.add(new ItemStack(Items.AIR));
                }else{
                    itemList.add(new ItemStack(item));
                }
            }
        }
    }
}
