package org.lanqiao.lqmall.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.lanqiao.lqmall.dao.CategoryDao;
import org.lanqiao.lqmall.dao.impl.CategoryDaoImpl;
import org.lanqiao.lqmall.domain.Category;
import org.lanqiao.lqmall.service.CategoryService;

public class CategroyServiceImpl  implements CategoryService{
	CategoryDao dao = new CategoryDaoImpl();
	@Override
	public List<Category> findAll() throws SQLException {
		
		return dao.findAll();
	}

}
