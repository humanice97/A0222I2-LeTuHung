package service.impl;

import dto.ProductDTO;
import model.Product;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import service.IProductService;

import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    IProductRepository iTempRepository = new ProductRepository();

    @Override
    public List<ProductDTO> getAll() {
        return this.iTempRepository.getAll();
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public List<Product> searchByName(String productName) {
        return null;
    }

    @Override
    public Map<String, String> save(String codeStudent, String nameStudent, String point, String gender) {
        return null;
    }
}
