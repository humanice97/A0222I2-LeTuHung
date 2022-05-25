package ss3_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter size of Arrays: ");
        size = Integer.parseInt(scanner.nextLine());
//        size = scanner.nextInt();
        String[] str = new String[size];
        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter char from keyboard" + (i + 1) + " ");
            str[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(str));
    }
}
