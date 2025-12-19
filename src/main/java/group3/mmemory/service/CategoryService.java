package group3.mmemory.service;

import org.springframework.stereotype.Service;
import java.util.List;

import group3.mmemory.entity.CategoryEntity;
import group3.mmemory.repository.CategoryRepository;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryEntity> getAllCategories() {
        return categoryRepository.findAll();
    }
}
