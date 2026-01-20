package com.study.workshop.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.study.workshop.entities.Order;
import com.study.workshop.entities.User;
import com.study.workshop.entities.enums.OrderStatus;
import com.study.workshop.repositories.OrderRepository;
import com.study.workshop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User firstUser = new User(null, "Kaio Mancini", "kaio@teste.com", "11999999999", "12345");
		User secondtUser = new User(null, "Leticia Mancini", "leticia@teste.com", "11999999999", "12345");
		
		Order firstOrder = new Order(null, Instant.parse("2026-01-20T19:20:15Z"), OrderStatus.SHIPPED , firstUser);
		Order secondOrder = new Order(null, Instant.parse("2026-01-13T10:20:15Z"), OrderStatus.PAID, secondtUser);
		
		userRepository.saveAll(Arrays.asList(firstUser, secondtUser));
		orderRepository.saveAll(Arrays.asList(firstOrder, secondOrder));
	}
}
