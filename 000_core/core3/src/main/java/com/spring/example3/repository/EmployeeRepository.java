package com.spring.example3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.example3.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{

}
