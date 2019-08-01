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
@WebServlet("/doGameInfo")
public class GameInfoServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	QueryServiceImpl qS = new QueryServiceImpl();
	//��ȡҳ���ύ�Ĳ���
	String gameId = req.getParameter("gameId");
	//����service�㷽��ͨ����ȡ����Ϸid����ѯ��Ϸ��Ϣ����list����
	List<Map<String, Object>> list = qS.GameInfo(Integer.parseInt(gameId));
	//���ö�������
	req.getSession().setAttribute("list", list);
	//ת��������Ϸ��Ϣ��ʾ����
	req.getRequestDispatcher("indexGameInfoEL.jsp").forward(req, resp);	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
