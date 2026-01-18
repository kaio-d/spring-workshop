package com.study.workshop.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.study.workshop.entities.User;
import com.study.workshop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User firstUser = new User(null, "Kaio Mancini", "kaio@teste.com", "11999999999", "12345");
		User secondtUser = new User(null, "Leticia Mancini", "leticia@teste.com", "11999999999", "12345");
		
		userRepository.saveAll(Arrays.asList(firstUser, secondtUser));
	}
}
