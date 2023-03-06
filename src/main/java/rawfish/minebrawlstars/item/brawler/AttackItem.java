package rawfish.minebrawlstars.item.brawler;

import rawfish.minebrawlstars.item.BaseItem;

public class AttackItem extends BaseItem {
    public AttackItem() {
        super(new Properties()
                .stacksTo(1));

        System.out.println("-----"+this.getItemStackTileEntityRenderer());
    }

}
