package rawfish.minebrawlstars.item;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rawfish.minebrawlstars.MineBrawlStars;
import rawfish.minebrawlstars.item.tab.MusicTab;
import rawfish.minebrawlstars.util.SoundInit;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineBrawlStars.MODID);

    public static final MusicTab MUSIC_TAB = new MusicTab(ItemGroup.TABS.length, "minebrawlstars_music");

    public static final List<RegistryObject<Item>> items=new ArrayList<RegistryObject<Item>>(){{
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
            ()->new ItemSet(items,MUSIC_TAB));
    
    

}
