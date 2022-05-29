package ss4_oop.thuc_hanh.LopHinhChuNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle : "+rectangle.display());
        System.out.println("Your Rectangle Area : "+rectangle.getArea());
        System.out.println("Your Rectangle Perimeter : "+rectangle.getPerimeter());
    }
}
