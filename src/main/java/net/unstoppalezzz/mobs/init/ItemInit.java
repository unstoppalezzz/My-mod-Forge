package net.unstoppalezzz.mobs.init;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Food.Builder;
import net.minecraft.item.Item.Properties;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.unstoppalezzz.mobs.Main.UnstoppalezzzItemGroup;
import net.unstoppalezzz.mobs.object.Items.FlyItem;
import net.unstoppalezzz.mobs.object.Items.SpeedItem;
import net.unstoppalezzz.mobs.object.Items.VanishItem;
import net.unstoppalezzz.mobs.spawn_eggs.Unstoppalezzz_Spawn_Egg;
import net.unstoppalezzz.mobs.utils.ermm.ModArmorMaterials;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<VanishItem> Vansih_ITEM;
    public static final RegistryObject<FlyItem> Fly_ITEM;
    public static final RegistryObject<SpeedItem> Speed_ITEM;
    public static final RegistryObject<ArmorItem> FLASH_HELMET;
    public static final RegistryObject<ArmorItem> FLASH_CHESTPLATE;
    public static final RegistryObject<ArmorItem> FLASH_LEGGINGS;
    public static final RegistryObject<ArmorItem> FLASH_BOOTS;
    public static final RegistryObject<Item> FLASH_ITEM;
    public static final RegistryObject<Unstoppalezzz_Spawn_Egg> UNSTOPPALEZZZ_SPAWN_EGG;
    public static final RegistryObject<Unstoppalezzz_Spawn_Egg> FLASH;
    public static final RegistryObject<Unstoppalezzz_Spawn_Egg> UNSTOPPALEZZZ_SPAWN_EGG_EVIL;
    public static final RegistryObject<Unstoppalezzz_Spawn_Egg> noddlessnakeman2_Spawn_egg;

    public ItemInit() {
    }

    static {
        ITEMS = new DeferredRegister(ForgeRegistries.ITEMS, "mobs");
        Vansih_ITEM = ITEMS.register("vanish_item", () -> {
            return new VanishItem((new Properties()).group(UnstoppalezzzItemGroup.instance));
        });
        Fly_ITEM = ITEMS.register("fly_item", () -> {
            return new FlyItem((new Properties()).group(UnstoppalezzzItemGroup.instance));
        });
        Speed_ITEM = ITEMS.register("speed_item", () -> {
            return new SpeedItem((new Properties()).group(UnstoppalezzzItemGroup.instance));
        });
        FLASH_HELMET = ITEMS.register("flash_helmet", () -> {
            return new ArmorItem(ModArmorMaterials.FLASH, EquipmentSlotType.HEAD, (new Properties()).group(UnstoppalezzzItemGroup.instance));
        });
        FLASH_CHESTPLATE = ITEMS.register("flash_chestplate", () -> {
            return new ArmorItem(ModArmorMaterials.FLASH, EquipmentSlotType.CHEST, (new Properties()).group(UnstoppalezzzItemGroup.instance));
        });
        FLASH_LEGGINGS = ITEMS.register("flash_leggings", () -> {
            return new ArmorItem(ModArmorMaterials.FLASH, EquipmentSlotType.LEGS, (new Properties()).group(UnstoppalezzzItemGroup.instance));
        });
        FLASH_BOOTS = ITEMS.register("flash_boots", () -> {
            return new ArmorItem(ModArmorMaterials.FLASH, EquipmentSlotType.FEET, (new Properties()).group(UnstoppalezzzItemGroup.instance));
        });
        FLASH_ITEM = ITEMS.register("flash_item", () -> {
            return new Item((new Properties()).group(UnstoppalezzzItemGroup.instance).food((new Builder()).hunger(6).saturation(1.2F).effect(new EffectInstance(Effects.ABSORPTION, 6000, 5), 0.7F).build()));
        });
        UNSTOPPALEZZZ_SPAWN_EGG = ITEMS.register("unstoppalezzz_spawn_egg", () -> {
            return new Unstoppalezzz_Spawn_Egg(ModEntityTypes.UNSTOPPALEZZZ_ENTITY, 3093247, 3093247, (new Properties()).group(UnstoppalezzzItemGroup.instance).maxStackSize(64));
        });
        FLASH = ITEMS.register("flash_fan2109_spawn_egg", () -> {
            return new Unstoppalezzz_Spawn_Egg(ModEntityTypes.flash_fan2109_ENTITY, 16711771, 16711771, (new Properties()).group(UnstoppalezzzItemGroup.instance).maxStackSize(64));
        });
        UNSTOPPALEZZZ_SPAWN_EGG_EVIL = ITEMS.register("unstoppalezzz_spawn_egg_evil", () -> {
            return new Unstoppalezzz_Spawn_Egg(ModEntityTypes.UNSTOPPALEZZZEvil_ENTITY, 16711771, 16711771, (new Properties()).group(UnstoppalezzzItemGroup.instance).maxStackSize(64));
        });
       noddlessnakeman2_Spawn_egg  = ITEMS.register("noddlessnakeman2_spawn_egg", () -> {
            return new Unstoppalezzz_Spawn_Egg(ModEntityTypes.noddlessnakeman2_ENTITY, 16711771, 16711771, (new Properties()).group(UnstoppalezzzItemGroup.instance).maxStackSize(64));
        });
    }
}

