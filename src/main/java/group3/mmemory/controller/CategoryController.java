package group3.mmemory.controller;



import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Locale.Category;

import group3.mmemory.entity.CategoryEntity;
import group3.mmemory.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CategoryEntity> getAllCategories() {
        return categoryService.getAllCategories();
    }
}
