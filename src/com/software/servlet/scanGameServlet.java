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
@WebServlet("/doscanGame")
public class scanGameServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		QueryServiceImpl qS = new QueryServiceImpl();
		//��ȡҳ���ύ����Ϣ
		String gameName = req.getParameter("gameName");
		//����service�㷽��������ģ����ѯ
		List<Map<String, Object>> list = qS.scanGame(gameName);
		req.getSession().setAttribute("list", list);
		//����ת������Ϸ��Ϣ��ѯ����
		req.getRequestDispatcher("customeEL.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
