package exam_module_2.models;

public class NhanVien extends NhanSu {
    private double luong;
    private String phongBan;
    private String viTri;

    public NhanVien(String maDinhDanh, String ten, String ngaySinh, String diaChi, int soDienThoai, double luong, String phongBan, String viTri) {
        super(maDinhDanh, ten, ngaySinh, diaChi, soDienThoai);
        this.luong = luong;
        this.phongBan = phongBan;
        this.viTri = viTri;
    }

    public NhanVien() {
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public String toString() {
        return "NhanVien{" + super.toString() +
                "luong=" + luong +
                ", phongBan='" + phongBan + '\'' +
                ", viTri='" + viTri + '\'' +
                "} ";
    }
    public String makeData() {
        return super.makeData() +  luong + "," + phongBan + "," + viTri;
    }
}
