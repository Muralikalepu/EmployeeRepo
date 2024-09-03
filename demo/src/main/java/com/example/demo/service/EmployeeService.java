package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.EmailAlreadyExistsException;
import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public Employee saveEmployee(Employee employee) {
		validateEmployee(employee);
		return employeeRepo.save(employee);
	}

	private void validateEmployee(Employee employee) {
		 if (employeeRepo.existsByEmail(employee.getEmail())) {
	            throw new EmailAlreadyExistsException("Email already exists: " + employee.getEmail());
	        }
		
	}

}
