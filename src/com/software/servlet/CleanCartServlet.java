package com.software.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.software.entity.Cart;
import com.software.entity.Record;
import com.software.entity.User;
import com.software.service.impl.QueryServiceImpl;
import com.software.service.impl.UserServiceImpl;
@WebServlet("/doCleanCart")
public class CleanCartServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		QueryServiceImpl qS = new QueryServiceImpl();
		UserServiceImpl uS = new UserServiceImpl();
		User user = (User)req.getSession().getAttribute("user");
		//��ȡ�û�id
		String UserId = user.getId();
		//�����û�id��ѯ����Ϸ�������ͼ۸�
		List<Cart> list = qS.QueryGameIdPriceCount(Integer.parseInt(UserId));
		for (Cart cart : list) {
			//�����Ѿ���ӵ���Ϸ��Ϣ
			int gameId = cart.getGame_id();
			double price = cart.getPrice();
			//�Ѳ�����װ�������У���¼��
			Record record = new  Record(Integer.parseInt(UserId), gameId, price);
			int i = cart.getCount();
			for(;i>0;i--) {//����service�㷽��ÿ��ִ��һ�ι��򣬼�¼���������+1
				uS.buyGame(record);
			}
			//ִ�й���֮�����service�㷽�������ﳵ�����Ϸ��Ϣ��status��Ϊ1
			uS.changeCartStatus(cart.getId());
			//ִ�й���֮�����service�㷽��cartʵ������statusΪ1����Ϣɾ��
			uS.DeleteCart(cart.getId());	
		}
		resp.sendRedirect("indexSuccess.jsp");//�ض��򵽹���ɹ�����
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
