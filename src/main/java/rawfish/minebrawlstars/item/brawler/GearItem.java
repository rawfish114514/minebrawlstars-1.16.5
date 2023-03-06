package rawfish.minebrawlstars.item.brawler;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import rawfish.minebrawlstars.item.BaseItem;

import javax.annotation.Nullable;
import java.util.List;

public class GearItem extends BaseItem {
    public GearItem(GearRarity rarity) {
        super(new Properties()
                .stacksTo(1));

        this.rarity=rarity;
    }

    public GearRarity rarity;

    @Override
    public ITextComponent getName(ItemStack itemStack) {
        return new StringTextComponent(GearRarity.BOLD+new TranslationTextComponent(this.getDescriptionId(itemStack)).getString());
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
        p_77624_3_.add(new StringTextComponent(rarity.format
                +new TranslationTextComponent(rarity.key).getString()
                +" "
                +new TranslationTextComponent("itemtype.minebrawlstars.gear").getString()
        ));
    }

    public enum GearRarity{

        SUPERRARE("\u00a79","rarity.minebrawlstars.superrare"),
        EPIC("\u00a75","rarity.minebrawlstars.epic"),
        MYTHIC("\u00a7c","rarity.minebrawlstars.mythic");

        public static String BOLD="\u00a7l";

        private GearRarity(String format, String key){
            this.format=format;
            this.key=key;
        }
        public final String format;
        public final String key;
    }
}
