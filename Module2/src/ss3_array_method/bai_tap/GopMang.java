package ss3_array_method.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size1, size2;
        int[] array1;
        int[] array2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size 1: ");
            size1 = scanner.nextInt();
            if (size1 > 20) {
                System.out.println("Enter a size 1");
            }
        } while (size1 > 20);
        array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array1[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        do {
            System.out.println("\nEnter a size 2 :");
            size2 = scanner.nextInt();
            if (size2 > 20) {
                System.out.println("Enter a size 2");
            }
        } while (size2 > 20);
        array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array2[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
        int[] array3 = new int[size1 + size2];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.printf("\n%-20s%s", "Element in array combine: ", "");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }

    }
}
