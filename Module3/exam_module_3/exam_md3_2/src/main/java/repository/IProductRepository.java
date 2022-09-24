package repository;

import dto.ProductDTO;
import model.Product;

import java.util.List;
import java.util.Map;

public interface IProductRepository {
    List<ProductDTO> getAll();

    void save(Product product);

    List<Product> searchByName(String productName);
}
