package com.spring.example3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.example3.entity.EmployeeEntity;
import com.spring.example3.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/{id}")
	public EmployeeEntity getEmployeeById(@PathVariable Long id) {
		
		return employeeService.getEmployeeById(id);
	}

}
