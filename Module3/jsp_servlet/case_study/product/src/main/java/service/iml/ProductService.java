package service.iml;

import model.Product;
import repository.iml.ProductRepository;
import service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    ProductRepository productRepository = new ProductRepository();

    @Override
    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }

    @Override
    public List<Product> searchProduct(String name) {
        return productRepository.searchProduct(name);
    }

    @Override
    public List<Product> selectAllProduct() {
        return productRepository.selectAllProduct();

    }

    @Override
    public boolean deleteProduct(int id) {
        productRepository.deleteProduct(id);
        return false;
    }

    @Override
    public boolean updateProduct(Product product) {
        productRepository.updateProduct(product);
        return false;
    }
}
