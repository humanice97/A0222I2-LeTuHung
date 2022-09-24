package repository;

import model.LoaiMatBang;

import java.util.List;

public interface ILoaiMatBangRepository {
    public List<LoaiMatBang> selectAllLoaiMatBang();
}
