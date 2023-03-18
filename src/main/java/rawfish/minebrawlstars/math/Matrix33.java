package rawfish.minebrawlstars.math;

import net.minecraft.util.math.vector.Vector3d;

/**
 * |x1 x2 x3|
 * |y1 y2 y3|
 * |z1 z2 z3|
 */
public class Matrix33 {
    public final double x1;
    public final double y1;
    public final double z1;
    public final double x2;
    public final double y2;
    public final double z2;
    public final double x3;
    public final double y3;
    public final double z3;

    public Matrix33(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
        this.x3 = x3;
        this.y3 = y3;
        this.z3 = z3;
    }

    /**
     * |v1 v2 v3|
     */
    public Matrix33(Vector3d v1,Vector3d v2,Vector3d v3){
        this(v1.x,v1.y,v1.z,v2.x,v2.y,v2.z,v3.x,v3.y,v3.z);
    }

    /**
     * M[row]
     */
    public Vector3d vector(int row){
        if(row==0){
            return new Vector3d(x1,y1,z1);
        }
        if(row==1){
            return new Vector3d(x2,y2,z2);
        }
        return new Vector3d(x3,y3,z3);
    }

    /**
     * M*v
     */
    public Vector3d multiply(Vector3d vector3d){
        return new Vector3d(
                vector3d.x*x1+vector3d.y*x2+vector3d.z*x3,
                vector3d.x*y1+vector3d.y*y2+vector3d.z*y3,
                vector3d.x*z1+vector3d.y*z2+vector3d.z*z3
        );
    }

    /**
     * M*N
     */
    public Matrix33 multiply(Matrix33 matrix33){
        return new Matrix33(
                multiply(matrix33.vector(0)),
                multiply(matrix33.vector(1)),
                multiply(matrix33.vector(2))
        );
    }
}
