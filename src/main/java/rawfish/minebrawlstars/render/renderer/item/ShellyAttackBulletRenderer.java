package rawfish.minebrawlstars.render.renderer.item;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderState;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import rawfish.minebrawlstars.MineBrawlStars;
import rawfish.minebrawlstars.entity.brawl.ShellyAttackBulletEntity;
import rawfish.minebrawlstars.render.item.ShellyAttackBulletModel;

public class ShellyAttackBulletRenderer extends EntityRenderer<ShellyAttackBulletEntity>
{
    private static final ResourceLocation TEXTURE=
            new ResourceLocation(MineBrawlStars.MODID,"textures/entity/shelly_attack_bullet.png");

    public ShellyAttackBulletRenderer(EntityRendererManager entityRendererManager) {
        super(entityRendererManager);
        model=new ShellyAttackBulletModel<>();
    }

    public ShellyAttackBulletModel<ShellyAttackBulletEntity> model;

    @Override
    public void render(ShellyAttackBulletEntity p_225623_1_,
                       float p_225623_2_,
                       float p_225623_3_,
                       MatrixStack p_225623_4_,
                       IRenderTypeBuffer p_225623_5_,
                       int p_225623_6_) {

        RenderType.State rendertype$state = RenderType.State.builder().setTextureState(
                new RenderState.TextureState(
                        getTextureLocation(p_225623_1_), false, true))
                .createCompositeState(true);
        model.renderToBuffer(
                p_225623_4_,
                p_225623_5_.getBuffer(RenderType.create("a", DefaultVertexFormats.NEW_ENTITY,7,256,rendertype$state)),
                1,1,1,1,1,1);
    }

    @Override
    public ResourceLocation getTextureLocation(ShellyAttackBulletEntity entity) {
        return TEXTURE;
    }

}
