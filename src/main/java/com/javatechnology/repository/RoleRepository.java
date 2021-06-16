package com.javatechnology.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechnology.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	

}
