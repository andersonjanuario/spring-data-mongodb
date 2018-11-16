package br.com.supermarket.service;

import java.util.List;

import br.com.supermarket.dto.Purchase;

/**
 * The Interface PurchaseService.
 */
public interface PurchaseService {

	Purchase findById(Long id);

	Purchase create(Purchase purchase);

	List<Purchase> findAll();

	void remove(Long id);

	Purchase update(Purchase purchase);

}
