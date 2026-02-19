package com.cloudstudio.service.springbootapp.model;

import java.io.Serializable;

public class ProductInfo implements Serializable {
	
	private static final long serialVersionUID = 132769350982020406L;
	private String productId;
	private String name;
	private String amount;
	
	public ProductInfo(String productId, String name, String amount) {
		super();
		this.productId = productId;
		this.name = name;
		this.amount = amount;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "ProductInfo [productId=" + productId + ", name=" + name + ", amount=" + amount + "]";
	}
	
	

}
