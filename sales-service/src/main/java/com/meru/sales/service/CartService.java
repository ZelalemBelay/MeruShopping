package com.meru.sales.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.meru.sales.model.Cart;
import com.meru.sales.model.Inventory;
import com.meru.sales.model.Product;

@Service
public class CartService {

	@Autowired
	InventoryServiceFeignProxy inventoryProxy;

	@Value("${promotion.promoCode}")
	String promoCode;
	
	@Value("${price.tax}")
	String priceTax;
	
	@Value("${promotion.promoDiscount}")
	String discountPercentage;
 
	public Cart addToCart(Cart cart, Product product) throws Exception {

		if (cart == null)
			cart = new Cart();

		Inventory inventory = inventoryProxy.getAvailability(product);

		if (inventory != null && !inventory.getItemCount().equals("0")) {
			
			
			//priceService.getUpdatedPrice(promoCode, priceTax, discountPercentage, product)
			cart.getProducts().add(product);
		} else
			throw new Exception("ItemSoldOutException");

		return cart;
	}
}''
