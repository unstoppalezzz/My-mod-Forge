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
public class flash_fan2109entiymodel<T extends Entity> extends EntityModel<T> {
    public ModelRenderer field_178736_x;
    public ModelRenderer field_178729_w;
    public ModelRenderer field_178734_a;
    public ModelRenderer field_178731_d;
    public ModelRenderer field_178732_b;
    public ModelRenderer field_178720_f;
    public ModelRenderer field_178733_c;
    public ModelRenderer field_178723_h;
    public ModelRenderer field_178721_j;
    public ModelRenderer field_78116_c;
    public ModelRenderer field_78115_e;
    public ModelRenderer field_178724_i;
    public ModelRenderer field_178722_k;
    public ModelRenderer field_178730_v;

    public flash_fan2109entiymodel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.field_178729_w = new ModelRenderer(this, 0, 0);
        this.field_178729_w.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_178729_w.addBox(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.field_178723_h = new ModelRenderer(this, 40, 16);
        this.field_178723_h.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_178723_h.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.field_178722_k = new ModelRenderer(this, 16, 48);
        this.field_178722_k.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.field_178722_k.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.field_178732_b = new ModelRenderer(this, 40, 32);
        this.field_178732_b.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_178732_b.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.field_178730_v = new ModelRenderer(this, 16, 32);
        this.field_178730_v.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_178730_v.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.field_178733_c = new ModelRenderer(this, 0, 48);
        this.field_178733_c.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.field_178733_c.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.field_178721_j = new ModelRenderer(this, 0, 16);
        this.field_178721_j.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.field_178721_j.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.field_178734_a = new ModelRenderer(this, 48, 48);
        this.field_178734_a.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.field_178734_a.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.field_178736_x = new ModelRenderer(this, 24, 0);
        this.field_178736_x.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_178736_x.addBox(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.field_178720_f = new ModelRenderer(this, 32, 0);
        this.field_178720_f.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_178720_f.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, 0.5F, 0.5F);
        this.field_78116_c = new ModelRenderer(this, 0, 0);
        this.field_78116_c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_c.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.field_178724_i = new ModelRenderer(this, 32, 48);
        this.field_178724_i.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.field_178724_i.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.field_178731_d = new ModelRenderer(this, 0, 32);
        this.field_178731_d.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.field_178731_d.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.field_78115_e = new ModelRenderer(this, 16, 16);
        this.field_78115_e.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78115_e.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) { 
        ImmutableList.of(this.field_178729_w, this.field_178723_h, this.field_178722_k, this.field_178732_b, this.field_178730_v, this.field_178733_c, this.field_178721_j, this.field_178734_a, this.field_178736_x, this.field_178720_f, this.field_78116_c, this.field_178724_i, this.field_178731_d, this.field_78115_e).forEach((modelRenderer) -> { 
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
