package exam_module_2.controller;

import exam_module_2.services.NhanSuService;
import exam_module_2.utils.expception.DuplicatePersonnalRecordExpception;

import java.util.Scanner;

public class MenuNhanSu {
    public static Scanner scanner = new Scanner(System.in);
    public static NhanSuService nhanSuService = new NhanSuService();

    public static void main(String[] args) {

        boolean check = true;
        while (check) {
            System.out.println("1. Them moi nhan su");
            System.out.println("2. Xoa nhan su");
            System.out.println("3. Xem danh sach nhan su");
            System.out.println("4. Thoat");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("1. Them moi nhan vien");
                    System.out.println("2. Them moi hoc vien");
                    System.out.println("3. Quay lai");
                    choose = scanner.nextLine();
                    switch (choose) {
                        case "1" -> {
                            try {
                                nhanSuService.themNhanVien();
                            } catch (DuplicatePersonnalRecordExpception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        case "2" -> {
                            try {
                                nhanSuService.themHocVien();
                            } catch (DuplicatePersonnalRecordExpception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        case "3" -> System.out.println("Tro ve man hinh chinh");
                    }
                    break;
                case "3":
                    System.out.println("1. Hien thi danh sach nhan su ");
                    System.out.println("2. Tro ve man hinh chinh");
                    choose = scanner.nextLine();
                    switch (choose) {
                        case "1" -> nhanSuService.danhSachNhanSu();
                        case "2" -> System.out.println("Da tro ve man hinh chinh");
                    }
                    break;
                case "2":
                    nhanSuService.xoaNhanSu();
                    break;
                case "4":
                    System.out.println(" Da thoat");
                    check = false;
//                    System.exit(0);
                    break;
                default:
                    System.out.println("Try again !! ");
            }

        }
    }
}
