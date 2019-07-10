package com.meru.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meru.order.model.Order;
import com.meru.order.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	public Order placeOrder(Order order) {
		return this.orderRepository.save(order);
	}
}
