package com.example.EmployeeManagementSystem.Service.CustomerServiceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagementSystem.Dto.CustomerDTO;
import com.example.EmployeeManagementSystem.Dto.CustomerSaveDTO;
import com.example.EmployeeManagementSystem.Dto.CustomerUpdateDTO;
import com.example.EmployeeManagementSystem.Model.Customer;
import com.example.EmployeeManagementSystem.Repo.CustomerRepo;

import com.example.EmployeeManagementSystem.Service.CustomerService;


@Service
public class CustomerServiceIMPL implements CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public String addCustomer(CustomerSaveDTO customerSaveDTO) {
		
		Customer customer = new Customer(
			
				customerSaveDTO.getFirstName(),
				customerSaveDTO.getLastName(),
				customerSaveDTO.getSalutation(),
				  customerSaveDTO.getDob()
				
				);
		 customerRepo.save(customer);
		 return customer.getFirstName();
		
	}

	@Override
	public List<CustomerDTO> getAllCustomer() {
		List<Customer> getCustomers = customerRepo.findAll();
		List<CustomerDTO> customerDTOList = new ArrayList<>();
		for(Customer a:getCustomers)
	       {
	           CustomerDTO customerDTO = new CustomerDTO(
	        		a.getId(),   
	        		a.getFirstName(),
	        		a.getLastName(),
	        		a.getSalutation(),
	        		a.getDob()
	 
	       );
	           customerDTOList.add(customerDTO);
	           }
		return customerDTOList;
	}

	@Override
	public String updateCustomers(CustomerUpdateDTO customerUpdateDTO) {
	    if (customerRepo.existsById(customerUpdateDTO.getId())) {
	        Customer customer = customerRepo.findById(customerUpdateDTO.getId()).orElse(null);

	        if (customer != null) {
	            customer.setFirstName(customerUpdateDTO.getFirstName());
	            customer.setLastName(customerUpdateDTO.getLastName());
	            customer.setSalutation(customerUpdateDTO.getSalutation());
	            customer.setDob(customerUpdateDTO.getDob());

	            customerRepo.save(customer);

	            return customer.getFirstName();
	        }
	    } else {
	        System.out.println("Customer with ID " + customerUpdateDTO.getId() + " does not exist");
	    }

	    return null;
	}

	@Override
	public boolean deleteCustomer(String id) {
	    customerRepo.deleteById(id);
	    return true;
	}
}
	
