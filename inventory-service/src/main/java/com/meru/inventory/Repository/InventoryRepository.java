package com.meru.inventory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meru.inventory.model.Inventory;
import com.meru.inventory.model.Product;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer>{

	public Inventory getInventoryByProduct(Product product);
}
