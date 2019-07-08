package com.software.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.entity.User;
import com.software.service.impl.UserServiceImpl;

@WebServlet("/doRegister")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserServiceImpl us = new UserServiceImpl();
		//��ȡҳ���ύ�Ĳ���
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String idnumber = req.getParameter("idnumber");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		//�Ѳ�����װ��������
		User user = new User(username, password, idnumber, tel, email);
		//����service�㷽��ע��
		int result = us.register(user);
		//���ݷ���ֵ�ж��Ƿ�ע��ɹ�
		PrintWriter writer = resp.getWriter();
		if(result==-2) {
			writer.write("�û����Ѵ��ڣ�ע��ʧ�ܣ�");
		}else if (result==0) {
			writer.write("ע��ʧ�ܣ�����ϵ����Ա��");
		}else {//�ض��򵽵�½����
			resp.sendRedirect("SignIn.jsp");
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
