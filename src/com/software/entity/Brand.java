package com.software.entity;

/**
 * @author ���� : 007
 * @version ����ʱ�䣺2019��6��25�� ����3:56:18 ��˵��
 */
public class Brand {
	private int id;
	private String name;

	public Brand() {
		super();
	}

	
	public Brand(String name) {
		super();
		this.name = name;
	}


	public Brand(int id, String name) {
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
		return "Brand [id=" + id + ", name=" + name + "]";
	}

}
