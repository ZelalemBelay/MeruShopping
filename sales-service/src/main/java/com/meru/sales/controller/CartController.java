package com.meru.sales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.meru.sales.model.Cart;
import com.meru.sales.model.Customer;
import com.meru.sales.model.Product;
import com.meru.sales.service.CartService;
import com.meru.sales.service.SalesService;

@RestController
public class CartController {

	@Autowired
	CartService cartService;
	
	@Autowired
	SalesService salesService;
	
	@PostMapping("/addItemToCart")
	public Cart addItemToCart(@RequestBody Product product, @RequestHeader("custId") String custId) throws Exception {
		
		//get the customer in the current session and fetch its cart. 
		
		Customer cust = salesService.getCustomer(custId);
		
		return this.cartService.addToCart(cust.getCart(), product);
	}
}
