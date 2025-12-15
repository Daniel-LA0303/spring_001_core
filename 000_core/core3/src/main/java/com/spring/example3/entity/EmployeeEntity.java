package com.spring.example3.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID")
	private Long employeeId;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name = "HIRE_DATE")
	private LocalDateTime hireDate;
	
	@Column(name = "SALARY")
	private Integer salary;
	
	@Column(name = "COMMISSION_PCT")
	private Integer commissionPCT;
	
	@Column(name = "MANAGER_ID")
	private Long managerId;
	
	@Column(name = "DEPARTMENT_ID")
	private Long departmentId;

	public EmployeeEntity() {
	}

	public EmployeeEntity(Long employeeId, String lastName, String email, String phoneNumber, LocalDateTime hireDate,
			Integer salary, Integer commissionPCT, Long managerId, Long departmentId) {
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commissionPCT = commissionPCT;
		this.managerId = managerId;
		this.departmentId = departmentId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public LocalDateTime getHireDate() {
		return hireDate;
	}

	public Integer getSalary() {
		return salary;
	}

	public Integer getCommissionPCT() {
		return commissionPCT;
	}

	public Long getManagerId() {
		return managerId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setHireDate(LocalDateTime hireDate) {
		this.hireDate = hireDate;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public void setCommissionPCT(Integer commissionPCT) {
		this.commissionPCT = commissionPCT;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

}
