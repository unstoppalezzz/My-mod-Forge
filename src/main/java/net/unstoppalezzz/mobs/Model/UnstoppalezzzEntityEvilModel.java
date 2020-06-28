package net.unstoppalezzz.mobs.Model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * PlayerModel - Either Mojang or a mod author (Taken From Memory)
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class UnstoppalezzzEntityEvilModel<T extends Entity> extends EntityModel<T> {
    public ModelRenderer HoleBody;
    public ModelRenderer cape;
    public ModelRenderer LeftArm;
    public ModelRenderer RightLeg;
    public ModelRenderer RightArm;
    public ModelRenderer Head;
    public ModelRenderer LeftLeg;
    public ModelRenderer HeadInside;
    public ModelRenderer Body;

    public UnstoppalezzzEntityEvilModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.LeftLeg = new ModelRenderer(this, 0, 48);
        this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.Body = new ModelRenderer(this, 16, 32);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.HeadInside = new ModelRenderer(this, 0, 0);
        this.HeadInside.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadInside.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.RightLeg = new ModelRenderer(this, 0, 32);
        this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.HoleBody = new ModelRenderer(this, 24, 0);
        this.HoleBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HoleBody.addBox(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.cape = new ModelRenderer(this, 0, 0);
        this.cape.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cape.addBox(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 32);
        this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.1F);
        this.RightArm.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.Head = new ModelRenderer(this, 32, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, 0.5F, 0.5F);
        this.LeftArm = new ModelRenderer(this, 48, 48);
        this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.1F);
        this.LeftArm.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) { 
        ImmutableList.of(this.LeftLeg, this.Body, this.HeadInside, this.RightLeg, this.HoleBody, this.cape, this.RightArm, this.Head, this.LeftArm).forEach((modelRenderer) -> { 
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
