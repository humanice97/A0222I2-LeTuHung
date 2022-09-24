package repository.impl;

import dto.ProductDTO;
import model.Product;
import repository.BaseRepository;
import repository.IProductRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String SELECT_PRODUCT_DTO = "select product.*, category.name as category_name\n" +
            "from product left join category on product.id = category.category_id;";
    private final String CREATE_PRODUCT = "insert into product(name,price,quantity,color,description,category_id) values (?,?,?,?,?,?)";
    @Override
    public List<ProductDTO> getAll() {
        List<ProductDTO> productDTOList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_DTO);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                float price = resultSet.getFloat("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String category = resultSet.getString("category_name");
                productDTOList.add(new ProductDTO(id,name,price,quantity,color,category));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return productDTOList;
    }

    @Override
    public void save(Product product) {
        Connection connection = BaseRepository.getConnectDB();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(CREATE_PRODUCT);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setFloat(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getDescription());
            preparedStatement.setInt(5, product.getCategory_id());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List<Product> searchByName(String productName) {
        return null;
    }
}
