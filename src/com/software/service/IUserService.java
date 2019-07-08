package com.software.service;

import com.software.entity.Cart;
import com.software.entity.Record;
import com.software.entity.User;

/**
 * @author ���� : dyb
 * @version ����ʱ�䣺2019��6��5�� ����11:09:09 ��˵��
 */
public interface IUserService {

	/**
	 * ע��
	 * @param user
	 * @return
	 */
	public int register(User user);

	/**
	 * ��½
	 * @param user
	 * @return
	 */
	public User login(User user);

	/**
	 * ��������
	 * @param user
	 * @return
	 */
	public int resetPassword(User user);

	/**
	 * ����
	 * @param user
	 * @return
	 */
	public int cheack(User user);

	/**
	 * ������Ϸ
	 * @param record
	 * @return
	 */
	public int buyGame(Record record);

	/**
	 * �������
	 * @param gameId
	 * @return
	 */
	public int addCount(String gameId);

	/**
	 * ��ӹ��ﳵ
	 * @param cart
	 * @return
	 */
	public int addCart(Cart cart);

	/**
	 * �޸Ĺ��ﳵ����Ʒ������Ϊ�Ƿ���ʾ
	 * @param CartId
	 * @return
	 */
	public int changeCartStatus(int CartId);

	/**
	 * ���ӹ��ﳵ����Ʒ����
	 * @param CartId
	 * @return
	 */
	public int addGoodsCount(int CartId);

	/**
	 * ���ٹ��ﳵ����Ʒ����
	 * @param CartId
	 * @return
	 */
	public int subGoodsCount(int CartId);

	/**
	 * ��չ��ﳵ
	 * @param CartId
	 * @return
	 */
	public int DeleteCart(int CartId);
	

}
