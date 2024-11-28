package org.myventure.in.example.service;

import java.util.List;

import org.myventure.in.example.Model.Category;

public interface CategoryService {
	List<Category> getAllCategory();
	Category createCategory(Category category);
	Category getCategory(Long id);
	Category updateCategory(Long id, Category category);
	void deleteCategory(Long id);
}
