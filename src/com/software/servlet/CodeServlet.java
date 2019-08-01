package com.software.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.dsna.util.images.ValidateCode;

@WebServlet("/doCode")
public class CodeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//������֤��Ĳ���
		ValidateCode vc = new ValidateCode(140, 45, 4, 18);
		//��ȡ��֤��
		String code = vc.getCode();
		//��̨��ӡ��֤��
		System.out.println(vc.getCode());
		//��ȡ�����ֵ
		HttpSession session = req.getSession();
		session.setAttribute("code", code);
		//����ַ���
		vc.write(resp.getOutputStream());
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
