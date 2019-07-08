package com.software.entity;

/**
 * @author ���� : 007
 * @version ����ʱ�䣺2019��6��25�� ����4:21:05 ��˵��
 */
public class Category {
	private int id;
	private String name;

	public Category() {
		super();
	}

	
	public Category(String name) {
		super();
		this.name = name;
	}


	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}

}
