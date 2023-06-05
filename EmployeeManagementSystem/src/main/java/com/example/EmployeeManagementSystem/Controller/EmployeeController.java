package com.example.EmployeeManagementSystem.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManagementSystem.Dto.CustomerDTO;
import com.example.EmployeeManagementSystem.Dto.CustomerSaveDTO;
import com.example.EmployeeManagementSystem.Dto.CustomerUpdateDTO;
import com.example.EmployeeManagementSystem.Dto.EmployeeDTO;
import com.example.EmployeeManagementSystem.Dto.LoginDTO;
import com.example.EmployeeManagementSystem.Service.CustomerService;
import com.example.EmployeeManagementSystem.Service.EmployeeService;
import com.example.EmployeeManagementSystem.response.LoginResponse;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/employee")



public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
    private CustomerService customerService;
	
	@PostMapping(path = "/save")
		public String saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
		 String id = employeeService.addEmployee(employeeDTO);
				 return id;
	}
	@PostMapping(path = "/login")
	public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO) {
		
	
		LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
	 return ResponseEntity.ok(loginResponse);
}
	
	
	@PostMapping(path = "/create")
	 
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO)
    {
        String id = customerService.addCustomer(customerSaveDTO);
        return id;
    }
	
	@GetMapping(path = "/getAllCustomer")
	 
    public List<CustomerDTO> getAllCustomer(){
	
		List<CustomerDTO> allCustomers = customerService.getAllCustomer();
	return allCustomers;
	}
    
	
	@PutMapping(path = "/update")
	 
    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO)
    {
        String id = customerService.updateCustomers(customerUpdateDTO);
        return id;
    }
	
	
	@DeleteMapping(path = "/deletecustomer/{id}")
	public String deleteCustomer(@PathVariable(value = "id") String id) {
	    boolean deleteCustomer = customerService.deleteCustomer(id);
	    if (deleteCustomer) {
	        return "Customer deleted successfully";
	    } else {
	        return "Failed to delete customer";
	    }
	}

	
	
	
	
	
	
	
}
