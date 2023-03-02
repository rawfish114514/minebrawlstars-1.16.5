package rawfish.minebrawlstars.item;

import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rawfish.minebrawlstars.MineBrawlStars;
import rawfish.minebrawlstars.item.brawl.AttackItem;
import rawfish.minebrawlstars.item.brawl.GearItem;
import rawfish.minebrawlstars.item.brawl.HeroHeadArmorItem;
import rawfish.minebrawlstars.item.tab.ItemTab;
import rawfish.minebrawlstars.util.SoundInit;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final DeferredRegister<Item> ICONS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineBrawlStars.MODID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineBrawlStars.MODID);

    public static final RegistryObject<Item> BRAWL_ICON=ICONS.register(
            "group_tab_brawl_icon",
            () -> new BaseItem(new Item.Properties()));

    public static final RegistryObject<Item> HERO_ICON=ICONS.register(
            "group_tab_hero_icon",
            () -> new BaseItem(new Item.Properties()));

    public static final RegistryObject<Item> MUSIC_ICON=ICONS.register(
            "group_tab_music_icon",
            () -> new BaseItem(new Item.Properties()));


    public static final RegistryObject<Item> NULL=ITEMS.register(
            "null",
            ()->new BaseItem(new Item.Properties()){
                @Override
                public ITextComponent getName(ItemStack itemStack) {
                    return new StringTextComponent("");
                }
            }
    );


    public static final ItemTab BRAWL_TAB = new ItemTab(
            ItemGroup.TABS.length,
            "minebrawlstars_brawl",
            BRAWL_ICON);

    public static final List<RegistryObject<Item>> brawlItemList =new ArrayList<RegistryObject<Item>>(){{
    }};

    public static final RegistryObject<Item> BRAWL_SET=ITEMS.register(
            "brawl_set",
            ()->new ItemSet(brawlItemList,BRAWL_TAB));


    public static final ItemTab HERO_TAB = new ItemTab(
            ItemGroup.TABS.length,
            "minebrawlstars_hero",
            HERO_ICON);

    public static final List<RegistryObject<Item>> heroItemList =new ArrayList<RegistryObject<Item>>(){
        public void addNull(int n){
            for(int i=0;i<n;i++){
                add(NULL);
            }
        }
        {
            add(ITEMS.register(
                    "attack",
                    ()->new AttackItem()));
            add(ITEMS.register(
                    "gear_superrare_speed",
                    ()->new GearItem(GearItem.GearRarity.SUPER)));
            add(ITEMS.register(
                    "gear_superrare_health",
                    ()->new GearItem(GearItem.GearRarity.SUPER)));
            add(ITEMS.register(
                    "gear_superrare_damage",
                    ()->new GearItem(GearItem.GearRarity.SUPER)));
            add(ITEMS.register(
                    "gear_superrare_vision",
                    ()->new GearItem(GearItem.GearRarity.SUPER)));
            add(ITEMS.register(
                    "gear_superrare_shield",
                    ()->new GearItem(GearItem.GearRarity.SUPER)));
            addNull(3);
            add(ITEMS.register(
                    "heroedhead_shelly",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.STARTING)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_1_1",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_1_2",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_1_3",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_1_4",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_1_5",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_1_6",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_1_7",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_1_8",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_2_1",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_2_2",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_2_3",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_2_4",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_2_5",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_2_6",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_2_7",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_2_8",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_2_9",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_2_10",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_3_1",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_3_2",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_3_3",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_3_4",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_3_5",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_3_6",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_3_7",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_3_8",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_3_9",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_3_10",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_3_11",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_3_12",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_3_13",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_4_1",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_4_2",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_4_3",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_4_4",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_4_5",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_4_6",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_4_7",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_4_8",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_4_9",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_5_1",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_5_2",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_5_3",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_5_4",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_5_5",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_5_6",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_5_7",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_1",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_2",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_3",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_4",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_5",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_6",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_7",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_8",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_9",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_10",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_11",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_12",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_13",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_14",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_15",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
            add(ITEMS.register(
                    "heroedhead_6_16",
                    () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
            addNull(8);
    }};

    public static final RegistryObject<Item> HERO_SET=ITEMS.register(
            "hero_set",
            ()->new ItemSet(heroItemList,HERO_TAB));


    public static final ItemTab MUSIC_TAB = new ItemTab(
            ItemGroup.TABS.length,
            "minebrawlstars_music",
            MUSIC_ICON);

    public static final List<RegistryObject<Item>> musicItemList =new ArrayList<RegistryObject<Item>>(){{
        add(ITEMS.register(
                "season_battle_s1",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S1)));
        add(ITEMS.register(
                "season_battle_s2",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S2)));
        add(ITEMS.register(
                "season_battle_s3",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S3)));
        add(ITEMS.register(
                "season_battle_s4",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S4)));
        add(ITEMS.register(
                "season_battle_s5",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S5)));
        add(ITEMS.register(
                "season_battle_s6",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S6)));
        add(ITEMS.register(
                "season_battle_s7",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S7)));
        add(ITEMS.register(
                "season_battle_s8",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S8)));
        add(ITEMS.register(
                "season_battle_s9",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S9)));
        add(ITEMS.register(
                "season_battle_s10",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S10)));
        add(ITEMS.register(
                "season_battle_s11",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S11)));
        add(ITEMS.register(
                "season_battle_s12",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S12)));
        add(ITEMS.register(
                "season_battle_s13",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S13)));
        add(ITEMS.register(
                "season_battle_s14",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S14)));
        add(ITEMS.register(
                "season_battle_s15",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S15)));
        add(ITEMS.register(
                "season_battle_s16",
                () -> new MusicItem(SoundInit.SEASON_BATTLE_S16)));

        add(ITEMS.register(
                "season_premiere_s2",
                () -> new MusicItem(SoundInit.SEASON_PREMIERE_S2)));
        add(ITEMS.register(
                "season_premiere_s3",
                () -> new MusicItem(SoundInit.SEASON_PREMIERE_S3)));
        add(ITEMS.register(
                "season_premiere_s4",
                () -> new MusicItem(SoundInit.SEASON_PREMIERE_S4)));
        add(ITEMS.register(
                "season_premiere_s5",
                () -> new MusicItem(SoundInit.SEASON_PREMIERE_S5)));
        add(ITEMS.register(
                "season_premiere_s6",
                () -> new MusicItem(SoundInit.SEASON_PREMIERE_S6)));
        add(ITEMS.register(
                "season_premiere_s7",
                () -> new MusicItem(SoundInit.SEASON_PREMIERE_S7)));
        add(ITEMS.register(
                "season_premiere_s8",
                () -> new MusicItem(SoundInit.SEASON_PREMIERE_S8)));
        add(ITEMS.register(
                "season_premiere_s9",
                () -> new MusicItem(SoundInit.SEASON_PREMIERE_S9)));

        add(ITEMS.register(
                "bad_random_1",
                () -> new MusicItem(SoundInit.BAD_RANDOM_1)));
        add(ITEMS.register(
                "bad_random_2",
                () -> new MusicItem(SoundInit.BAD_RANDOM_2)));
        add(ITEMS.register(
                "bad_random_3",
                () -> new MusicItem(SoundInit.BAD_RANDOM_3)));
        add(ITEMS.register(
                "bad_random_4",
                () -> new MusicItem(SoundInit.BAD_RANDOM_4)));
        add(ITEMS.register(
                "bad_random_5",
                () -> new MusicItem(SoundInit.BAD_RANDOM_5)));

        add(ITEMS.register(
                "esports_1",
                () -> new MusicItem(SoundInit.ESPORTS_1)));
        add(ITEMS.register(
                "esports_2",
                () -> new MusicItem(SoundInit.ESPORTS_2)));
    }};

    public static final RegistryObject<Item> MUSIC_SET=ITEMS.register(
            "music_set",
            ()->new ItemSet(musicItemList,MUSIC_TAB));
}
