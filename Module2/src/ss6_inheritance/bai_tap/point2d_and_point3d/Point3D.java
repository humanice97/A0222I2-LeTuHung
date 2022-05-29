package ss6_inheritance.bai_tap.point2d_and_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array1 = new float[3];
        array1[0] = getX();
        array1[1] = getY();
        array1[2] = this.z;
        return array1;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{ x= " + getX() + " y= " + getY() +
                " z=" + z +
                "} ";
    }
}
