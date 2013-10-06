package com.meygam.adventureworks.api.dao;

import java.util.List;

import com.meygam.adventureworks.api.dao.bean.ProductBean;

public interface ProductDao {
	public List<ProductBean> getProducts();
}
