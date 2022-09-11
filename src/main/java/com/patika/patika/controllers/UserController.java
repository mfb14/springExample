package com.patika.patika.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.patika.patika.business.abstracts.UserService;
import com.patika.patika.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {

	UserService userService;
	public UserController(UserService userService) {
		this.userService = userService;
	}
	@GetMapping
	public List<User> getAllUsers(){
		return userService.findAllUsers();
	}
	
	
}
