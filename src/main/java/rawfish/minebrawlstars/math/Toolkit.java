package rawfish.minebrawlstars.math;

import net.minecraft.util.math.vector.Vector3d;

public class Toolkit {
    public static final Vector3d axisX=new Vector3d(1,0,0);
    public static final Vector3d axisY=new Vector3d(0,1,0);
    public static final Vector3d axisZ=new Vector3d(0,0,1);

    // R
    public static Matrix33 rotMatrix(Vector3d a,double t){
        double st=sin(t);
        double ct=cos(t);
        double at=1-ct;

        return new Matrix33(
                ct+at*pow(a.x),
                at*a.x*a.y+st*a.z,
                at*a.x*a.z-st*a.y,
                at*a.x*a.y-st*a.z,
                ct+at*pow(a.y),
                at*a.y*a.z+st*a.x,
                at*a.x*a.z+st*a.y,
                at*a.y*a.z-st*a.x,
                ct+at*pow(a.z)
        );
    }

    public static double sin(double a){
        return Math.sin(a);
    }

    public static double cos(double a){
        return Math.cos(a);
    }

    public static double pow(double a){
        return a*a;
    }
}
