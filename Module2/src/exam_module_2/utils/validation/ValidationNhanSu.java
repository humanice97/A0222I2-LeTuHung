package exam_module_2.utils.validation;

import java.util.Scanner;

public class ValidationNhanSu {
    public static Scanner scanner = new Scanner(System.in);

    public String kiemTraRong() {
        while (true) {
            String result = scanner.nextLine();
            if (!result.trim().isEmpty()) {
                return result;
            } else {
                System.out.println("Khong duoc de trong");
                System.out.println("Vui long nhap lai");
            }
        }
    }

    public int kiemTraSo() {
        boolean check;
        while (true) {
            String result = kiemTraRong();
            check = result.matches("^\\d+$");
            if (check) {
                return Integer.parseInt(result);
            } else {
                System.out.println("Khong duoc la chuoi");
                System.out.println("Vui long nhap lai");
            }
        }
    }


    public String kiemTraMaDinhDanhNV() {
        boolean check;
        while (true) {
            String result = kiemTraRong();
            check = result.matches("[N][V]-\\d{3}");
//            check1 = result.matches("[H][V]-\\d{3}");
            if (check) {
                return result;
            } else {
                System.out.println("Khong dung format NV-XXX");
                System.out.println("Vui long nhap lai");
            }
        }
    }
    public String kiemTraMaDinhDanhHV() {

        boolean check1;
        while (true) {
            String result = kiemTraRong();
//            check = result.matches("[N][V]-\\d{3}");
            check1 = result.matches("[H][V]-\\d{3}");
            if (check1) {
                return result;
            } else {
                System.out.println("Khong dung format HV-XXX");
                System.out.println("Vui long nhap lai");
            }
        }
    }

    public String kiemTraNgayThangNam() {
        boolean check;
        while (true) {
            String result = kiemTraRong();
            check = result.matches("\\d{2}/\\d{2}/\\d{4}");
            if (check) {
                return result;
            } else {
                System.out.println("Khong dung format dd/MM/yyyy");
                System.out.println("Vui long nhap lai");
            }
        }
    }

    public int kiemTraSoDienThoai() {
        boolean check;
        while (true) {
            String result = kiemTraRong();
            check = result.matches("[0]\\d{8}");
            if (check) {
                return Integer.parseInt(result);
            } else {
                System.out.println("Khong dung format 0xxxxxxxx");
                System.out.println("Vui long nhap lai");
            }
        }
    }

    public String kiemTraTen() {
        boolean check;
        while (true) {
            String result = kiemTraRong();
            check = result.matches("^[A-Z][a-z]+?\s?[A-Z]?[a-z]+?\s?[A-Z]?[a-z]+$");
            if (check) {
                return result;
            } else {
                System.out.println("Khong dung format ten");
                System.out.println("Vui long nhap lai");
            }
        }
    }

    public String kiemTraChuoi() {
        boolean check;
        while (true) {
            String result = kiemTraRong();
//            check = result.matches("^[A-Z]{2}-\\d+$");
            check = result.matches("^\\w+$");
            if (check) {
                return result;
            } else {
                System.out.println("Your input must be not number");
                System.out.println("Please input again");
            }
        }
    }
    public double kiemTraLuong(){
        boolean check;
        while (true){
            String result = kiemTraRong();
            check = result.matches("^\\d+\\.\\d+$");
            if(check){
                return Double.parseDouble(result);
            } else {
                System.out.println("Luong cua ban phai theo nguyen tac xxx.x");
                System.out.println("Vui long nhap lai");
            }
        }
    }

}
