package service;

import dto.ProductDTO;
import model.Product;

import java.util.List;
import java.util.Map;

public interface IProductService {
    List<ProductDTO> getAll();

    void save(Product product);

    List<Product> searchByName(String productName);

    Map<String, String> save(String codeStudent, String nameStudent, String point, String gender);

}
