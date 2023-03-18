package rawfish.minebrawlstars.render.item;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import rawfish.minebrawlstars.entity.brawl.ShellyAttackBulletEntity;

public class ShellyAttackBulletModel<T extends ShellyAttackBulletEntity> extends EntityModel<T> {
    private final ModelRenderer main;

    public ShellyAttackBulletModel() {
        texWidth = 16;
        texHeight = 16;

        main = new ModelRenderer(this);
        main.setPos(0.0F, 0.0F, 0.0F);
        main.texOffs(0, 4).addBox(-1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        main.texOffs(0, 4).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        main.texOffs(0, 4).addBox(-4.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        main.texOffs(0, 4).addBox(2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);


    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        main.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}