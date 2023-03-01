package rawfish.minebrawlstars.item;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rawfish.minebrawlstars.MineBrawlStars;
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


    public static final ItemTab BRAWL_TAB = new ItemTab(
            ItemGroup.TABS.length,
            "minebrawlstars_brawl",
            BRAWL_ICON);

    public static final List<RegistryObject<Item>> brawlItemList =new ArrayList<RegistryObject<Item>>(){{
        add(ITEMS.register(
                "heroedhead_0_1",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.STARTING)));
        add(ITEMS.register(
                "heroedhead_1_1",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
        add(ITEMS.register(
                "heroedhead_1_2",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
        add(ITEMS.register(
                "heroedhead_1_3",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
        add(ITEMS.register(
                "heroedhead_1_4",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
        add(ITEMS.register(
                "heroedhead_1_5",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
        add(ITEMS.register(
                "heroedhead_1_6",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
        add(ITEMS.register(
                "heroedhead_1_7",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
        add(ITEMS.register(
                "heroedhead_1_8",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.RARE)));
        add(ITEMS.register(
                "heroedhead_2_1",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
        add(ITEMS.register(
                "heroedhead_2_2",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
        add(ITEMS.register(
                "heroedhead_2_3",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
        add(ITEMS.register(
                "heroedhead_2_4",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
        add(ITEMS.register(
                "heroedhead_2_5",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
        add(ITEMS.register(
                "heroedhead_2_6",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
        add(ITEMS.register(
                "heroedhead_2_7",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
        add(ITEMS.register(
                "heroedhead_2_8",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
        add(ITEMS.register(
                "heroedhead_2_9",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
        add(ITEMS.register(
                "heroedhead_2_10",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.SUPER)));
        add(ITEMS.register(
                "heroedhead_3_1",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
        add(ITEMS.register(
                "heroedhead_3_2",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
        add(ITEMS.register(
                "heroedhead_3_3",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
        add(ITEMS.register(
                "heroedhead_3_4",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
        add(ITEMS.register(
                "heroedhead_3_5",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
        add(ITEMS.register(
                "heroedhead_3_6",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
        add(ITEMS.register(
                "heroedhead_3_7",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
        add(ITEMS.register(
                "heroedhead_3_8",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
        add(ITEMS.register(
                "heroedhead_3_9",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
        add(ITEMS.register(
                "heroedhead_3_10",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
        add(ITEMS.register(
                "heroedhead_3_11",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
        add(ITEMS.register(
                "heroedhead_3_12",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
        add(ITEMS.register(
                "heroedhead_3_13",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.EPIC)));
        add(ITEMS.register(
                "heroedhead_4_1",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
        add(ITEMS.register(
                "heroedhead_4_2",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
        add(ITEMS.register(
                "heroedhead_4_3",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
        add(ITEMS.register(
                "heroedhead_4_4",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
        add(ITEMS.register(
                "heroedhead_4_5",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
        add(ITEMS.register(
                "heroedhead_4_6",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
        add(ITEMS.register(
                "heroedhead_4_7",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
        add(ITEMS.register(
                "heroedhead_4_8",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
        add(ITEMS.register(
                "heroedhead_4_9",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.MYTHIC)));
        add(ITEMS.register(
                "heroedhead_5_1",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
        add(ITEMS.register(
                "heroedhead_5_2",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
        add(ITEMS.register(
                "heroedhead_5_3",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
        add(ITEMS.register(
                "heroedhead_5_4",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
        add(ITEMS.register(
                "heroedhead_5_5",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
        add(ITEMS.register(
                "heroedhead_5_6",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
        add(ITEMS.register(
                "heroedhead_5_7",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.LEGENDARY)));
        add(ITEMS.register(
                "heroedhead_6_1",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_2",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_3",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_4",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_5",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_6",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_7",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_8",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_9",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_10",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_11",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_12",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_13",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_14",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_15",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
        add(ITEMS.register(
                "heroedhead_6_16",
                () -> new HeroHeadArmorItem(HeroHeadArmorItem.HeroRarity.CHROMATIC)));
    }};

    public static final RegistryObject<Item> BRAWL_SET=ITEMS.register(
            "brawl_set",
            ()->new ItemSet(brawlItemList,BRAWL_TAB));


    public static final ItemTab MUSIC_TAB = new ItemTab(
            ItemGroup.TABS.length,
            "minebrawlstars_music",
            Items.MUSIC_DISC_FAR);

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
    }};

    public static final RegistryObject<Item> MUSIC_SET=ITEMS.register(
            "music_set",
            ()->new ItemSet(musicItemList,MUSIC_TAB));
}
