package service.impl;

import model.TrangThai;
import repository.impl.TrangThaiRepository;
import service.ITrangThaiService;

import java.util.List;

public class TrangThaiService implements ITrangThaiService {
    TrangThaiRepository trangThaiRepository = new TrangThaiRepository();
    @Override
    public List<TrangThai> selectAllTrangThai() {
        return trangThaiRepository.selectAllTrangThai();
    }
}
