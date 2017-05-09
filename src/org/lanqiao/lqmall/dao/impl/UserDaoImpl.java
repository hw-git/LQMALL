package org.lanqiao.lqmall.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.lanqiao.lqmall.dao.UserDao;
import org.lanqiao.lqmall.domain.User;
import org.lanqiao.lqmall.utils.JdbcUtils;

public class UserDaoImpl implements UserDao{

	@Override
	public void save(User user) throws SQLException {
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "insert into user(uid,username,password,name,email,telephone,birthday,sex,state)"
				+ "values(?,?,?,?,?,?,?,?,?)";
		qr.update(sql, user.getUid(),user.getUsername(),user.getPassword(),user.getName(),user.getEmail(),user.getTelephone(),user.getBirthday(),user.getSex(),user.getState());
		
	}

	@Override
	public User findUserByUsername(String username) throws SQLException {
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "select * from user where username=?";
		User user = qr.query(sql, new BeanHandler<>(User.class), username);
		return user;
	}
}
