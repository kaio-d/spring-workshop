package com.study.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.workshop.entities.Order;
import com.study.workshop.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
