package com.software.dao;

import java.sql.SQLException;

import com.software.entity.Brand;
import com.software.entity.Category;
import com.software.entity.Game;

public interface IAdminDao {

	/**
	 * �����Ʒ��Ϣ
	 * @return
	 * @throws SQLException 
	 */
	public int add(Game game) throws SQLException;
	
	/**
	 * �޸���Ʒ��Ϣ
	 * @param game
	 * @return
	 * @throws SQLException
	 */
	public int modifyInfo(Game game) throws SQLException;
	
	/**
	 * ����Ա�����Ϸ����
	 * @param brand
	 * @return
	 * @throws SQLException
	 */
	public int addBrand(Brand brand) throws SQLException;
	
	/**
	 * ����Ա�����Ϸ����
	 * @param category
	 * @return
	 * @throws SQLException
	 */
	public int addCategory(Category category) throws SQLException;
}
