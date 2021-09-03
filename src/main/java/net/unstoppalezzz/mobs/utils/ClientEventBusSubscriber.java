package net.unstoppalezzz.mobs.utils;

import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.unstoppalezzz.mobs.Model.UnstoppalezzzEntityEvilModel;
import net.unstoppalezzz.mobs.Render.UnstoppalezzzEvilRender;
import net.unstoppalezzz.mobs.Render.UnstoppalezzzRender;
import net.unstoppalezzz.mobs.Render.flash_fan2109render;
import net.unstoppalezzz.mobs.Render.noddlessnakeman2render;
import net.unstoppalezzz.mobs.init.ModEntityTypes;

@EventBusSubscriber(
        modid = "mobs",
        bus = Bus.MOD,
        value = {Dist.CLIENT}
)
public class ClientEventBusSubscriber {
    public ClientEventBusSubscriber() {
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler((EntityType)ModEntityTypes.UNSTOPPALEZZZ_ENTITY.get(), UnstoppalezzzRender::new);
        RenderingRegistry.registerEntityRenderingHandler((EntityType)ModEntityTypes.UNSTOPPALEZZZEvil_ENTITY.get(), UnstoppalezzzEvilRender::new);
        RenderingRegistry.registerEntityRenderingHandler((EntityType)ModEntityTypes.flash_fan2109_ENTITY.get(), flash_fan2109render::new);
        RenderingRegistry.registerEntityRenderingHandler((EntityType)ModEntityTypes.noddlessnakeman2_ENTITY.get(), noddlessnakeman2render::new);
    }
}
