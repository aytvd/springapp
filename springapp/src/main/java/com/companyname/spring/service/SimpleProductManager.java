package com.companyname.spring.service;

import java.util.List;

import com.companyname.spring.domain.Product;

public class SimpleProductManager implements ProductManager {
	
	private static final long serialVersionUID=1L;
	
	private List<Product> products;

	@Override
    public void increasePrice(int percentage) {
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * 
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }  
    }

	@Override
	public List<Product> getProducts() {
		//throw new UnsupportedOperationException();
		return products;

	}
	
	public void setProducts(List<Product> products) {
		//throw new UnsupportedOperationException();
		this.products = products;
	}
	
	

}
