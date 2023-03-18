package rawfish.minebrawlstars.entity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rawfish.minebrawlstars.MineBrawlStars;
import rawfish.minebrawlstars.entity.brawl.ShellyAttackBulletEntity;

public class EntityInit {
    public static void register(IEventBus eventBus){
        ENTITYS.register(eventBus);
    }

    public static final DeferredRegister<EntityType<?>> ENTITYS =
            DeferredRegister.create(ForgeRegistries.ENTITIES, MineBrawlStars.MODID);

    public static final RegistryObject<EntityType<ShellyAttackBulletEntity>> SHELLY_ATTACK_BULLET=ENTITYS.register(
            "shelly_attack_bullet",
            () -> EntityType.Builder.of(ShellyAttackBulletEntity::new, EntityClassification.AMBIENT)
                    .sized(1,1)
                    .build(new ResourceLocation(MineBrawlStars.MODID,"shelly_attack_bullet").toString())
    );
}
