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

public class GadgetItem extends BaseItem {
    public GadgetItem() {
        super(new Properties()
                .stacksTo(1));
    }

    @Override
    public ITextComponent getName(ItemStack itemStack) {
        return new StringTextComponent("\u00a7l"+new TranslationTextComponent(this.getDescriptionId(itemStack)).getString());
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
        p_77624_3_.add(new StringTextComponent("\u00a7a"
                +new TranslationTextComponent("itemtype.minebrawlstars.gadget").getString()
        ));
    }
}
