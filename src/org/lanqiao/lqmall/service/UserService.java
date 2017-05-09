package org.lanqiao.lqmall.service;

import java.sql.SQLException;

import org.lanqiao.lqmall.domain.User;

public interface UserService {

	void save(User user) throws SQLException;

	User checkUsername(String username) throws SQLException;

}
