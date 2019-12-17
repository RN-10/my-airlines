package com.airlines.travel.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airlines.travel.Entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
}
