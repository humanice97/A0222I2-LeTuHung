package repository.impl;

import model.MatBang;
import repository.DataBaseRepository;
import repository.IMatBangRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MatBangRepository implements IMatBangRepository {
    private final String SELECT_ALL = "select * from mat_bang";
    private final String DELETE = "delete from mat_bang where ma_mat_bang = ?";
    private final String CREATE = "INSERT INTO `mat_bang` (`ma_mat_bang`, `dien_tich`, `ma_trang_thai`, `tang`, `ma_loai_mat_bang`, `gia_cho_thue`, `ngay_bat_dau`) VALUES (?, ?, ?, ?, ?, ?, ?)";


    @Override
    public void createMatBang(MatBang matBang) {
        Connection connection = DataBaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE);
            preparedStatement.setString(1,matBang.getMaMatBang());
            preparedStatement.setInt(2,matBang.getDienTich());
            preparedStatement.setInt(3,matBang.getTrangThai());
            preparedStatement.setInt(4,matBang.getTang());
            preparedStatement.setInt(4,matBang.getTang());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List<MatBang> searchMatBang() {
        return null;
    }

    @Override
    public List<MatBang> selectAllMatBang() {
        List<MatBang> matBangList = new ArrayList();
        Connection connection = DataBaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String maMatBang = resultSet.getString("ma_mat_bang");
                int dienTich = resultSet.getInt("dien_tich");
                int maTrangThai = resultSet.getInt("ma_trang_thai");
                int tang = resultSet.getInt("tang");
                int maLoaiMatBang = resultSet.getInt("ma_loai_mat_bang");
                int giaChoThue = resultSet.getInt("gia_cho_thue");
                String ngayBatDau = resultSet.getString("ngay_bat_dau");
                String ngayKetThuc = resultSet.getString("ngay_ket_thuc");
                matBangList.add(new MatBang(maMatBang,dienTich,maTrangThai,tang,maLoaiMatBang,giaChoThue,ngayBatDau,ngayKetThuc));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return matBangList;
    }

    @Override
    public boolean deleteMatBang(String id) {
        Connection connection = DataBaseRepository.getConnectDB();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setString(1, id);
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return false;
    }

    @Override
    public boolean updateProduct(MatBang matBang) {
        return false;
    }
}
