package br.com.supermarket.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.supermarket.dto.SuperMarket;
import br.com.supermarket.repository.SuperMarketRepository;
import br.com.supermarket.service.SuperMarketService;

/**
 * The Class SuperMarketServiceImpl.
 */
@Service
public class SuperMarketServiceImpl implements SuperMarketService {

	/** The repository. */
	@Autowired
	SuperMarketRepository repository;

	@Override
	public SuperMarket create(SuperMarket superMarket) {
		return repository.save(superMarket);
	}

	@Override
	public List<SuperMarket> findAll() {
		return repository.findAll();
	}

	@Override
	public void remove(Long id) {
		repository.deleteById(id);
	}

	@Override
	public SuperMarket update(SuperMarket superMarket) {		
		return repository.save(superMarket);
	}

	@Override
	public SuperMarket findById(Long id) {
		Optional<SuperMarket> purchase = repository.findById(id);
		return (purchase.isPresent())?purchase.get():null;
	}

}
