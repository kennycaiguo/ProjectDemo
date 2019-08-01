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

@WebServlet("/dogetUserRecode")
public class getUserRecodeServlet extends HttpServlet{
	QueryServiceImpl qS = new QueryServiceImpl(); 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//��ȡ�û������ֵ
		User user = (User)req.getSession().getAttribute("user");
		//����service�㷽����ͨ���û�id��ѯ�û��ѹ������Ʒ��Ϣ����list����
		List<Map<String, Object>> list = qS.getUserRecode(user.getId());
		//���ö��������
		req.getSession().setAttribute("list", list);
		//ת�����ҵ���Ϸ����沢��ʾ��ϸ��Ϣ
		req.getRequestDispatcher("indexMyRecodeEL.jsp").forward(req, resp);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
