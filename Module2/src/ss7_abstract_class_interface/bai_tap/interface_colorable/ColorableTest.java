package ss7_abstract_class_interface.bai_tap.interface_colorable;

import ss7_abstract_class_interface.bai_tap.interface_resizeable.Shape;

public class ColorableTest {
    public static void main(String[] args) {
        int size = 3;
        Shape[] shape = new Shape[size];
        shape[0] = new Circle(3.0);
        shape[1] = new Square(5.0);
        shape[2] = new Square(3.2);

        for (int i = 0; i < size; i++) {
            System.out.println("Shape " + i + " - Area is: " + shape[i].getArea());
            if (shape[i] instanceof Square) {
                System.out.println("Shape " + i + " is Colorable ");
                ((Square) shape[i]).howToColor();
            }
        }

    }
}
