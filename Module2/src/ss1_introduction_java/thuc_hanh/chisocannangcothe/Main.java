package ss1_introduction_java.thuc_hanh.chisocannangcothe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Input weight: ");
        weight = scanner.nextDouble();
        System.out.println("Input height: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("BMI : " + bmi);

        if (bmi < 18) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else
            System.out.println("Obese");

    }
}
