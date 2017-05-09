package org.lanqiao.lqmall.dao;

import java.sql.SQLException;

import org.lanqiao.lqmall.domain.User;
/*
 * 用户数据操作DAO接口
 */
public interface UserDao {

	void save(User user) throws SQLException;

	User findUserByUsername(String username) throws SQLException;

}
