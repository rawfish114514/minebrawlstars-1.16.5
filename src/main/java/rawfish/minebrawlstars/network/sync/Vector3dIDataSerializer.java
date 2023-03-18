package rawfish.minebrawlstars.network.sync;

import net.minecraft.network.PacketBuffer;
import net.minecraft.network.datasync.IDataSerializer;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.system.CallbackI;

public class Vector3dIDataSerializer implements IDataSerializer<Vector3d> {
    public static final Vector3dIDataSerializer SERIALIZER=new Vector3dIDataSerializer();
    private Vector3dIDataSerializer(){}

    @Override
    public void write(PacketBuffer buffer, Vector3d vector3d) {
        buffer.writeDouble(vector3d.x);
        buffer.writeDouble(vector3d.y);
        buffer.writeDouble(vector3d.z);
    }

    @Override
    public Vector3d read(PacketBuffer buffer) {
        return new Vector3d(
                buffer.readDouble(),
                buffer.readDouble(),
                buffer.readDouble()
        );
    }

    @Override
    public Vector3d copy(Vector3d vector3d) {
        return vector3d==null?Vector3d.ZERO:new Vector3d(vector3d.x,vector3d.y,vector3d.z);
    }
}
