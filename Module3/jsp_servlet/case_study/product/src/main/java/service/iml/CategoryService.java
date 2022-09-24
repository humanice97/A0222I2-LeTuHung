package service.iml;

import model.Category;
import repository.iml.CategoryRepository;
import service.ICategoryService;

import java.util.List;

public class CategoryService implements ICategoryService {
    CategoryRepository categoryRepository = new CategoryRepository();
    @Override
    public List<Category> selectAllCategory() {
        return categoryRepository.selectAllCategory();
    }
}
