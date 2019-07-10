package com.meru.sales.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.meru.sales.model.Customer;

@FeignClient(name="customer-service", url="http://localhost:8100")
//@RibbonClient(name="customer-service")
public interface CustomerServiceFeignProxy {

	@GetMapping("/getCustomerById/{custId}")
	public Customer getCustomer(@PathVariable("custId") String custId);
}