package org.lanqiao.lqmall.service.impl;

import java.sql.SQLException;

import org.lanqiao.lqmall.dao.UserDao;
import org.lanqiao.lqmall.dao.impl.UserDaoImpl;
import org.lanqiao.lqmall.domain.User;
import org.lanqiao.lqmall.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao dao = new UserDaoImpl();
	@Override
	public void save(User user) throws SQLException {
		
		dao.save(user);
		
	}

	@Override
	public User checkUsername(String username) throws SQLException {
		
	 return 	dao.findUserByUsername(username);
	}

}
