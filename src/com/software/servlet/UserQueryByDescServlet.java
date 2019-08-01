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

@WebServlet("/doQueryByDesc")
public class UserQueryByDescServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//����service�㷽�����û������򣩲�ѯ������Ϸ��Ϣ
		QueryServiceImpl qS = new QueryServiceImpl();
		List<Map<String, Object>> list = qS.UserQueryAllByDesc();
		//�������Ե�ֵ
		req.getSession().setAttribute("list", list);
		//����ת������Ϸ��Ϣ���沢��ʾ��ѯ������Ϣ
		req.getRequestDispatcher("indexAllGameEL.jsp").forward(req, resp);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
