package ss7_abstract_class_interface.thuc_hanh.interface_comparator;

import ss6_inheritance.bai_tap.Circle_and_Cylinder.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    public CircleComparator() {
    }

    @Override
    public int compare(Circle c1,Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
