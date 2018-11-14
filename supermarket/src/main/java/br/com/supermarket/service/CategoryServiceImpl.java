package br.com.supermarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.supermarket.dto.Category;
import br.com.supermarket.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

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

}
