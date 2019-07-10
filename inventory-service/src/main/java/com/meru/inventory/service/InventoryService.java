package com.meru.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.meru.inventory.Repository.InventoryRepository;
import com.meru.inventory.model.Inventory;
import com.meru.inventory.model.Product;

@Component
public class InventoryService {
	
	@Autowired
	InventoryRepository inventoryRepository;
	
	public Inventory getProductAvailability(Product product) {
		
		Inventory i = inventoryRepository.getInventoryByProduct(product);
		
		if(inventoryRepository.findById(product.getId()).isPresent())
			return inventoryRepository.findById(product.getId()).get();
		else 
			return null;
	}

	public Inventory insert(Product product) {
		
		Inventory i = new Inventory();
		i.setProduct(product);
		i.setItemCount("30");
		
		inventoryRepository.save(i);
		return i;
	}
}
