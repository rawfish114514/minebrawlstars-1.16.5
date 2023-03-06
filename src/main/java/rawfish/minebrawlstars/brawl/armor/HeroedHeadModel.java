package rawfish.minebrawlstars.brawl.armor;

import net.minecraft.client.renderer.entity.model.ArmorStandArmorModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class HeroedHeadModel extends ArmorStandArmorModel {
    public HeroedHeadModel(int tx,int ty) {
        super(0);

        this.texWidth=tx;
        this.texHeight=ty;
    }

    public void addof(ModelRenderer model){
        head.addChild(model);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
