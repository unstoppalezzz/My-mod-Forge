package net.unstoppalezzz.mobs.Render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;;
import net.unstoppalezzz.mobs.Model.UnstoppalezzzEntityEvilModel;
import net.unstoppalezzz.mobs.Model.flash_fan2109entiymodel;
import net.unstoppalezzz.mobs.Model.noddlessnakeman2entitymodel;
import net.unstoppalezzz.mobs.entitys.UnstoppalezzzEntityEvil;
import net.unstoppalezzz.mobs.entitys.flash_fan21094Entity;
import net.unstoppalezzz.mobs.entitys.noddlessnakeman2entity;

public class noddlessnakeman2render extends MobRenderer<noddlessnakeman2entity, noddlessnakeman2entitymodel<noddlessnakeman2entity>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation("mobs", "textures/entity/noddlessnakeman2_entity.png");

    public noddlessnakeman2render(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new noddlessnakeman2entitymodel(), 0.5F);
    }

    public ResourceLocation getEntityTexture(noddlessnakeman2entity entity) {
        return TEXTURE;
    }
}
