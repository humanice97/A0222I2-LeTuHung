package ss1_introduction_java.thuc_hanh.sudungtoantu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        width = scanner.nextFloat();

        System.out.println("Enter the height: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}