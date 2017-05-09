package org.lanqiao.lqmall.dao;

import java.sql.SQLException;
import java.util.List;

import org.lanqiao.lqmall.domain.Category;
/*
 * 商品分类
 */
public interface CategoryDao {

	public List<Category>findAll() throws SQLException;

}
