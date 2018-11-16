package br.com.supermarket.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.supermarket.dto.Category;
import br.com.supermarket.repository.CategoryRepository;
import br.com.supermarket.service.CategoryService;

/**
 * The Class CategoryServiceImpl.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	/** The category repository. */
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category create(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public void remove(Long id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public Category findByName(String name) {
		return categoryRepository.findByName(name);
	}

	@Override
	public List<Category> findByNameRegex(String name) {
		return categoryRepository.findByNameRegex(".*" + name + ".*");
	}

	@Override
	public Category update(Category category) {		
		return categoryRepository.save(category);
	}

	@Override
	public Category findById(Long id) {
		Optional<Category> categoria = categoryRepository.findById(id);
		return (categoria.isPresent())?categoria.get():null;
	}

}