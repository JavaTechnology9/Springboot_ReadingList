package com.javatechnology.service;

import com.javatechnology.model.User;

public interface UserService {
	void save(User user);

    User findByUsername(String username);

}
