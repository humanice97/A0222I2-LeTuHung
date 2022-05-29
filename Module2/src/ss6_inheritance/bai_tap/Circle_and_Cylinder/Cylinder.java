package ss6_inheritance.bai_tap.Circle_and_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "Volume=" + getVolume() + "} " + super.toString();
    }


}
