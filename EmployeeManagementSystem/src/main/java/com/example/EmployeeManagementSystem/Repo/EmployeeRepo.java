package com.example.EmployeeManagementSystem.Repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.EmployeeManagementSystem.Model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, Integer> {

	Optional<Employee> findOneByEmailAndPassword(String email, String password);
	 
    Employee findByEmail(String email);
	
}
