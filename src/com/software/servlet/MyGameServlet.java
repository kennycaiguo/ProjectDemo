package com.software.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.software.entity.User;
import com.software.service.impl.QueryServiceImpl;
@WebServlet("/doMyGame")
public class MyGameServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		QueryServiceImpl qS = new QueryServiceImpl();
		//��ȡ���������
		User user = (User)req.getSession().getAttribute("user");
		String UserId = user.getId();
		//����service�㷽����ͨ���û�id��ѯ��ǰ�û�����Ϸ����Ϣ����list����
		List<Map<String, Object>> list = qS.QueryMyGame(Integer.parseInt(UserId));
		//System.out.println(UserId);
		req.getSession().setAttribute("list", list);
		//����ת�����ҵ���Ϸ����沢��ʾ��ѯ��������Ϣ
		req.getRequestDispatcher("indexMyGameEL.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
