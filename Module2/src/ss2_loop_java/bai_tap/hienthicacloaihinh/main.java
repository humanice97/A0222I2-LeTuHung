package ss2_loop_java.bai_tap.hienthicacloaihinh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //hinh chu nhat
        int cdai, crong;
        System.out.println("Moi nhap chieu dai: ");
        cdai = scanner.nextInt();
        System.out.println("Moi nhap chieu rong: ");
        crong = scanner.nextInt();
        for (int i = 0; i < cdai; i++) {
            for (int j = 0; j < crong; j++) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
        System.out.println("----------");

        //tam giac can thuan

        int chieudai;
        System.out.println("Moi nhap chieu dai tam giac vuong: ");
        chieudai = scanner.nextInt();
        for (int i = 1; i <= chieudai; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println("\r");
        }
        //tam giac can nguoc
        int chieudai1;
        System.out.println("Moi nhap chieu dai tam giac vuong top-left: ");
        chieudai1 = scanner.nextInt();
        for (int i = chieudai1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("\r");
        }
    }
}
