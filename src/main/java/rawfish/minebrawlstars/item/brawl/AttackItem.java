package rawfish.minebrawlstars.item.brawl;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import rawfish.minebrawlstars.item.BaseItem;

public class AttackItem extends BaseItem {
    public AttackItem() {
        super(new Properties()
                .stacksTo(1));

        System.out.println("-----"+this.getItemStackTileEntityRenderer());
    }

}
