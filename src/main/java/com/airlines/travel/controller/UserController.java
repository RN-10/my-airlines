package com.airlines.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.travel.Entity.User;
import com.airlines.travel.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<User> getAllUser() {	
		return userService.getAllUsers();
	}
	
	@RequestMapping("/user/{userId}")
	public User getUser(@PathVariable int userId) {	
		return userService.getUser(userId);
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@RequestMapping(value="/user/{userId}", method=RequestMethod.PUT)
	public void updateUser(@PathVariable int userId, @RequestBody User user) {
		userService.updateUser(userId, user);
	}
	
	@RequestMapping(value="/user/{userId}", method=RequestMethod.DELETE)
	public void updateUser(@PathVariable int userId) {
		userService.deleteUser(userId);
	}
}
