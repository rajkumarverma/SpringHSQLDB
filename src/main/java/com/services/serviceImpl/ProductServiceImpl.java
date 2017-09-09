package com.services.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.repository.ProductRepository;
import com.services.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository porductRepo;
	@Override
	public void getProducts() {
		porductRepo.getProducts();
	}

}
