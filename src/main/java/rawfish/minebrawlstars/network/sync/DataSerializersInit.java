package rawfish.minebrawlstars.network.sync;

import net.minecraft.network.datasync.DataSerializers;

public class DataSerializersInit {
    public static void register(){
        DataSerializers.registerSerializer(Vector3dIDataSerializer.SERIALIZER);
    }
}
