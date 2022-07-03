package ss15_debug_exception.thuc_hanh.used_arrayindexoutofboundsexception;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List element of array: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter index need show: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Value of index " + x + " is : "+ arr[x]);
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("Index out");
        }

    }
}
