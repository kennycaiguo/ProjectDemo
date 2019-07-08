package com.software.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.software.entity.Cart;

public interface IQueryDao {
	
	/**
	 * ��ѯ��Ʒ��Ϣ
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> UserQueryAll() throws SQLException;
	
	/**
	 * ��ѯ��Ʒ��Ϣ������
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> UserQueryAllByDesc() throws SQLException;
	
	/**
	 * ��ѯ��Ʒ��Ϣ������
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> UserQueryAllByAsc() throws SQLException;
	
	/**
	 * ����id��ѯ�û�������Ϣ
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> getUserRecode(String id) throws SQLException;
	
	/**
	 * ��ѯ������Ϸ��Ϣ
	 * @param gameName
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> scanGame(String gameName) throws SQLException;
	
	/**
	 * ����Ա��ѯ������Ϸ��Ϣ
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> AdminQueryAll() throws SQLException;
	
	/**
	 * ����id��ѯ��Ϸ��Ϣ
	 * @param gameId
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryByGameId(int gameId) throws SQLException;
	
	/**
	 * �û���ѯ��Ϸ��Ϣ
	 * @param userId
	 * @return
	 */
	public List<Map<String, Object>> QueryUserGame(int userId);
	
	/**
	 * ���ﳵ
	 * @param userId
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryCart(int userId) throws SQLException;
	
	/**
	 * ���������Ͳ�ѯ
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryByGameCategory1() throws SQLException;
	
	/**
	 * ����ɫ���Ͳ�ѯ
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryByGameCategory2() throws SQLException;
	
	/**
	 * ���������Ͳ�ѯ
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryByGameCategory3() throws SQLException;
	
	/**
	 * �����Ͷ����������Ͳ�ѯ
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryByGameCategory4() throws SQLException;
	
	/**
	 * ��ѯ��Ʒ����
	 * @param CartId
	 * @return
	 * @throws SQLException
	 */
	public Cart CheckGoodsCount(int CartId) throws SQLException;
	
	/**
	 * ��ѯ���ﳵ�е���Ʒ�ܼ�
	 * @param UserId
	 * @return
	 * @throws SQLException
	 */
	public Object GetTotalPrice(int UserId) throws SQLException;
	
	/**
	 * ��ѯ��Ϸ�۸�
	 * @param UserId
	 * @return
	 * @throws SQLException
	 */
	public List<Cart> QueryGameIdPriceCount(int UserId) throws SQLException;
	
	/**
	 * �û���ѯ��Ϸ��
	 * @param UserId
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryMyGame(int UserId) throws SQLException;
	
	/**
	 * ��ѯ��Ϸ��Ϣ
	 * @param gameId
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> GameInfo(int gameId) throws SQLException;
}
