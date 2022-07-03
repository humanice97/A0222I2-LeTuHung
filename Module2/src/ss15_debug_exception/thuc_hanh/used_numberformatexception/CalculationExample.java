package ss15_debug_exception.thuc_hanh.used_numberformatexception;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = scanner.nextInt();
        System.out.println("Input y: ");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x, y);
    }

    public void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("addition x + y: " + a);
            System.out.println("subtraction x - y: " + b);
            System.out.println("multiplication x * y: " + c);
            System.out.println("division x / y: " + d);
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        }
    }
}
