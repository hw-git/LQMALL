package org.lanqiao.lqmall.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.lanqiao.lqmall.domain.Category;
import org.lanqiao.lqmall.service.CategoryService;
import org.lanqiao.lqmall.service.impl.CategroyServiceImpl;
import org.lanqiao.lqmall.servlet.base.BaseServlet;

import com.google.gson.Gson;

@WebServlet("/categoryServlet")
public class CategoryServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void findAll(HttpServletRequest req,HttpServletResponse resp) throws SQLException, IOException{
			CategoryService categoryServie = new CategroyServiceImpl();
			List<Category> categoryList = categoryServie.findAll();
			Gson gson = new Gson();
			String cateJson =gson.toJson(categoryList);
			resp.setContentType("application/json;charset=UTF-8");
			resp.getWriter().print(cateJson);
	}
	
}
