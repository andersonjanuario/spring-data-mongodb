package br.com.supermarket.service;

import java.util.List;

import br.com.supermarket.dto.Category;

public interface CategoryService {
	
	List<Category> findByNameRegex(String name);
	
	Category findByName(String name);
	
	Category create(Category category);
	
	List<Category> findAll();
	
	void remove(Long id);
	
	Category update(Category category);

}
