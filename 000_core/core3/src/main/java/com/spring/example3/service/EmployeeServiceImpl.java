package com.spring.example3.service;

import org.springframework.stereotype.Service;

import com.spring.example3.entity.EmployeeEntity;
import com.spring.example3.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	

	@Override
	public EmployeeEntity getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

}
