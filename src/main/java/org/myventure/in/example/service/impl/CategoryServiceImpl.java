package org.myventure.in.example.service.impl;

import java.util.List;

import org.myventure.in.example.Model.Category;
import org.myventure.in.example.repository.CategoryRepository;
import org.myventure.in.example.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	private final CategoryRepository categoryRepository;
	
	public CategoryServiceImpl(CategoryRepository categoryRepository){
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category createCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public Category getCategory(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id).get();
	}

	@Override
	public Category updateCategory(Long id, Category category) {
		// TODO Auto-generated method stub
		Category existCategory = categoryRepository.findById(id).get();
		if(existCategory==null) {
			return null;
		}
		category.setCategoryId(id);
		Category updatedCategory = categoryRepository.save(category);
		return updatedCategory;
	}

	@Override
	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
	}

}
