package com.meygam.adventureworks.api.conversion.impl;

import java.util.List;

import com.meygam.adventureworks.api.conversion.ProductConverter;
import com.meygam.adventureworks.api.dao.bean.ProductBean;
import com.meygam.adventureworks.api.dao.bean.ProductListBean;
import com.meygam.adventureworks.api.resource.Product;
import com.meygam.adventureworks.api.resource.ProductList;

public class ProductConverterImpl implements ProductConverter {

	public ProductList convertProductBeanListToProductList(
			List<ProductBean> productBeanList) {
		final ProductList productList = new ProductList();
		Product product;
		for (ProductBean productBean : productBeanList) {
			product = new Product();
			product.setColor(productBean.getColor());
			product.setListPrice(productBean.getListPrice());
			product.setName(productBean.getName());
			product.setProductId(productBean.getProductId());
			product.setProductNumber(productBean.getProductNumber());
			product.setWeight(productBean.getWeight());
			productList.add(product);
		}
		return productList;
	}

}
