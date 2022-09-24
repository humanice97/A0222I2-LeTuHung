package repository;

import model.MatBang;
import model.TrangThai;

import java.util.List;

public interface ITrangThaiRepository {
    public List<TrangThai> selectAllTrangThai();
}
