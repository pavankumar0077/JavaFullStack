package com.zensar.olxlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxlogin.model.User;
import com.zensar.olxlogin.service.UserService;

@RestController
public class LoginController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/user/authenticate")
	public void login(@RequestBody User user) {
		// TODO Auto-generated method stub
		
	}

	
	@DeleteMapping("/user/logout")
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

	@PostMapping("/user")
	public User register(@RequestBody User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/user")
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean validateToken() {
		// TODO Auto-generated method stub
		return false;
	}

}
