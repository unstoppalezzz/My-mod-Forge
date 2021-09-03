package net.unstoppalezzz.mobs.Render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.unstoppalezzz.mobs.Model.UnstoppalezzzEntityModel;
import net.unstoppalezzz.mobs.entitys.UnstoppalezzzEntity;

public class UnstoppalezzzRender extends MobRenderer<UnstoppalezzzEntity, UnstoppalezzzEntityModel<UnstoppalezzzEntity>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation("mobs", "textures/entity/example_entity.png");

    public UnstoppalezzzRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new UnstoppalezzzEntityModel(), 0.5F);
    }

    public ResourceLocation getEntityTexture(UnstoppalezzzEntity entity) {
        return TEXTURE;
    }
}
