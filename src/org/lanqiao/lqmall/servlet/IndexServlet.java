package org.lanqiao.lqmall.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.lanqiao.lqmall.servlet.base.BaseServlet;

@WebServlet("/indexServlet")
public class IndexServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String execute(HttpServletRequest req,HttpServletResponse resp){
		
		return "/jsp/index.jsp";
	}
}
