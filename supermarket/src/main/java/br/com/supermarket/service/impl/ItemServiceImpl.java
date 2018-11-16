package br.com.supermarket.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.supermarket.dto.Item;
import br.com.supermarket.repository.ItemRepository;
import br.com.supermarket.service.ItemService;

/**
 * The Class ItemServiceImpl.
 */
@Service
public class ItemServiceImpl implements ItemService {
	
	/** The repository. */
	@Autowired
	ItemRepository repository;

	@Override
	public Item create(Item item) {
		return repository.save(item);
	}

	@Override
	public List<Item> findAll() {
		return repository.findAll();
	}

	@Override
	public void remove(Long id) {
		repository.deleteById(id);
	}

	@Override
	public Item update(Item item) {		
		return repository.save(item);
	}

	@Override
	public Item findById(Long id) {
		Optional<Item> categoria = repository.findById(id);
		return (categoria.isPresent())?categoria.get():null;
	}

}
