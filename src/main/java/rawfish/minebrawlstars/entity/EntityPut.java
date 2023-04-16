package rawfish.minebrawlstars.entity;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class EntityPut {
    public static void addRenderEntity(World world, Entity entity){
        ClientWorld clientWorld=(ClientWorld)world;
        int c=1000;
        while(true) {
            Entity e = clientWorld.getEntity(c);
            if(e==null){
                break;
            }else{
                c++;
            }
        }
        clientWorld.putNonPlayerEntity(c,entity);
    }

    public static void addServerEntity(World world,Entity entity){
        world.addFreshEntity(entity);
    }
}
