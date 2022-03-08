package com.zensar.olxlogin.service;

import com.zensar.olxlogin.model.User;

public interface UserService {
	
	public void login(User user);
	
	public boolean logout();
	
	public User register(User user);
	
	public User getUser(String username);
	
	public boolean validateToken();
	
	

}
