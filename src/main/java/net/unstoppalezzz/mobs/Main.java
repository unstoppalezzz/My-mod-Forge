package net.unstoppalezzz.mobs;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.unstoppalezzz.mobs.init.ItemInit;
import net.unstoppalezzz.mobs.init.ModEntityTypes;
import net.unstoppalezzz.mobs.spawn_eggs.Unstoppalezzz_Spawn_Egg;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mobs")
public class Main {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mobs";
    public static final ResourceLocation EXAMPLE_DIM_TYPE = new ResourceLocation("mobs", "mobs");
    public static Main instance;

    public Main() {
        IEventBus forge = MinecraftForge.EVENT_BUS;
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

    @SubscribeEvent
    public static void OnRegisterEntitys(RegistryEvent<EntityType<?>> event) {
        Unstoppalezzz_Spawn_Egg.initSpawnEggs();



    }

    public static class UnstoppalezzzItemGroup extends ItemGroup {
        public static final Main.UnstoppalezzzItemGroup instance;

        private UnstoppalezzzItemGroup(int index, String label) {
            super(index, label);
        }

        public ItemStack createIcon() {
            return new ItemStack((IItemProvider)ItemInit.Vansih_ITEM.get());
        }

        static {
            instance = new Main.UnstoppalezzzItemGroup(ItemGroup.GROUPS.length, "unstoppalezzztab");
        }
    }
}

