package com.meygam.adventureworks.api.dao.bean;

import java.util.ArrayList;

public class ProductListBean {
	private ArrayList<ProductBean> productBeanList = new ArrayList<ProductBean>();

	public ArrayList<ProductBean> getProductBeanList() {
		return productBeanList;
	}

	public void setProductBeanList(ArrayList<ProductBean> productBeanList) {
		this.productBeanList = productBeanList;
	}

	public void add(ProductBean productBean) {
		if (getProductBeanList() == null) {
			setProductBeanList(new ArrayList<ProductBean>());
		}
		getProductBeanList().add(productBean);
	}
}
