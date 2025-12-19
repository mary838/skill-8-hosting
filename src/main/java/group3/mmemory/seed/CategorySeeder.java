package group3.mmemory.seed;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import group3.mmemory.entity.CategoryEntity;
import group3.mmemory.repository.CategoryRepository;

@Component
public class CategorySeeder implements CommandLineRunner {

    private final CategoryRepository categoryRepository;

    public CategorySeeder(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) {

        if (categoryRepository.count() == 0) { // only seed if empty
            categoryRepository.save(CategoryEntity.builder().name("Work").build());
            categoryRepository.save(CategoryEntity.builder().name("Study").build());
            categoryRepository.save(CategoryEntity.builder().name("Life").build());
            categoryRepository.save(CategoryEntity.builder().name("Family").build());
            categoryRepository.save(CategoryEntity.builder().name("Travel").build());

            System.out.println("✅ Categories seeded successfully!");
        }
    }
}
