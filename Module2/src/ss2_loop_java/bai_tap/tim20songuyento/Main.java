package ss2_loop_java.bai_tap.tim20songuyento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Moi nhap so nguyen to can in ra: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int m = 2;
        while (count < n) {
            if (checkSNT(m)) {
                System.out.println(m);
                count++;
            }
            m++;

        }
    }

    public static boolean checkSNT(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
