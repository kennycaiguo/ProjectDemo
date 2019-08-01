package com.software.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.software.entity.Cart;
import com.software.entity.User;
import com.software.service.impl.UserServiceImpl;

@WebServlet("/doAddCart")
public class AddCartservlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	UserServiceImpl uS = new UserServiceImpl();
	//��ҳ���ȡ�û�
	User user = (User)req.getSession().getAttribute("user");
	//��ȡҳ���ύ�Ĳ���
	String user_id = user.getId();
	String gameId = req.getParameter("gameId");
	String price = req.getParameter("price");
	//�ѻ�ȡ���Ĳ�����װ��������
	Cart cart = new Cart(Integer.parseInt(user_id), Integer.parseInt(gameId), Double.parseDouble(price));
	//����service�㷽����ӹ��ﳵ
	int result = uS.addCart(cart);
	//���ݷ���ֵ�ж��Ƿ���ӳɹ��ɹ�
	PrintWriter writer = resp.getWriter();
	if(result>0) {//�ɹ��ض�����ӳɹ�����
		resp.sendRedirect("indexAddCartSuccess.jsp");
	}
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
