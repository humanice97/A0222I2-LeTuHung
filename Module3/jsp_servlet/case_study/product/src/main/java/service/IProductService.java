package service;

import model.Product;

import java.util.List;

public interface IProductService {
    public void createProduct(Product product);

    public List<Product> searchProduct (String name);

    public List<Product> selectAllProduct();

    public boolean deleteProduct(int id);

    public boolean updateProduct (Product product);
}
