package com.meygam.adventureworks.api.resource;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductList {
	private ArrayList<Product> productList = new ArrayList<Product>();

	@XmlElement
	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	public void add(Product product) {
		if (getProductList() == null) {
			setProductList(new ArrayList<Product>());
		}
		getProductList().add(product);
	}

}
