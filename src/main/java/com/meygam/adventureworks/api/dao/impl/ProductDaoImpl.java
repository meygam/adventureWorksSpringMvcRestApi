package com.meygam.adventureworks.api.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.meygam.adventureworks.api.dao.ProductDao;
import com.meygam.adventureworks.api.dao.bean.ProductBean;
import com.meygam.adventureworks.api.dao.bean.ProductBeanRowMapper;

public class ProductDaoImpl implements ProductDao {
	private final DataSource dataSource;
	private final JdbcTemplate jdbcTemplate;

	public ProductDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<ProductBean> getProducts() {
		String select = "select * from Production.Product";
		return jdbcTemplate.query(select, new ProductBeanRowMapper());
	}
}
