package org.lanqiao.lqmall.service;

import java.sql.SQLException;
import java.util.List;

import org.lanqiao.lqmall.domain.Category;

public interface CategoryService {

	List<Category> findAll() throws SQLException;

}
