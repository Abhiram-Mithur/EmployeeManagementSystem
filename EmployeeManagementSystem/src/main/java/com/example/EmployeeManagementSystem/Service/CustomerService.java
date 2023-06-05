package com.example.EmployeeManagementSystem.Service;

import java.util.List;

import org.bson.types.ObjectId;

import com.example.EmployeeManagementSystem.Dto.CustomerDTO;
import com.example.EmployeeManagementSystem.Dto.CustomerSaveDTO;
import com.example.EmployeeManagementSystem.Dto.CustomerUpdateDTO;

public interface CustomerService {

	String addCustomer(CustomerSaveDTO customerSaveDTO);

	List<CustomerDTO> getAllCustomer();

	String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

	

	boolean deleteCustomer(String id);


	

	


}
