package com.study.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
