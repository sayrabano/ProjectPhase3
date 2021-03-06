package com.ecommerce.web.entity;

import java.util.Date;

public class Purchase {
private int product_id;
	
	private String product_category;
	private String product_brand;
	

	private int product_price;
	private int product_size;
	
	private Date purchase_date;

	@Override
	public String toString() {
		return "Purchase [product_id=" + product_id + ", product_category=" + product_category + ", product_brand="
				+ product_brand +  ", product_price=" + product_price + ", product_size="
				+ product_size + ", purchase_date=" + purchase_date + "]";
	}

	public Purchase(int product_id, String product_category, String product_brand, int product_price, int product_size,
			Date purchase_date) {
		super();
		this.product_id = product_id;
		this.product_category = product_category;
		this.product_brand = product_brand;
		this.product_price = product_price;
		this.product_size = product_size;
		this.purchase_date = purchase_date;
	}

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

}
