package com.meygam.adventureworks.api.dao.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductBeanRowMapper implements RowMapper<ProductBean> {

	public ProductBean mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		ProductBean productBean = new ProductBean();
		productBean.setColor(resultSet.getString("color"));
		productBean.setListPrice(resultSet.getDouble("listPrice"));
		productBean.setName(resultSet.getString("name"));
		productBean.setProductId(resultSet.getLong("productId"));
		productBean.setProductNumber(resultSet.getString("productNumber"));
		productBean.setWeight(resultSet.getDouble("weight"));
		return productBean;
	}

}
