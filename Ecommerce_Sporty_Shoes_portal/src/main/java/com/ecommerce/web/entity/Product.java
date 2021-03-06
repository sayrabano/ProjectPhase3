package com.ecommerce.web.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_id;
	
	private String product_category;
	private String product_brand;
	
	private int product_price;
	private int product_size;
	private String gender;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_category() {
		return product_category;
	}
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	public String getProduct_brand() {
		return product_brand;
	}
	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getProduct_size() {
		return product_size;
	}
	public void setProduct_size(int product_size) {
		this.product_size = product_size;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Product(int product_id, String product_category, String product_brand, int product_price, int product_size,
			String gender) {
		super();
		this.product_id = product_id;
		this.product_category = product_category;
		this.product_brand = product_brand;
		this.product_price = product_price;
		this.product_size = product_size;
		this.gender = gender;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_category=" + product_category + ", product_brand="
				+ product_brand + ", product_price=" + product_price + ", product_size=" + product_size + ", gender="
				+ gender + "]";
	}
	
}
