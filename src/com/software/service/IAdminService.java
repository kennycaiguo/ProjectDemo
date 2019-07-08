package com.software.service;

import com.software.entity.Brand;
import com.software.entity.Category;
import com.software.entity.Game;

public interface IAdminService {
	/**
	 * ����Ա�����Ʒ��Ϣ
	 * @param game
	 * @return
	 */
	public int add(Game game);
	
	/**
	 * ����Ա�޸���Ʒ��Ϣ
	 * @param game
	 * @return
	 */
	public int modifyInfo(Game game);
	
	/**
	 * ����Ա�����Ϸ����
	 * @param brand
	 * @return
	 */
	public int addBrand(Brand brand);
	
	/**
	 * ����Ա�����Ϸ����
	 * @param category
	 * @return
	 */
	public int addCategory(Category category);
}
