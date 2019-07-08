package com.software.dao;

import java.sql.SQLException;

import com.software.entity.Cart;
import com.software.entity.Record;
import com.software.entity.User;



/** 
* @author ���� : dyb
* @version ����ʱ�䣺2019��6��5�� ����10:40:01 
* ��˵�� 
*/
public interface IUserDao {
	/**
	 * ע���û�
	 * @param user
	 * @return
	 * @throws SQLException 
	 */
	public int addUser(User user) throws SQLException;
	
	/**
	 * ע�����
	 * @param username
	 * @return
	 * @throws SQLException 
	 */
	public User queryByUserName(String username) throws SQLException;
	
	
	/**
	 * ��½
	 * @param user
	 * @return
	 * @throws SQLException 
	 */
	public User queryByUser(User user) throws SQLException;
	
	/**
	 * ��������
	 * @param username
	 * @param idnumber
	 * @param password
	 * @return
	 * @throws SQLException 
	 */
	public int resetPassord(User user) throws SQLException;
	
	/**
	 * ������Ϸ
	 * @param record
	 * @return
	 * @throws SQLException
	 */
	public int buyGame(Record record) throws SQLException;
	
	/**
	 * �������
	 * @param gameId
	 * @return
	 * @throws SQLException
	 */
	public int addCount(String gameId) throws SQLException;
	
	/**
	 * ��ӹ��ﳵ
	 * @param cart
	 * @return
	 * @throws SQLException
	 */
	public int addCart(Cart cart) throws SQLException;
	
	/**
	 * �޸Ĺ��ﳵ����Ʒ������Ϊ�Ƿ���ʾ
	 * @param CartId
	 * @return
	 * @throws SQLException
	 */
	public int changeCartStatus(int CartId) throws SQLException;
	
	/**
	 * ���ӹ��ﳵ����Ʒ����
	 * @param CartId
	 * @return
	 * @throws SQLException
	 */
	public int addGoodsCount(int CartId) throws SQLException;
	
	/**
	 * ���ٹ��ﳵ����Ʒ����
	 * @param CartId
	 * @return
	 * @throws SQLException
	 */
	public int subGoodsCount(int CartId) throws SQLException;
	
	/**
	 * ��չ��ﳵ
	 * @param CartId
	 * @return
	 * @throws SQLException
	 */
	public int DeleteCart(int CartId) throws SQLException;
	
}
