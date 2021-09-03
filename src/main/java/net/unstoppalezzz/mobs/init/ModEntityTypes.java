package net.unstoppalezzz.mobs.init;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityType.Builder;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.unstoppalezzz.mobs.entitys.UnstoppalezzzEntity;
import net.unstoppalezzz.mobs.entitys.UnstoppalezzzEntityEvil;
import net.unstoppalezzz.mobs.entitys.flash_fan21094Entity;
import net.unstoppalezzz.mobs.entitys.noddlessnakeman2entity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES;
    public static final RegistryObject<EntityType<UnstoppalezzzEntity>> UNSTOPPALEZZZ_ENTITY;
    public static final RegistryObject<EntityType<UnstoppalezzzEntityEvil>> UNSTOPPALEZZZEvil_ENTITY;
    public static final RegistryObject<EntityType<flash_fan21094Entity>> flash_fan2109_ENTITY;
    public static final RegistryObject<EntityType<noddlessnakeman2entity>> noddlessnakeman2_ENTITY;

    public ModEntityTypes() {
    }

    static {
        ENTITY_TYPES = new DeferredRegister(ForgeRegistries.ENTITIES, "mobs");
        UNSTOPPALEZZZ_ENTITY = ENTITY_TYPES.register("unstoppalezzz_entity", () -> {
            return Builder.create(UnstoppalezzzEntity::new, EntityClassification.CREATURE).size(0.9F, 1.3F).build((new ResourceLocation("mobs", "unstoppalezzz_entity")).toString());
        });
        UNSTOPPALEZZZEvil_ENTITY = ENTITY_TYPES.register("unstoppalezzzevil_entity", () -> {
            return Builder.create(UnstoppalezzzEntityEvil::new, EntityClassification.CREATURE).size(0.9F, 1.3F).build((new ResourceLocation("mobs", "unstoppalezzzevil_entity")).toString());
        });
        flash_fan2109_ENTITY = ENTITY_TYPES.register("flash_fan2109_entity", () -> {
            return Builder.create(flash_fan21094Entity::new, EntityClassification.CREATURE).size(0.9F, 1.3F).build((new ResourceLocation("mobs", "flash_fan2109_entity")).toString());
        });
        noddlessnakeman2_ENTITY = ENTITY_TYPES.register("noddlessnakeman2_entity", () -> {
            return Builder.create(noddlessnakeman2entity::new, EntityClassification.CREATURE).size(0.9F, 1.3F).build((new ResourceLocation("mobs", "flash_fan2109_entity")).toString());
        });
    }
}
