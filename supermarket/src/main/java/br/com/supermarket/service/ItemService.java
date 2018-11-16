package br.com.supermarket.service;

import java.util.List;

import br.com.supermarket.dto.Item;

/**
 * The Interface ItemService.
 */
public interface ItemService {

	Item findById(Long id);

	Item create(Item item);

	List<Item> findAll();

	void remove(Long id);

	Item update(Item item);

}
