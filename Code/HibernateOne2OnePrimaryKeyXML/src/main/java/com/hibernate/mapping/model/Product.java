package com.hibernate.mapping.model;

public class Product {
	private long productId;
	private String name;
	private String description;
	private float price;
	private ProductDetail productDetail;

	public Product() {
	}

	public ProductDetail getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetail detail) {
		this.productDetail = detail;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
