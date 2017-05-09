package org.lanqiao.lqmall.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.lanqiao.lqmall.domain.User;
import org.lanqiao.lqmall.service.UserService;
import org.lanqiao.lqmall.service.impl.UserServiceImpl;
import org.lanqiao.lqmall.servlet.base.BaseServlet;
import org.lanqiao.lqmall.utils.BeanTools;
import org.lanqiao.lqmall.utils.UUIDUtils;

@WebServlet("/userServlet")
public class UserServlet  extends BaseServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String login(HttpServletRequest req, HttpServletResponse resp){
		
		return "/jsp/login.jsp";
	}
	
	public String registUI(HttpServletRequest req, HttpServletResponse resp){
		return "/jsp/register.jsp";
	}
	public String loginUI(HttpServletRequest req, HttpServletResponse resp){
		return "/jsp/login.jsp";
	}
	public String regist(HttpServletRequest req, HttpServletResponse resp) throws SQLException{
		User user = BeanTools.populate(User.class, req.getParameterMap());
		user.setUid(UUIDUtils.getId());
		user.setState(1);
		UserService userService = new UserServiceImpl();
		userService.save(user);
		req.setAttribute("msg", "注册成功，请您登录");
		return "/jsp/login.jsp";
		
	}
	
	public void checkUsername(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException{
		String username= req.getParameter("username");
		UserService userService = new UserServiceImpl();
		User user = userService.checkUsername(username);
		if(user==null){
			resp.getWriter().print(1);
		}else{
			resp.getWriter().print(2);
		}
		
		
	}
}
