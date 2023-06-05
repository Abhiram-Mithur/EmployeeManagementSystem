package com.example.EmployeeManagementSystem.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.EmployeeManagementSystem.Model.Customer;

public interface CustomerRepo extends MongoRepository<Customer, String> {



}
