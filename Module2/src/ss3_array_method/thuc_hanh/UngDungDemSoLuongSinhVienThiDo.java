package ss3_array_method.thuc_hanh;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class UngDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Please enter the size: ");
            }
        } while (size > 30);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter mark for student " + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        System.out.println("List of marks : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Marks of students " + (i + 1) +" is : "+ array[i]);
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.println("The number of student passing the exam is: " + count);
    }
}