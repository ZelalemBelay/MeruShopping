package com.meru.order.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Order {

	@Id
	@GeneratedValue
	Integer id;
	
	@OneToOne(cascade= {CascadeType.ALL})
	Cart cart;
	
	@OneToOne(cascade= {CascadeType.ALL})
	Customer customer;
	
	public Order() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
