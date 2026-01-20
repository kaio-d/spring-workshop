package com.study.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.workshop.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
