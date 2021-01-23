package com.cg.HomeService.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.HomeService.Entity.CustomerDetails;

public interface ICustomerDetailsDAO extends JpaRepository<CustomerDetails, Integer>{
	
	
}
