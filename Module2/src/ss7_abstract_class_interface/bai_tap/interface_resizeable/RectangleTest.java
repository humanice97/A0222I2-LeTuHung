package ss7_abstract_class_interface.bai_tap.interface_resizeable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        System.out.println("RECTANGLE: ");
        Rectangle rectangle1 = new Rectangle(4.2, 3.2);
        System.out.println("Rectangle before resizing: " + rectangle1);
        rectangle1.resize(70);
        System.out.println("Rectangle after resizing: " + rectangle1);
    }
}
