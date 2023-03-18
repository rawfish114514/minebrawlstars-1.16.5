package rawfish.minebrawlstars.item.brawler;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import rawfish.minebrawlstars.brawl.HeroFactory;
import rawfish.minebrawlstars.render.head.HeroedHeadModel;
import rawfish.minebrawlstars.item.BaseArmorItem;

import javax.annotation.Nullable;
import java.util.List;

public class HeroedHeadArmorItem extends BaseArmorItem {
    public HeroedHeadArmorItem(HeroRarity rarity){
        this(ArmorMaterial.GOLD,rarity,null,null);
    }
    public HeroedHeadArmorItem(IArmorMaterial material, HeroRarity rarity, HeroFactory heroFactory, HeroedHeadModel model) {
        super(material, EquipmentSlotType.HEAD,
                new Properties().durability(0));
        this.rarity=rarity;
        this.heroFactory=heroFactory;
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        this.undefaultModifiers= builder.build();

        this.model=model;
    }
    public HeroFactory heroFactory;

    public int getDamage(ItemStack stack){
        return 0;
    }

    public HeroRarity rarity;
    @Override
    public ITextComponent getName(ItemStack itemStack) {
        return new StringTextComponent(HeroRarity.BOLD+new TranslationTextComponent(this.getDescriptionId(itemStack)).getString());
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
        if(rarity==HeroRarity.CHROMATIC){
            p_77624_3_.add(new ChromaticText(
                    new TranslationTextComponent(rarity.key).getString()
                    +" "
                    +new TranslationTextComponent("itemtype.minebrawlstars.hero").getString()
            ));
        }else {
            p_77624_3_.add(new StringTextComponent(rarity.format
                    +new TranslationTextComponent(rarity.key).getString()
                    +" "
                    +new TranslationTextComponent("itemtype.minebrawlstars.hero").getString()
            ));
        }
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    public Multimap<Attribute, AttributeModifier> undefaultModifiers;
    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType p_111205_1_) {
        return p_111205_1_ == this.slot ? this.undefaultModifiers : super.getDefaultAttributeModifiers(p_111205_1_);
    }

    public HeroedHeadModel model;

    @OnlyIn(Dist.CLIENT)
    @Nullable
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default)
    {
        return (A)model;
    }


    public enum HeroRarity{
        STARTING("\u00a7f","rarity.minebrawlstars.starting"),
        RARE("\u00a7a","rarity.minebrawlstars.rare"),
        SUPERRARE("\u00a79","rarity.minebrawlstars.superrare"),
        EPIC("\u00a75","rarity.minebrawlstars.epic"),
        MYTHIC("\u00a7c","rarity.minebrawlstars.mythic"),
        LEGENDARY("\u00a7e","rarity.minebrawlstars.legendary"),
        CHROMATIC("\u00a7d","rarity.minebrawlstars.chromatic");

        public static String BOLD="\u00a7l";

        private HeroRarity(String format, String key){
            this.format=format;
            this.key=key;
        }
        public final String format;
        public final String key;

    }

    public static class ChromaticText extends StringTextComponent{

        public ChromaticText(String str) {
            super(str);
            this.str=str;
        }

        public String str;

        @Override
        public String getText() {
            return str;
        }
        @Override
        public String getContents() {
            String tex=getChromaticText();
            return tex;
        }

        public static String[] formats={
                "\u00a7e",//黄色
                "\u00a7c",//红色
                "\u00a75",//紫色
        };

        public String getChromaticText(){
            long time= System.currentTimeMillis();
            int index= (int) (time%900);
            index=index/300;
            char[] cs=str.toCharArray();
            StringBuilder sb=new StringBuilder(str.length()*2);
            if(cs.length>3) {
                double off=index;
                for(int i=0;i<cs.length;i++){
                    sb.append(formats[(int)(off)]);
                    sb.append(cs[i]);
                    off+=3d/cs.length;
                    if(off>=3){
                        off-=3;
                    }
                }
            }else{
                for (int i = 0; i < cs.length; i++) {
                    sb.append(formats[index++]);
                    sb.append(cs[i]);
                    if (index == 3) {
                        index = 0;
                    }
                }
            }
            return sb.toString();
        }
    }
}
