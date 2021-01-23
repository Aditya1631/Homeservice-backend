package com.cg.HomeService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.HomeService.Entity.CustomerDetails;
import com.cg.HomeService.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired 
	CustomerService service;
	
	@GetMapping("/CustomerDetails")
	private List<CustomerDetails> getallcustomer()
	{
		return service.getallcustomers();
	}
	
	@GetMapping("/CustomerDetails/{customerid}")
	private CustomerDetails getcustomerbyid(@PathVariable("customerid") int customerid)
	{
		return service.getcustomerbyid(customerid);
	}
	
	
	@DeleteMapping("/CustomerDetails/{customerid}")
	private void deletecustomer(@PathVariable("customerid") int customerid)
	{
		service.deletecustomer(customerid);
	}
	
	
	@PostMapping("/CustomerDetails")
	private int savecustomer(@RequestBody CustomerDetails customer)
	{
		service.savecustomer(customer);
		return customer.getCustomerId();
	}
	
	
	@PutMapping("/CustomerDetails")
	private CustomerDetails updatecustomer(@RequestBody CustomerDetails customer)
	{
		service.savecustomer(customer);
		return customer;
	}
	
	
	

}
