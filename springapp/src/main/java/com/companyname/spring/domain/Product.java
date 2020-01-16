package com.companyname.spring.domain;

import java.io.Serializable;

public class Product implements Serializable {
	
	private static final Long serialVersionUID = 1L;
	
	private String description;
	private Double price;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		//return "Product [descripcion=" + descripcion + ", price=" + price + "]";
		StringBuffer buffer = new StringBuffer();
        buffer.append("Description: " + description + ";");
        buffer.append("Price: " + price);
        return buffer.toString();
	}
	
	

}
