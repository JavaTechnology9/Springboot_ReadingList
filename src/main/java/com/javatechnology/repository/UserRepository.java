package com.javatechnology.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechnology.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);

}
