package com.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.model.User;



public interface UserRepository extends JpaRepository<User, Long> {

public User findByUsername(String username);	
	
}
