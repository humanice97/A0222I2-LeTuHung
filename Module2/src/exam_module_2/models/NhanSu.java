package exam_module_2.models;

public abstract class NhanSu {
    private String maDinhDanh;
    private String ten;
    private String ngaySinh;
    private String diaChi;
    private int soDienThoai;

    public NhanSu(String maDinhDanh, String ten, String ngaySinh, String diaChi, int soDienThoai) {
        this.maDinhDanh = maDinhDanh;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public NhanSu() {
    }

    public String getMaDinhDanh() {
        return maDinhDanh;
    }

    public void setMaDinhDanh(String maDinhDanh) {
        this.maDinhDanh = maDinhDanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "ma dinh danh=" + maDinhDanh +
                ", ten='" + ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai=" + soDienThoai + ", "
                ;
    }

    public String makeData() {
        return maDinhDanh + "," + ten + "," + ngaySinh + "," + diaChi + "," + soDienThoai + ",";
    }
}
