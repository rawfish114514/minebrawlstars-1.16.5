package rawfish.minebrawlstars.item;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rawfish.minebrawlstars.MineBrawlStars;
import rawfish.minebrawlstars.item.tab.MusicTab;
import rawfish.minebrawlstars.util.SoundInit;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineBrawlStars.MODID);

    public static final MusicTab SOUND_TAB = new MusicTab(ItemGroup.TABS.length, "minebrawlstars_music");


    public static final RegistryObject<Item> SEASON_BATTLE_S1=(ITEMS.register(
            "season_battle_s1_music_1",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S1)));
    public static final RegistryObject<Item> SEASON_BATTLE_S2=(ITEMS.register(
            "season_battle_s2_music_2",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S2)));
    public static final RegistryObject<Item> SEASON_BATTLE_S3=(ITEMS.register(
            "season_battle_s3_music_3",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S3)));
    public static final RegistryObject<Item> SEASON_BATTLE_S4=(ITEMS.register(
            "season_battle_s4_music_4",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S4)));
    public static final RegistryObject<Item> SEASON_BATTLE_S5=(ITEMS.register(
            "season_battle_s5_music_5",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S5)));
    public static final RegistryObject<Item> SEASON_BATTLE_S6=(ITEMS.register(
            "season_battle_s6_music_6",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S6)));
    public static final RegistryObject<Item> SEASON_BATTLE_S7=(ITEMS.register(
            "season_battle_s7_music_7",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S7)));
    public static final RegistryObject<Item> SEASON_BATTLE_S8=(ITEMS.register(
            "season_battle_s8_music_8",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S8)));
    public static final RegistryObject<Item> SEASON_BATTLE_S9=(ITEMS.register(
            "season_battle_s9_music_9",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S9)));
    public static final RegistryObject<Item> SEASON_BATTLE_S10=(ITEMS.register(
            "season_battle_s10_music_10",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S10)));
    public static final RegistryObject<Item> SEASON_BATTLE_S11=(ITEMS.register(
            "season_battle_s11_music_11",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S11)));
    public static final RegistryObject<Item> SEASON_BATTLE_S12=(ITEMS.register(
            "season_battle_s12_music_12",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S12)));
    public static final RegistryObject<Item> SEASON_BATTLE_S13=(ITEMS.register(
            "season_battle_s13_music_13",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S13)));
    public static final RegistryObject<Item> SEASON_BATTLE_S14=(ITEMS.register(
            "season_battle_s14_music_14",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S14)));
    public static final RegistryObject<Item> SEASON_BATTLE_S15=(ITEMS.register(
            "season_battle_s15_music_15",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S15)));
    public static final RegistryObject<Item> SEASON_BATTLE_S16=(ITEMS.register(
            "season_battle_s16_music_16",
            () -> new MusicItem(SoundInit.SEASON_BATTLE_S16)));

    public static final RegistryObject<Item> BAD_RANDOM_1=(ITEMS.register(
            "bad_random_1_music_21",
            () -> new MusicItem(SoundInit.BAD_RANDOM_1)));
    public static final RegistryObject<Item> BAD_RANDOM_2=(ITEMS.register(
            "bad_random_2_music_22",
            () -> new MusicItem(SoundInit.BAD_RANDOM_2)));
    public static final RegistryObject<Item> BAD_RANDOM_3=(ITEMS.register(
            "bad_random_3_music_23",
            () -> new MusicItem(SoundInit.BAD_RANDOM_3)));
    public static final RegistryObject<Item> BAD_RANDOM_4=(ITEMS.register(
            "bad_random_4_music_24",
            () -> new MusicItem(SoundInit.BAD_RANDOM_4)));
    public static final RegistryObject<Item> BAD_RANDOM_5=(ITEMS.register(
            "bad_random_5_music_25",
            () -> new MusicItem(SoundInit.BAD_RANDOM_5)));

}
