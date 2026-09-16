package com.example.category_thymeleaf_crud.service;

import com.example.category_thymeleaf_crud.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface CategoryService {
    Page<Category> searchAndPaginate(String keyword, Pageable pageable);
    Optional<Category> findById(Integer id);
    Category save(Category category);
    void deleteById(Integer id);
}