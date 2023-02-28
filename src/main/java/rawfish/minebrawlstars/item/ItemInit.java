package rawfish.minebrawlstars.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rawfish.minebrawlstars.MineBrawlStars;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineBrawlStars.MODID);


    public static final RegistryObject<Item> MYITEM = ITEMS.register("myitem",
            () -> new MyItem(ItemTier.NETHERITE ,7,-1,new Item.Properties()));

}
