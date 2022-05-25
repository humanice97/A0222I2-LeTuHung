package ss3_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        int number;
        int index;
        System.out.println("Enter number add to array: ");
        number = scanner.nextInt();
        System.out.println("Enter position: ");
        index = scanner.nextInt();

        System.out.println(Arrays.toString(add(array, number, index)));
    }


    public static int[] add(int[] array, int number, int index) {
        int[] tmp = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        for (int i = tmp.length - 1; i > index; i--) {
            if (i != index) {
                tmp[i] = array[i - 1];
            }
        }
        tmp[index] = number;
        return tmp;
    }
}
