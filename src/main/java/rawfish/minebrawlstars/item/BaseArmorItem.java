package rawfish.minebrawlstars.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class BaseArmorItem extends ArmorItem {
    public BaseArmorItem(IArmorMaterial iArmorMaterial, EquipmentSlotType equipmentSlotType, Properties properties) {
        super(iArmorMaterial, equipmentSlotType, properties);
    }

    @Override
    public void fillItemCategory(ItemGroup itemGroup, NonNullList<ItemStack> itemList) {
    }
}
