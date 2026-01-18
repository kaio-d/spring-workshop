package com.study.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
