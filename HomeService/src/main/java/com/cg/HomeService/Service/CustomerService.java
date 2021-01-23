package com.cg.HomeService.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.HomeService.Dao.ICustomerDetailsDAO;
import com.cg.HomeService.Entity.CustomerDetails;
@Service
public class CustomerService {
	
	@Autowired
	ICustomerDetailsDAO customerdao;
	
	
	public List<CustomerDetails> getallcustomers()
	{
		List<CustomerDetails> customer=new ArrayList<CustomerDetails>();
		customerdao.findAll().forEach(customer1->customer.add(customer1));
		return customer;
	}
	
	public CustomerDetails getcustomerbyid(int customerid)
	{
		return customerdao.findById(customerid).get();
	}
	
	public void savecustomer(CustomerDetails customer)
	{
		customerdao.save(customer);
	}
	
	public void deletecustomer(int customerid)
	{
		customerdao.deleteById(customerid);
	}
	
	public void updatecustomer(CustomerDetails customer, int cusomerid)
	{
		customerdao.save(customer);
	}

}
