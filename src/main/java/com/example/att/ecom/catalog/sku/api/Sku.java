package com.example.att.ecom.catalog.sku.api;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.att.catalog.product.api.Product;

@Entity
public class Sku {

	public Sku() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sku(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Id
	private String id;

	private String name;
	
	@ManyToOne
	private Product product;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
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
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
}
