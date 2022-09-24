package repository;

import model.Category;

import java.util.List;

public interface ICategoryRepository {
    public List<Category> selectAllCategory();
}
