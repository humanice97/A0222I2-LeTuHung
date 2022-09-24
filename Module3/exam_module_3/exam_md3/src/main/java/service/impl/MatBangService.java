package service.impl;

import model.MatBang;
import repository.impl.MatBangRepository;
import service.IMatBangService;

import java.util.List;

public class MatBangService implements IMatBangService {
    MatBangRepository matBangRepository = new MatBangRepository();
    @Override
    public void createMatBang(MatBang matBang) {

    }

    @Override
    public List<MatBang> searchMatBang() {
        return null;
    }

    @Override
    public List<MatBang> selectAllMatBang() {
        return matBangRepository.selectAllMatBang();
    }

    @Override
    public boolean deleteMatBang(String id) {
        return matBangRepository.deleteMatBang(id);
    }

    @Override
    public boolean updateProduct(MatBang matBang) {
        return false;
    }
}
