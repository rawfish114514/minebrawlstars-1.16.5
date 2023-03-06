package rawfish.minebrawlstars.brawl.armor.models;

import net.minecraft.client.renderer.entity.model.ArmorStandArmorModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import rawfish.minebrawlstars.brawl.armor.HeroedHeadModel;

@OnlyIn(Dist.CLIENT)
public class ShellyHeadModel extends HeroedHeadModel {
    private final ModelRenderer model;
    private final ModelRenderer ry_r1;
    private final ModelRenderer h_r1;
    private final ModelRenderer h_r2;
    private final ModelRenderer h_r3;
    private final ModelRenderer h_r4;
    private final ModelRenderer h_r5;
    private final ModelRenderer cube_r1;
    public ShellyHeadModel(){
        super(64,64);

        model = new ModelRenderer(this);
        model.setPos(0.0F, 24.0F, 0.0F);
        model.texOffs(0, 32).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
        model.texOffs(0, 48).addBox(-2.5F, -34.0F, -4.5F, 5.0F, 2.0F, 8.0F, 0.0F, false);

        ry_r1 = new ModelRenderer(this);
        ry_r1.setPos(0.0F, -31.5F, 4.5F);
        model.addChild(ry_r1);
        setRotationAngle(ry_r1, 0.3054F, 0.0F, 0.0F);
        ry_r1.texOffs(52, 32).addBox(-2.5F, -2.5F, 0.25F, 5.0F, 5.0F, 1.0F, 0.0F, false);

        h_r1 = new ModelRenderer(this);
        h_r1.setPos(0.0F, -34.391F, 8.1845F);
        model.addChild(h_r1);
        setRotationAngle(h_r1, -0.8727F, 0.0F, 0.0F);
        h_r1.texOffs(32, 32).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);

        h_r2 = new ModelRenderer(this);
        h_r2.setPos(-2.5F, -32.4779F, 8.6769F);
        model.addChild(h_r2);
        setRotationAngle(h_r2, -1.3588F, -0.6003F, -0.121F);
        h_r2.texOffs(32, 32).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);

        h_r3 = new ModelRenderer(this);
        h_r3.setPos(2.5F, -32.4779F, 8.6769F);
        model.addChild(h_r3);
        setRotationAngle(h_r3, -1.3588F, 0.6003F, 0.121F);
        h_r3.texOffs(32, 32).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);

        h_r4 = new ModelRenderer(this);
        h_r4.setPos(-1.5F, -30.5647F, 9.1693F);
        model.addChild(h_r4);
        setRotationAngle(h_r4, -2.1293F, -0.3378F, 0.2042F);
        h_r4.texOffs(32, 32).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);

        h_r5 = new ModelRenderer(this);
        h_r5.setPos(1.5F, -30.5647F, 9.1693F);
        model.addChild(h_r5);
        setRotationAngle(h_r5, -2.1293F, 0.3378F, -0.2042F);
        h_r5.texOffs(32, 32).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -31.0F, 3.0F);
        model.addChild(cube_r1);
        setRotationAngle(cube_r1, -1.3963F, 0.0F, 0.0F);
        cube_r1.texOffs(44, 32).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);




        addof(model);
    }

}

