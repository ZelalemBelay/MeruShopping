package com.meru.sales.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.meru.sales.model.Inventory;
import com.meru.sales.model.Product;

@FeignClient(name="inventory-service", url="http://localhost:8200")
//@RibbonClient(name="inventory-service")
public interface InventoryServiceFeignProxy {

	@PostMapping("/getProductAvailability")
	public Inventory getAvailability(@RequestBody Product product);
}