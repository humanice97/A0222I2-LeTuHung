package ss6_inheritance.bai_tap.point2d_and_point3d;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1, 3);
        System.out.println("Before 2D: " + point2D);
        point2D.setXY(2.2f, 3.0f);
        System.out.println("After 2D" + Arrays.toString(point2D.getXY()));


        Point3D point3D = new Point3D(3, 4, 2);
        System.out.println("Before 3D: " + point3D);
        point3D.setXYZ(3.2f, 1, 3.5f);
        System.out.println("After 3D: " + Arrays.toString(point3D.getXYZ()));
    }
}
