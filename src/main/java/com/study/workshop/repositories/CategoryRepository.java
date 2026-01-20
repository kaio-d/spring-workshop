package com.study.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
