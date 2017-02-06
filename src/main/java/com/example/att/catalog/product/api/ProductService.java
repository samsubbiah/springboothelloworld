package com.example.att.catalog.product.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class ProductService {
	
	@Autowired
	private ProductRepository productReposiotry;

	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		productReposiotry.findAll().iterator().forEachRemaining(products::add);
		return products;

	}

	public Product getProduct(@PathVariable String productid) {
		Product  result=productReposiotry.findOne(productid);
		return result;
	}

	public void addProduct(Product pPerson) {
		productReposiotry.save(pPerson);

	}
	
	public void modifyProduct(Product pPerson) {
		
		productReposiotry.save(pPerson);
	}

	public void deleteProduct(Product pPerson) {
		productReposiotry.delete(pPerson);
	}
}
