package ss3_array_method.bai_tap;

import java.util.Random;

public class TinhTongDuongCheoCuaMatrixVuong {
    public static void main(String[] args) {
        int[][] array2d = new int[3][3];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = new Random().nextInt(5);
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println("");
        }
        int sum = 0;
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (i == j || (i + j) == array2d.length - 1) {
                    sum += array2d[i][j];
                    if (i == j && (i + j) == array2d.length - 1){
                        sum += array2d[i][j];
                    }
                }
            }
        }
        //05 14 23 32 41 50
        System.out.println("Sum a Diagonal is : " + sum);
    }
}
