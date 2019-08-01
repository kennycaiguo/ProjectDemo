package com.software.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.service.impl.UserServiceImpl;
@WebServlet("/doSubGoodsCount")
public class SubGoodsCountServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	UserServiceImpl uS = new UserServiceImpl();
	//��ȡ���ﳵʵ�������id��Ϣ
	String CartId = req.getParameter("CartId");
	//����service�㷽�����ݹ��ﳵ�ﵱǰѡ����Ʒ��id�����ӹ��ﳵ����Ʒ������
	uS.subGoodsCount(Integer.parseInt(CartId));
	//����ת��
	req.getRequestDispatcher("doMyCart").forward(req, resp);
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
