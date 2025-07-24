package org.sn.shopliker.services;

import org.sn.shopliker.entity.Category;

import java.util.List;

public interface CategoryService {

     Category saveCategory(Category category);
     Category updateCategory(Category category);
     void deleteCategory(Category category);
     Category findCategoryById(Long id);
     List<Category> findAllCategories();
}
