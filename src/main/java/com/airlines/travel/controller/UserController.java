package com.airlines.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.airlines.travel.Entity.Employee;
import com.airlines.travel.service.EmployeeService;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees() {	
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {	
		return employeeService.getEmployee(employeeId);
	}
	
	@RequestMapping(value="/employee", method=RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(value="/employee/{employeeId}", method=RequestMethod.PUT)
	public void updateEmployee(@PathVariable int employeeId, @RequestBody Employee employee) {
		employeeService.updateEmployee(employeeId, employee);
	}
	
	@RequestMapping(value="/employee/{employeeId}", method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable int employeeId) {
		employeeService.deleteEmployee(employeeId);
	}
}
