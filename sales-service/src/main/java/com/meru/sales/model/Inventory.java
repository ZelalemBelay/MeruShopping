package com.meru.sales.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Inventory {

	@Id
	@GeneratedValue
	Integer id;
	
	@OneToOne(cascade = {CascadeType.ALL})
	Product product;
	
	String wareHouseLocation;
	String itemCount;
	String stockNumber;
	
	public Inventory() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getWareHouseLocation() {
		return wareHouseLocation;
	}
	public void setWareHouseLocation(String wareHouseLocation) {
		this.wareHouseLocation = wareHouseLocation;
	}
	public String getItemCount() {
		return itemCount;
	}
	public void setItemCount(String itemCount) {
		this.itemCount = itemCount;
	}
	public String getStockNumber() {
		return stockNumber;
	}
	public void setStockNumber(String stockNumber) {
		this.stockNumber = stockNumber;
	}
	
	
}
