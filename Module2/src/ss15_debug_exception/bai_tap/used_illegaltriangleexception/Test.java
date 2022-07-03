package ss15_debug_exception.bai_tap.used_illegaltriangleexception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter size 1: ");
                int size1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter size 2: ");
                int size2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter size 3: ");
                int size3 = Integer.parseInt(scanner.nextLine());

                Triangle triangle = new Triangle(size1, size2, size3);
                System.out.println("Perimeter is : " + triangle.getPerimeter());
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
