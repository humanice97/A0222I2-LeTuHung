package ss3_array_method.bai_tap;

import java.util.Random;
import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array2d = new int[3][3];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = new Random().nextInt(5);
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println("");
        }
        int inputCol;
        System.out.println("Sum Col ?: ");
        inputCol = scanner.nextInt();
        // 01 11 21
        int sum = 0;
        for (int i = 0; i < array2d.length; i++) {
                sum += array2d[i][inputCol];

        }
        System.out.println("Sum : " + sum);

    }
}
