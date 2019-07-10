package com.meru.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meru.customer.model.Customer;
import com.meru.customer.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public Customer addCustomer(Customer customer){
		customerRepository.save(customer);
		return customer;
	}

	public Customer getCustomer(String custId) {
		if(customerRepository.findById(Integer.valueOf(custId)).isPresent())
		return customerRepository.findById(Integer.valueOf(custId)).get();
		
		else return null;
	}

}
