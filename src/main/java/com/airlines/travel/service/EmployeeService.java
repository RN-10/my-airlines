package com.airlines.travel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airlines.travel.Entity.Employee;

@Component
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {	
		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	
	public Employee getEmployee(int employeeId) {	
		return employeeRepository.findOne(employeeId);
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void updateEmployee(int employeeId, Employee employee) {
		if (employeeRepository.exists(employeeId)) {
			employeeRepository.save(employee);
		}
	}
	
	public void deleteEmployee (int employeeId) {
		employeeRepository.delete(employeeId);
	}
	
}
