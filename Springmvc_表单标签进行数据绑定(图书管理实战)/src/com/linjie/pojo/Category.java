package com.linjie.pojo;

import java.io.Serializable;

/**
* @author 浅然 	xulinjie0105@gmail.com
* @version 创建时间：2018年5月31日 下午2:13:04
* 类别实体类
*/
public class Category implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;			//类别的id
	private String name;	//类别的名称
	
	public Category() {}
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
}
