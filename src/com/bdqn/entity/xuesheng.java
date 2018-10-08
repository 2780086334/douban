package com.bdqn.entity;

public class xuesheng {
	private int id;
	private String name;
	private int age;
	private char sex;
	private String telephone;
	private String picpath;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "xuesheng [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", telephone=" + telephone + ", picpath="
				+ picpath + "]";
	}
	public xuesheng() {
		super();
		// TODO Auto-generated constructor stub
	}
	public xuesheng(int id, String name, int age, char sex, String telephone,
			String picpath) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.telephone = telephone;
		this.picpath = picpath;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the picpath
	 */
	public String getPicpath() {
		return picpath;
	}
	/**
	 * @param picpath the picpath to set
	 */
	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}
}
