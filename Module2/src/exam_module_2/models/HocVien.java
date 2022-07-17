package exam_module_2.models;

public class HocVien extends NhanSu {
    private int diemThi;
    private String tenLop;
    private String ngayNhapHoc;

    public HocVien(String maDinhDanh, String ten, String ngaySinh, String diaChi, int soDienThoai, int diemThi, String tenLop, String ngayNhapHoc) {
        super(maDinhDanh, ten, ngaySinh, diaChi, soDienThoai);
        this.diemThi = diemThi;
        this.tenLop = tenLop;
        this.ngayNhapHoc = ngayNhapHoc;
    }

    public HocVien() {
    }

    public int getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(int diemThi) {
        this.diemThi = diemThi;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getNgayNhapHoc() {
        return ngayNhapHoc;
    }

    public void setNgayNhapHoc(String ngayNhapHoc) {
        this.ngayNhapHoc = ngayNhapHoc;
    }

    @Override
    public String toString() {
        return "HocVien{" + super.toString() +
                "diemThi=" + diemThi +
                ", tenLop='" + tenLop + '\'' +
                ", ngayNhapHoc='" + ngayNhapHoc + '\'' +
                "} ";
    }
    public String makeData() {
        return super.makeData() +  diemThi + "," + tenLop + "," + ngayNhapHoc;
    }
}
