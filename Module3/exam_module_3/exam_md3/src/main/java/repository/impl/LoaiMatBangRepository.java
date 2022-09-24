package repository.impl;

import model.LoaiMatBang;
import model.MatBang;
import repository.DataBaseRepository;
import repository.ILoaiMatBangRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoaiMatBangRepository implements ILoaiMatBangRepository {
    private final String SELECT_ALL = "select * from loai_mat_bang";

    @Override
    public List<LoaiMatBang> selectAllLoaiMatBang() {
        List<LoaiMatBang> loaiMatBangList = new ArrayList();
        Connection connection = DataBaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_loai_mat_bang");
                String tenLoaiMatBang = resultSet.getString("ten_loai_mat_bang");
                loaiMatBangList.add(new LoaiMatBang(id, tenLoaiMatBang));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return loaiMatBangList;
    }
}
