package repository;

import model.MatBang;

import java.util.List;

public interface IMatBangRepository {
    public void createMatBang(MatBang matBang);

    public List<MatBang> searchMatBang ();

    public List<MatBang> selectAllMatBang();

    public boolean deleteMatBang(String id);

    public boolean updateProduct (MatBang matBang);
}
