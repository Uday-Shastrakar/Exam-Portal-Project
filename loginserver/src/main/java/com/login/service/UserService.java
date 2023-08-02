package com.login.service;

import java.util.Set;

import com.login.model.User;
import com.login.model.UserRole;



public interface UserService {
    //creating user
	
	public User createUser(User user,Set<UserRole> userRoles) throws Exception; 
		
    // get user by username
	
	public User getUser(String username);
	
	//delete user by username or id
	public void deleteUser(Long userId);
	//update user (manualy)
	public void updateUser(User user);

	
}
