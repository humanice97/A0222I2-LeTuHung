package model;

public class LoaiMatBang {
    private int id;
    private String tenLoaiMatBang;

    public LoaiMatBang(int id, String tenLoaiMatBang) {
        this.id = id;
        this.tenLoaiMatBang = tenLoaiMatBang;
    }

    public LoaiMatBang() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLoaiMatBang() {
        return tenLoaiMatBang;
    }

    public void setTenLoaiMatBang(String tenLoaiMatBang) {
        this.tenLoaiMatBang = tenLoaiMatBang;
    }

    @Override
    public String toString() {
        return "loaiMatBang{" +
                "id=" + id +
                ", tenLoaiMatBang='" + tenLoaiMatBang + '\'' +
                '}';
    }
}
