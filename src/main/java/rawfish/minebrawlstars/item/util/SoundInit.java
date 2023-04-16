package rawfish.minebrawlstars.item.util;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rawfish.minebrawlstars.MineBrawlStars;

import java.util.ArrayList;
import java.util.List;

public class SoundInit {
    public static void register(IEventBus eventBus){
        SOUNDS.register(eventBus);
    }

    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MineBrawlStars.MODID);


    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S1=(SOUNDS.register(
            "season_battle_s1.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s1"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S2=(SOUNDS.register(
            "season_battle_s2.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s2"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S3=(SOUNDS.register(
            "season_battle_s3.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s3"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S4=(SOUNDS.register(
            "season_battle_s4.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s4"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S5=(SOUNDS.register(
            "season_battle_s5.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s5"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S6=(SOUNDS.register(
            "season_battle_s6.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s6"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S7=(SOUNDS.register(
            "season_battle_s7.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s7"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S8=(SOUNDS.register(
            "season_battle_s8.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s8"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S9=(SOUNDS.register(
            "season_battle_s9.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s9"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S10=(SOUNDS.register(
            "season_battle_s10.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s10"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S11=(SOUNDS.register(
            "season_battle_s11.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s11"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S12=(SOUNDS.register(
            "season_battle_s12.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s12"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S13=(SOUNDS.register(
            "season_battle_s13.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s13"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S14=(SOUNDS.register(
            "season_battle_s14.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s14"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S15=(SOUNDS.register(
            "season_battle_s15.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s15"))));
    public static final RegistryObject<SoundEvent> SEASON_BATTLE_S16=(SOUNDS.register(
            "season_battle_s16.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_battle_s16"))));

    public static final RegistryObject<SoundEvent> SEASON_PREMIERE_S2=(SOUNDS.register(
            "season_premiere_s2.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_premiere_s2"))));
    public static final RegistryObject<SoundEvent> SEASON_PREMIERE_S3=(SOUNDS.register(
            "season_premiere_s3.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_premiere_s3"))));
    public static final RegistryObject<SoundEvent> SEASON_PREMIERE_S4=(SOUNDS.register(
            "season_premiere_s4.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_premiere_s4"))));
    public static final RegistryObject<SoundEvent> SEASON_PREMIERE_S5=(SOUNDS.register(
            "season_premiere_s5.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_premiere_s5"))));
    public static final RegistryObject<SoundEvent> SEASON_PREMIERE_S6=(SOUNDS.register(
            "season_premiere_s6.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_premiere_s6"))));
    public static final RegistryObject<SoundEvent> SEASON_PREMIERE_S7=(SOUNDS.register(
            "season_premiere_s7.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_premiere_s7"))));
    public static final RegistryObject<SoundEvent> SEASON_PREMIERE_S8=(SOUNDS.register(
            "season_premiere_s8.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_premiere_s8"))));
    public static final RegistryObject<SoundEvent> SEASON_PREMIERE_S9=(SOUNDS.register(
            "season_premiere_s9.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "season_premiere_s9"))));

    public static final RegistryObject<SoundEvent> BAD_RANDOM_1=(SOUNDS.register(
            "bad_random_1.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "bad_random_1"))));
    public static final RegistryObject<SoundEvent> BAD_RANDOM_2=(SOUNDS.register(
            "bad_random_2.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "bad_random_2"))));
    public static final RegistryObject<SoundEvent> BAD_RANDOM_3=(SOUNDS.register(
            "bad_random_3.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "bad_random_3"))));
    public static final RegistryObject<SoundEvent> BAD_RANDOM_4=(SOUNDS.register(
            "bad_random_4.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "bad_random_4"))));
    public static final RegistryObject<SoundEvent> BAD_RANDOM_5=(SOUNDS.register(
            "bad_random_5.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "bad_random_5"))));

    public static final RegistryObject<SoundEvent> ESPORTS_1=(SOUNDS.register(
            "esports_1.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "esports_1"))));
    public static final RegistryObject<SoundEvent> ESPORTS_2=(SOUNDS.register(
            "esports_2.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "esports_2"))));



    //sound effect

    public static final RegistryObject<SoundEvent> SHELLY_ATTACK=SOUNDS.register(
            "shelly_attack.name",
            () -> new SoundEvent(new ResourceLocation(MineBrawlStars.MODID, "shelly_attack")));
}
