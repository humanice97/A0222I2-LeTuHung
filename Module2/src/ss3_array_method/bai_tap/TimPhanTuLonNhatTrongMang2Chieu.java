package ss3_array_method.bai_tap;

import java.util.Arrays;
import java.util.Random;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        int largest = matrix[0][0];
        int[] index = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        System.out.println("The largest element is: " + largest + "\nindex : " + Arrays.toString(index));

    }
}
