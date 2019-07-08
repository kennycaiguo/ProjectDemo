package com.software.service;

import java.util.List;
import java.util.Map;

import com.software.entity.Cart;

public interface IQueryService {
	/**
	 * ��ѯ��Ʒ��Ϣ
	 * @return
	 */
	public List<Map<String, Object>> UserQueryAll();
	
	/**
	 * ���۸����ѯ��Ʒ��Ϣ
	 * @return
	 */
	public List<Map<String, Object>> UserQueryAllByDesc();
	
	/**
	 * ���۸������ѯ��Ʒ��Ϣ
	 * @return
	 */
	public List<Map<String, Object>> UserQueryAllByAsc();
	
	/**
	 * ����id��ѯ�û�������Ϣ
	 * @param id
	 * @return
	 */
	public List<Map<String, Object>> getUserRecode(String id);
	
	/**
	 * ��ѯ������Ϸ��Ϣ
	 * @param gameName
	 * @return
	 */
	public List<Map<String, Object>> scanGame(String gameName);
	
	/**
	 * ����Ա��ѯ������Ϸ��Ϣ
	 * @return
	 */
	public List<Map<String, Object>> AdminQueryAll();
	
	/**
	 * ����id��ѯ��Ϸ��Ϣ
	 * @param gameId
	 * @return
	 */
	public List<Map<String, Object>> QueryByGameId(int gameId);
	
	/**
	 * ���ﳵ
	 * @param userId
	 * @return
	 */
	public List<Map<String, Object>> QueryCart(int userId);
	
	/**
	 * ���������Ͳ�ѯ
	 * @return
	 */
	public List<Map<String, Object>> QueryByGameCategory1();
	
	/**
	 * ����ɫ���Ͳ�ѯ
	 * @return
	 */
	public List<Map<String, Object>> QueryByGameCategory2();
	
	/**
	 * ���������Ͳ�ѯ
	 * @return
	 */
	public List<Map<String, Object>> QueryByGameCategory3();
	
	/**
	 * �����Ͷ����������Ͳ�ѯ
	 * @return
	 */
	public List<Map<String, Object>> QueryByGameCategory4();
	
	/**
	 * ��ѯ���ﳵ�е���Ʒ�ܼ�
	 * @param UserId
	 * @return
	 */
	public Object GetTotalPrice(int UserId);
	
	/**
	 * ��ѯ��Ϸ�۸�
	 * @param UserId
	 * @return
	 */
	public List<Cart> QueryGameIdPriceCount(int UserId);
	
	/**
	 * �û���ѯ��Ϸ��
	 * @param UserId
	 * @return
	 */
	public List<Map<String, Object>> QueryMyGame(int UserId);
	
	/**
	 * ��ѯ��Ϸ��Ϣ
	 * @param gameId
	 * @return
	 */
	public List<Map<String, Object>> GameInfo(int gameId);
}
