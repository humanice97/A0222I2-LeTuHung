package ss7_abstract_class_interface.bai_tap.interface_resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        System.out.println("CIRCLE: ");
        Circle circle1 = new Circle(3.0);
        System.out.println("Circle before resizing: " + circle1);
        circle1.resize(70);
        System.out.println("Circle after resizing: " + circle1);
    }
}
