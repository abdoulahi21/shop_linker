package org.sn.shopliker.controllers;

import org.sn.shopliker.entity.Category;
import org.sn.shopliker.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/category")
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @PostMapping("/category")
    public Category saveCategory( @Validated @RequestBody Category category) {
        System.out.println("Category save called");
        return categoryRepository.save(category);
    }
}
