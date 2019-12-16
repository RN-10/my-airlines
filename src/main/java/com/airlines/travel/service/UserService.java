package com.airlines.travel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airlines.travel.Entity.User;

@Component
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers() {	
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	public User getUser(int userId) {	
		return userRepository.findOne(userId);
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}

	public void updateUser(int userId, User user) {
		if (userRepository.exists(userId)) {
			userRepository.save(user);
		}
	}
	
	public void deleteUser (int userId) {
		userRepository.delete(userId);
	}
	
}
