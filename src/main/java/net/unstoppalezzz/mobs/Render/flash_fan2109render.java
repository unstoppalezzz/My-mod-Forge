package net.unstoppalezzz.mobs.Render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;;
import net.unstoppalezzz.mobs.Model.flash_fan2109entiymodel;
import net.unstoppalezzz.mobs.entitys.flash_fan21094Entity;

public class flash_fan2109render extends MobRenderer<flash_fan21094Entity, flash_fan2109entiymodel<flash_fan21094Entity>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation("mobs", "textures/entity/flash_fan2109_entity.png");

    public flash_fan2109render(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new flash_fan2109entiymodel<>(), 0.5F);
    }

    public ResourceLocation getEntityTexture(flash_fan21094Entity entity) {
        return TEXTURE;
    }
}
