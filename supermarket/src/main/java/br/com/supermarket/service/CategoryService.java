package br.com.supermarket.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.supermarket.dto.Category;

/**
 * The Interface CategoryService.
 */
public interface CategoryService {
	
	List<Category> findByNameRegex(String name);

	Category findByName(String name);

	Category findById(Long id);

	Category create(Category category);

	List<Category> findAll();

	void remove(Long id);

	Category update(Category category);

}
