package com.software.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.service.impl.QueryServiceImpl;

/** 
* @author 作者 : 007
* @version 创建时间：2019年6月24日 上午9:44:58 
* 类说明 
*/
@WebServlet("/doQueryByCategory1")
public class UserQueryByCategory1Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//调用service层方法，按动作类型查询游戏信息
		QueryServiceImpl qs = new QueryServiceImpl();
		List<Map<String, Object>> list = qs.QueryByGameCategory1();
		//设置属性的值
		req.getSession().setAttribute("list", list);
		//请求转发到游戏信息界面并显示查询出的信息
		req.getRequestDispatcher("indexScanGameEL.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
