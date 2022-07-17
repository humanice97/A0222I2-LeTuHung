package exam_module_2.services;

import exam_module_2.models.HocVien;
import exam_module_2.models.NhanVien;
import exam_module_2.utils.expception.DuplicatePersonnalRecordExpception;
import exam_module_2.utils.read_and_write.FileHelper;
import exam_module_2.utils.validation.ValidationNhanSu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhanSuService implements ImpNhanSu {
    public static Scanner scanner = new Scanner(System.in);
    public static List<NhanVien> nhanViens = new ArrayList<>();
    public static List<HocVien> hocViens = new ArrayList<>();
    public static ValidationNhanSu validationNhanSu = new ValidationNhanSu();
    public static final String HOCVIEN_PATH = "src/exam_module_2/data/student_record.csv";
    public static final String NHANVIEN_PATH = "src/exam_module_2/data/employee_record.csv";

    static {
        try {
            nhanViens = FileHelper.readNhanVien(NHANVIEN_PATH);
            hocViens = FileHelper.readHocVien(HOCVIEN_PATH);
            if (nhanViens.isEmpty() || hocViens.isEmpty()) {
                throw new IOException("Du lieu trong!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void themNhanVien() throws DuplicatePersonnalRecordExpception {

        List<NhanVien> nhanVienList = new ArrayList<>();
        System.out.println("Vui long nhap ma dinh danh");
        String maDinhDanh = validationNhanSu.kiemTraMaDinhDanhNV();
        for (NhanVien nhanVien : nhanViens) {
            if (!nhanVien.getMaDinhDanh().equals(maDinhDanh)) {
                continue;
            }
            throw new DuplicatePersonnalRecordExpception("Ma dinh danh da ton tai");
        }
        System.out.println("Vui long nhap ten");
        String ten = validationNhanSu.kiemTraTen();
        System.out.println("Vui long nhap ngay sinh");
        String ngaySinh = validationNhanSu.kiemTraNgayThangNam();
        System.out.println("Vui long nhap dia chi");
        String diaChi = validationNhanSu.kiemTraChuoi();
        System.out.println("Vui long nhap so dien thoai");
        int soDienThoai = validationNhanSu.kiemTraSoDienThoai();
        System.out.println("Vui long nhap luong");
        double luong = validationNhanSu.kiemTraLuong();
        System.out.println("Vui long nhap phong ban");
        String phongBan = validationNhanSu.kiemTraChuoi();
        System.out.println("Vui long nhap vi tri");
        String viTri = validationNhanSu.kiemTraChuoi();
        System.out.println("Add Success");
        nhanVienList.add(new NhanVien(maDinhDanh, ten, ngaySinh, diaChi, soDienThoai, luong, phongBan, viTri));
        FileHelper.writeNhanVien(nhanVienList, NHANVIEN_PATH, true);
    }

    @Override
    public void themHocVien() throws DuplicatePersonnalRecordExpception {
        List<HocVien> hocVienList = new ArrayList<>();
        System.out.println("Vui long nhap ma dinh danh");
        String maDinhDanh = validationNhanSu.kiemTraMaDinhDanhHV();
        for (HocVien hocVien : hocViens) {
            if (!hocVien.getMaDinhDanh().equals(maDinhDanh)) {
                continue;
            }
            throw new DuplicatePersonnalRecordExpception("Ma dinh danh da ton tai");
        }
        System.out.println("Vui long nhap ten");
        String ten = validationNhanSu.kiemTraTen();
        System.out.println("Vui long nhap ngay sinh");
        String ngaySinh = validationNhanSu.kiemTraNgayThangNam();
        System.out.println("Vui long nhap dia chi");
        String diaChi = validationNhanSu.kiemTraChuoi();
        System.out.println("Vui long nhap so dien thoai");
        int soDienThoai = validationNhanSu.kiemTraSoDienThoai();
        System.out.println("Vui long nhap diem thi");
        int diemThi = validationNhanSu.kiemTraSo();
        System.out.println("Vui long nhap ten lop");
        String tenLop = validationNhanSu.kiemTraChuoi();
        System.out.println("Vui long nhap ngay nhap hoc");
        String ngayNhapHoc = scanner.nextLine();
        System.out.println("Add Success");
        hocVienList.add(new HocVien(maDinhDanh, ten, ngaySinh, diaChi, soDienThoai, diemThi, tenLop, ngayNhapHoc));
        FileHelper.writeHocVien(hocVienList, HOCVIEN_PATH, true);
    }


    @Override
    public void danhSachNhanSu() {
        try {
            nhanViens = FileHelper.readNhanVien(NHANVIEN_PATH);
            hocViens = FileHelper.readHocVien(HOCVIEN_PATH);
            if (nhanViens.isEmpty() || hocViens.isEmpty()) {
                throw new IOException("Du lieu trong!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (NhanVien nv : nhanViens) {
            System.out.println(nv.toString());
        }
        for (HocVien hv : hocViens) {
            System.out.println(hv.toString());
        }
    }


    @Override
    public void xoaNhanSu() {
        danhSachNhanSu();
        System.out.println("Nhap ma dinh danh can xoa!");
        String maDinhDanhXoa = scanner.nextLine();
        for (int i = 0; i < nhanViens.size(); i++) {
            if (nhanViens.get(i).getMaDinhDanh().equals(maDinhDanhXoa)) {
                System.out.println("Ban co muon xoa khong?");
                System.out.println("1. Co");
                System.out.println("2. Khong");
                int chon = Integer.parseInt(scanner.nextLine());
                if (chon == 1) {
                    nhanViens.remove(i);
                    FileHelper.writeNhanVien(nhanViens, NHANVIEN_PATH, false);
                    System.out.println("Da xoa thanh cong nhan su");
                } else if (chon == 2) {
                    System.out.println("Khong xoa nhan su");
                }
                break;
            }


        }
        for (int i = 0; i < hocViens.size(); i++) {
            if (hocViens.get(i).getMaDinhDanh().equals(maDinhDanhXoa)) {
                System.out.println("Ban co muon xoa khong?");
                System.out.println("1. Co");
                System.out.println("2. Khong");
                int chon = Integer.parseInt(scanner.nextLine());
                if (chon == 1) {
                    hocViens.remove(i);
                    FileHelper.writeHocVien(hocViens, HOCVIEN_PATH, false);
                    System.out.println("Da xoa thanh cong nhan su");
                } else if (chon == 2) {
                    System.out.println("Khong xoa nhan su");
                }
                break;
            }
        }
    }
}
