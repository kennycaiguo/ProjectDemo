package com.software.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.software.entity.Record;
import com.software.entity.User;
import com.software.service.impl.UserServiceImpl;

@WebServlet("/doBuy")
public class BuyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserServiceImpl uS = new UserServiceImpl();
		HttpSession session = req.getSession();
		//��ȡ�����е�ֵ
		User user = (User)req.getSession().getAttribute("user");
		//��ȡ�û�id
		String userId = user.getId();
		//��ȡ�ύ�Ĳ���
		String gameId = req.getParameter("gameId");
		String price = req.getParameter("price");
		/*System.out.println(userId);
		System.out.println(gameId);
		System.out.println(price);*/
		//�ѻ�ȡ���Ĳ�����װ��������
		Record record = new Record(Integer.parseInt(userId), Integer.parseInt(gameId), Double.parseDouble(price));
		//����service�㷽��������Ϸ
		int reslutR = uS.buyGame(record);
		//����service�㷽��������Ϸ��������
		int reslutC = uS.addCount(gameId);
		//���ݷ���ֵ�ж��Ƿ���ɹ�
		if(reslutR>0&&reslutC>0) {//�ض��򵽹���ɹ�����
			resp.sendRedirect("indexSuccess.jsp");
		}else {
			resp.getWriter().write("����ʧ�ܣ�");

		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
