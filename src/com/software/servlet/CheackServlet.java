package com.software.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.entity.User;
import com.software.service.impl.UserServiceImpl;

/** 
* @author ���� : 007
* @version ����ʱ�䣺2019��6��19�� ����2:39:14 
* ��˵�� 
*/
@WebServlet("/doCheack")
public class CheackServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//��ȡҳ���ύ�Ĳ���
		String name = req.getParameter("username");
		//�ж��û����Ƿ�Ϊ��
		if(name==null||"".equals(name)) {
			resp.getWriter().write(String.valueOf(0));
			return;
		}
		/*System.out.println(name);*/
		//�ѻ�ȡ���Ĳ�����װ��������
		User user = new User(name);
		//����service�㷽������
		UserServiceImpl us = new UserServiceImpl();
		int result = us.cheack(user);
		resp.getWriter().write(String.valueOf(result));//����ǰ��ҳ������ж�
		//req.setAttribute("result", result);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
