package rawfish.minebrawlstars.item.tab;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;

public class ItemTab extends ItemGroup {
    public ItemTab(int index, String label, Item icon) {
        super(index, label);
        this.icon=icon;
    }
    public ItemTab(int index, String label, RegistryObject<Item> icon) {
        super(index, label);
        this.ricon=icon;
    }


    public Item icon=null;
    public RegistryObject<Item> ricon=null;
    @Override
    public ItemStack makeIcon() {
        if(icon!=null) {
            return new ItemStack(icon);
        }
        return new ItemStack(ricon.get());
    }
}