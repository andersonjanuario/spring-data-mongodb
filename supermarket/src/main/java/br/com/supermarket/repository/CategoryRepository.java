package br.com.supermarket.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.supermarket.dto.Category;

public interface CategoryRepository  extends MongoRepository<Category, Long> {
	
	public Category findByName(String name);
	
	public List<Category> findByNameRegex(String name);

}
