package group3.mmemory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import group3.mmemory.entity.CategoryEntity;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    boolean existsByName(String name);

    List<CategoryEntity> findByNameIsNull();
}
