package com.spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection="Product")
public class Product{
	@Id
	private String id; //Default @Id String in MongoDB

	private Integer productNo;
	private String productName;
	private int price;
	private String category;
	
	public Product() {
		
	}

	public Product(Integer productNo, String productName, int price, String category) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getProductNo() {
		return productNo;
	}

	public void setProductNo(Integer productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
