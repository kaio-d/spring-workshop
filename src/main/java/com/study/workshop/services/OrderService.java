package com.study.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.workshop.entities.Order;
import com.study.workshop.entities.User;
import com.study.workshop.repositories.OrderRepository;
import com.study.workshop.repositories.UserRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findByID(long id) {
		Optional<Order> order = repository.findById(id);
		return order.get();
	}
}
