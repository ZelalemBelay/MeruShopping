package com.meru.sales.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meru.sales.model.Customer;

@Service
public class SalesService {

	@Autowired
	CustomerServiceFeignProxy customerServiceFeignProxy;
	
	public Customer getCustomer(String custId) {
		return customerServiceFeignProxy.getCustomer(custId);
	}
}
