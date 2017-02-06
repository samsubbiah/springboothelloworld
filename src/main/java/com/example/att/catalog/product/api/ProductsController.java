package com.example.att.catalog.product.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	@Autowired
	private ProductService productService;


	@RequestMapping(method = RequestMethod.GET, value = "/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();

	}

	@RequestMapping(method = RequestMethod.GET, value = "/products/{productid}")
	public Product getProduct(@PathVariable String productid) {
		return productService.getProduct(productid);
	}

	@RequestMapping("/hello")
	public String sayHi() {
		return "hello";

	}

	@RequestMapping(method = RequestMethod.POST, value = "/products")
	public void addProduct(@RequestBody Product pPerson) {
		productService.addProduct(pPerson);

	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/products")
	public void modifyProduct(@RequestBody Product pPerson) {
				productService.modifyProduct(pPerson);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/products")
	public void deleteProduct(@RequestBody Product pPerson) {
		productService.deleteProduct(pPerson);
	}

}
