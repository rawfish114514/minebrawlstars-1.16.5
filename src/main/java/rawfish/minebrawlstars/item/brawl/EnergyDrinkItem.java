package rawfish.minebrawlstars.item.brawl;


import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.item.ItemStack;
import rawfish.minebrawlstars.item.BaseFoodItem;

public class EnergyDrinkItem extends BaseFoodItem {
    public EnergyDrinkItem() {
        super(new Properties()
                .stacksTo(1),
                (new Food.Builder())
                        .nutrition(-4)
                        .saturationMod(0)
                        .alwaysEat()
                        .build());
    }
}
