package com.software.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 
* @author ���� : 007
* @version ����ʱ�䣺2019��6��3�� ����2:42:24 
* ��˵�� 
*/
@WebServlet("/doDownload")
public class DownloadServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//ͨ��·���õ�һ��������
				String path = "C:\\Users\\Kaizuka\\Desktop\\images\\show.png";
				FileInputStream fis = new FileInputStream(path);
				//�����ֽ������
				ServletOutputStream sos = resp.getOutputStream();
				
				//�õ�Ҫ���ص��ļ���
				String filename = path.substring(path.lastIndexOf("\\")+1);
				
				//�����ļ����ı���
				filename = URLEncoder.encode(filename, "UTF-8");//������ȫ���ļ�����ΪUTF-8��ʽ
				
				//��֪�ͻ���Ҫ�����ļ�
				resp.setHeader("content-disposition", "attachment;filename="+filename);
				//�ļ�����http://tool.oschina.net/commons
				resp.setHeader("content-type", "application/pdf");
				
				//ִ���������
				int len = 1;
				byte[] b = new byte[1024];
				while((len=fis.read(b))!=-1){
					sos.write(b,0,len);
				}
				
				sos.close();
				fis.close();
			}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
