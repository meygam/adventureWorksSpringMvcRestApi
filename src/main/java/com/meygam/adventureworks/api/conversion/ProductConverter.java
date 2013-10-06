package com.meygam.adventureworks.api.conversion;

import java.util.List;

import com.meygam.adventureworks.api.dao.bean.ProductBean;
import com.meygam.adventureworks.api.resource.ProductList;

public interface ProductConverter {
	public ProductList convertProductBeanListToProductList(
			List<ProductBean> productBeanList);

}
