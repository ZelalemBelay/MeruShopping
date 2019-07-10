package com.meru.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meru.order.model.Customer;
import com.meru.order.model.Order;
import com.meru.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/placeOrder")
	public Order placeOrder(Customer customer) {
		Order order = new Order();
		order.setCart(customer.getCart());
		order.setCustomer(customer);
		
		return this.orderService.placeOrder(order);
	}
	
}
