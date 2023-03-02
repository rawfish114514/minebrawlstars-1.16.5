package rawfish.minebrawlstars.item.brawl;

import rawfish.minebrawlstars.item.BaseItem;

public class GearItem extends BaseItem {
    public GearItem(GearRarity rarity) {
        super(new Properties());
        this.rarity=rarity;
    }

    public GearRarity rarity;

    public enum GearRarity{

        SUPER("\u00a79","rarity.minebrawlstars.super"),
        EPIC("\u00a75","rarity.minebrawlstars.epic"),
        MYTHIC("\u00a7c","rarity.minebrawlstars.mythic");

        private GearRarity(String format, String key){
            this.format=format;
            this.key=key;
        }
        public final String format;
        public final String key;
    }
}
