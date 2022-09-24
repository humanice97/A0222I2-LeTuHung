package repository.impl;

import model.LoaiMatBang;
import model.TrangThai;
import repository.DataBaseRepository;
import repository.ITrangThaiRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrangThaiRepository implements ITrangThaiRepository {
    private final String SELECT_ALL = "select * from trang_thai";
    @Override
    public List<TrangThai> selectAllTrangThai() {
        List<TrangThai> trangThaiList = new ArrayList();
        Connection connection = DataBaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_trang_thai");
                String tenTrangThai = resultSet.getString("ten_trang_thai");
                trangThaiList.add(new TrangThai(id, tenTrangThai));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return trangThaiList;
    }
}
