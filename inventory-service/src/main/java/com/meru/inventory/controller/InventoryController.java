package com.meru.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meru.inventory.model.Inventory;
import com.meru.inventory.model.Product;
import com.meru.inventory.service.InventoryService;

@RestController
public class InventoryController {

	@Autowired
	InventoryService inventoryService;
	
	@PostMapping("/getProductAvailability")
	public Inventory getAvailability(@RequestBody Product product) {
		return inventoryService.getProductAvailability(product);
	}
	
	@PostMapping("/insert")
	public Inventory insert(@RequestBody Product product) {
		return inventoryService.insert(product);
	}
}
