package ss7_abstract_class_interface.thuc_hanh.interface_comparator;

import ss6_inheritance.bai_tap.Circle_and_Cylinder.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6, "blue");
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo");
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles)
            System.out.println(circle);
    }
}
