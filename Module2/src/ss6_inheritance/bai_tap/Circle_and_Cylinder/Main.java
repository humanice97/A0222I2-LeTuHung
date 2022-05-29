package ss6_inheritance.bai_tap.Circle_and_Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(2.0, "yellow");
        Cylinder cylinder = new Cylinder(5.0, "red", 3.0);
        Cylinder cylinder1 = new Cylinder(2.0, "blue", 4.0);
        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(cylinder);
        System.out.println(cylinder1);
    }

}
