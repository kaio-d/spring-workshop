package com.study.workshop.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.study.workshop.entities.Category;
import com.study.workshop.entities.Order;
import com.study.workshop.entities.Product;
import com.study.workshop.entities.User;
import com.study.workshop.entities.enums.OrderStatus;
import com.study.workshop.repositories.CategoryRepository;
import com.study.workshop.repositories.OrderRepository;
import com.study.workshop.repositories.ProductRepository;
import com.study.workshop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		Category eletronics = new Category(null, "Electronics");
		Category books = new Category(null, "Books");
		Category computers = new Category(null, "Computers"); 
		
		User firstUser = new User(null, "Kaio Mancini", "kaio@teste.com", "11999999999", "12345");
		User secondtUser = new User(null, "Leticia Mancini", "leticia@teste.com", "11999999999", "12345");
		
		Order firstOrder = new Order(null, Instant.parse("2026-01-20T19:20:15Z"), OrderStatus.SHIPPED , firstUser);
		Order secondOrder = new Order(null, Instant.parse("2026-01-13T10:20:15Z"), OrderStatus.PAID, secondtUser);
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		userRepository.saveAll(Arrays.asList(firstUser, secondtUser));
		orderRepository.saveAll(Arrays.asList(firstOrder, secondOrder));
		categoryRepository.saveAll(Arrays.asList(eletronics, books, computers));
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		p1.getCategories().add(books);
		p2.getCategories().add(eletronics);
		p3.getCategories().add(computers);
		p3.getCategories().add(eletronics);
		p4.getCategories().add(computers);
		p4.getCategories().add(eletronics);
		p5.getCategories().add(books);
		
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
	}
}
