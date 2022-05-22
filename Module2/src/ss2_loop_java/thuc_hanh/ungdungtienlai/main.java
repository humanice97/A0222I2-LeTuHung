package ss2_loop_java.thuc_hanh.ungdungtienlai;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tien gui: ");
        money = scanner.nextDouble();
        System.out.println("Nhap so thang gui: ");
        month = scanner.nextInt();
        System.out.println("Nhap lai suat: ");
        interestRate = scanner.nextDouble();
        double interestTotal = 0;
        for (int i = 0; i < month; i++) {
            interestTotal += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Lai suat cua ban la: " + interestTotal);
    }
}
