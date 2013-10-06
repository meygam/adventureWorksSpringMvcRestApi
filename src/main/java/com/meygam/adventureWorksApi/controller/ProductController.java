package com.meygam.adventureWorksApi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.meygam.adventureWorksApi.resource.Product;
import com.meygam.adventureWorksApi.resource.ProductList;

@Controller
public class ProductController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/product")
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public ProductList getProducts() {
		ProductList productList = new ProductList();
		
		Product product = new Product();
		product.setProductId(50L);
		product.setName("Computer");
		product.setProductNumber("ABC1234");
		product.setColor("Black");
		product.setListPrice(50.0);
		product.setWeight(65.5);
		productList.add(product);
		
		product = new Product();
		product.setProductId(51L);
		product.setName("Bike");
		product.setProductNumber("ABC1234");
		product.setColor("Black");
		product.setListPrice(50.0);
		product.setWeight(65.5);
		productList.add(product);
		
		return productList;
	}

}
