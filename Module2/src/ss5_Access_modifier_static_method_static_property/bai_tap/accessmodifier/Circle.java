package ss5_Access_modifier_static_method_static_property.bai_tap.accessmodifier;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Circle {
    private double radius = 4.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap ban kinh: ");
        double radius = scanner.nextDouble();
        circle.setRadius(radius);
        System.out.println("Dien tich la: " + circle.getArea() + " voi ban kinh r = " + circle.getRadius() );
    }
}
