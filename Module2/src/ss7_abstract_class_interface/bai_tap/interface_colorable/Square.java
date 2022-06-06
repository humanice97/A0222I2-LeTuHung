package ss7_abstract_class_interface.bai_tap.interface_colorable;

import ss7_abstract_class_interface.bai_tap.interface_resizeable.Shape;

public class Square extends Shape implements Colorable {
    private double size;

    @Override
    public double getArea() {
        return size * size;
    }

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return "A Square with side=" + size + ", which is a subclass of " + super.toString();
    }

    public void howToColor(){
        System.out.println("Color all four sides");
    }

}
