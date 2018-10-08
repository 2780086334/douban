package com.bdqn.entity;

import java.sql.Date;
import java.util.Arrays;

import org.springframework.format.annotation.DateTimeFormat;



public class news_category {
	private int id;
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDate;
	private news_detail[] news;
	/**
	 * @return the news
	 */
	public news_detail[] getNews() {
		return news;
	}
	/**
	 * @param news the news to set
	 */
	public void setNews(news_detail[] news) {
		this.news = news;
	}
	public news_category(int id, String name, Date createDate,
			news_detail[] news) {
		this.id = id;
		this.name = name;
		this.createDate = createDate;
		this.news = news;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "news_category [id=" + id + ", name=" + name + ", createDate="
				+ createDate + ", news=" + Arrays.toString(news) + "]";
	}
	public news_category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public news_category(int id, String name, Date createDate) {
		this.id = id;
		this.name = name;
		this.createDate = createDate;
	}
	public news_category(String name, Date createDate) {
		this.name = name;
		this.createDate = createDate;
	}
	public news_category(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public news_category( String name) {
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
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
