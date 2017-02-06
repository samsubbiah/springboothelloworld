package com.example.att.catalog.product.api;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.att.ecom.catalog.sku.api.Sku;

@Entity
public class Product {
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Id	
	private String id;
	
	private String name;
	

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
