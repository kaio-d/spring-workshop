package com.study.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.workshop.entities.Category;
import com.study.workshop.entities.Product;
import com.study.workshop.repositories.CategoryRepository;
import com.study.workshop.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findByID(long id) {
		Optional<Product> product = productRepository.findById(id);
		return product.get();
	}
}
