package rawfish.minebrawlstars.entity.brawl;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.client.CChatMessagePacket;
import net.minecraft.network.play.server.SChatPacket;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.network.NetworkHooks;
import rawfish.minebrawlstars.network.sync.Vector3dIDataSerializer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShellyAttackBulletEntity extends Entity {
    static{
        MinecraftForge.EVENT_BUS.register(ShellyAttackBulletEntity.class);
    }

    public static List<ShellyAttackBulletEntity> entityList=new ArrayList<>();

    public ShellyAttackBulletEntity(EntityType<ShellyAttackBulletEntity> entityType, World world) {
        super(entityType,world);
        init();
    }


    public boolean hasMove;

    public Vector3d speed;

    public Vector3d basePosition;

    public long time;

    public void init(){
        hasMove=false;
        time=-1;
        speed=null;
        basePosition=null;

        entityList.add(this);
    }

    @SubscribeEvent
    public static void onRenderTick(TickEvent.RenderTickEvent event){
        if(event.phase==TickEvent.Phase.START){
            for (int i = 0; i < entityList.size(); i++) {
                entityList.get(i).tick();
            }
        }
    }

    @Override
    public void tick(){
        super.tick();
        if(hasMove){
            if(time==-1){
                time=System.currentTimeMillis();
            }
            long t=System.currentTimeMillis()-time;
            if(t<500){
                positionment(t/500.0);
            }else{
                hasMove=false;
                remove();
                entityList.remove(this);
            }
        }
    }

    @Override
    public void remove(){
        super.remove();
    }


    public void positionment(double s){
        setPosition(
                basePosition.x+ speed.x*s,
                basePosition.y+ speed.y*s,
                basePosition.z+ speed.z*s
        );
    }

    public void setPosition(double x,double y,double z){
        super.setPos(x,y,z);
    }
    @Override
    public void setPos(double x, double y, double z) {

    }

    @Override
    public Vector3d getPacketCoordinates() {
        return position();
    }

    @Override
    public void setPacketCoordinates(double p_213312_1_, double p_213312_3_, double p_213312_5_) {
        this.setPacketCoordinates(new Vector3d(p_213312_1_, p_213312_3_, p_213312_5_));
    }

    @Override
    public void setPacketCoordinates(Vector3d p_242277_1_) {

    }



    @Override
    protected void defineSynchedData() {}
    @Override
    protected void readAdditionalSaveData(CompoundNBT p_70037_1_) {}
    @Override
    protected void addAdditionalSaveData(CompoundNBT p_213281_1_) {}
    @Override
    public IPacket<?> getAddEntityPacket() {
        //return NetworkHooks.getEntitySpawningPacket(this);
        return new SChatPacket(new StringTextComponent(""), ChatType.GAME_INFO, UUID.randomUUID());
    }
}
