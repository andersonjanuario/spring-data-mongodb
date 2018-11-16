package br.com.supermarket.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.supermarket.dto.Purchase;
import br.com.supermarket.repository.PurchaseRepository;
import br.com.supermarket.service.PurchaseService;

/**
 * The Class PurchaseServiceImpl.
 */
@Service
public class PurchaseServiceImpl implements PurchaseService {

	/** The repository. */
	@Autowired
	PurchaseRepository repository;

	@Override
	public Purchase create(Purchase item) {
		return repository.save(item);
	}

	@Override
	public List<Purchase> findAll() {
		return repository.findAll();
	}

	@Override
	public void remove(Long id) {
		repository.deleteById(id);
	}

	@Override
	public Purchase update(Purchase item) {		
		return repository.save(item);
	}

	@Override
	public Purchase findById(Long id) {
		Optional<Purchase> purchase = repository.findById(id);
		return (purchase.isPresent())?purchase.get():null;
	}

}
