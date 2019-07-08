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
* @author ���� : 007
* @version ����ʱ�䣺2019��6��24�� ����9:44:58 
* ��˵�� 
*/
@WebServlet("/doQueryByCategory3")
public class UserQueryByCategory3Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		QueryServiceImpl qs = new QueryServiceImpl();
		List<Map<String, Object>> list = qs.QueryByGameCategory3();
		req.getSession().setAttribute("list", list);
		req.getRequestDispatcher("indexScanGameEL.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
