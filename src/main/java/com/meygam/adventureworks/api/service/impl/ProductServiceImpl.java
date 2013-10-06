package com.meygam.adventureworks.api.service.impl;

import com.meygam.adventureworks.api.conversion.ProductConverter;
import com.meygam.adventureworks.api.dao.ProductDao;
import com.meygam.adventureworks.api.resource.ProductList;
import com.meygam.adventureworks.api.service.ProductService;

public class ProductServiceImpl implements ProductService {
	private final ProductDao productDao;
	private final ProductConverter productConverter;

	public ProductServiceImpl(ProductDao productDao,
			ProductConverter productConverter) {
		this.productDao = productDao;
		this.productConverter = productConverter;
	}

	public ProductList getProductList() {
		return getProductConverter().convertProductBeanListToProductList(
				getProductDao().getProducts());
	}

	public ProductDao getProductDao() {
		return productDao;
	}

	public ProductConverter getProductConverter() {
		return productConverter;
	}

}
