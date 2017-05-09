package org.lanqiao.lqmall.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.lanqiao.lqmall.dao.CategoryDao;
import org.lanqiao.lqmall.domain.Category;
import org.lanqiao.lqmall.utils.JdbcUtils;

public class CategoryDaoImpl implements CategoryDao {

	@Override
	public List<Category> findAll() throws SQLException {
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "select * from category";
		return (List<Category>) qr.query(sql, new BeanListHandler<>(Category.class));
	}

}
