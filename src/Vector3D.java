/**
 * Created by s1581377 on 07/02/17.
 */
public class Vector3D {
    double a;
    double b;
    double c;
    double d = 0;
    double e = 0;
    double f = 0;
    public Vector3D(double x, double y, double z){
        a = x;
        b = y;
        c = z;
    }
    public double getR(){
        d = Math.sqrt((a*a) + (b*b) + (c*c));
        return d;

    }
    public double getTheta(){
        e = Math.acos(c/getR());
        return e;
    }
    public double getPhi(){
        f = Math.atan2(b,a);
        return f;
    }
    public static Vector3D add(Vector3D lhs, Vector3D rhs){
        return new Vector3D(lhs.a + rhs.a,lhs.b+ rhs.b,lhs.c+rhs.c);
    }
    public static Vector3D subtract(Vector3D lhs, Vector3D rhs){
        return new Vector3D(lhs.a - rhs.a,lhs.b - rhs.b,lhs.c-rhs.c);
    }
    public static Vector3D scale( Vector3D v, double scaleFactor){
        return new Vector3D(scaleFactor*v.a,scaleFactor*v.b,scaleFactor*v.c);
    }

}
