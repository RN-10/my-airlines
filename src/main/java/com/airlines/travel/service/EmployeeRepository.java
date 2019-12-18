package com.airlines.travel.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airlines.travel.Entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
}
