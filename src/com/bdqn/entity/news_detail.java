package com.bdqn.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class news_detail{
	private int id;
	private news_category category;
	private int categoryId;
	private String title;
	private String summary;
	private String content;
	private String picPath;
	private String author;
	private xuesheng user;
	private Date createDate;
	private Date modifyDate;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "news_detail [id=" + id + ", category=" + category
				+ ", categoryId=" + categoryId + ", title=" + title
				+ ", summary=" + summary + ", content=" + content
				+ ", picPath=" + picPath + ", author=" + author + ", user="
				+ user + ", createDate=" + createDate + ", modifyDate="
				+ modifyDate + "]";
	}
	public news_detail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public news_detail(int id, news_category category, int categoryId,
			String title, String summary, String content, String picPath,
			String author, xuesheng user, Date createDate, Date modifyDate) {
		this.id = id;
		this.category = category;
		this.categoryId = categoryId;
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.picPath = picPath;
		this.author = author;
		this.user = user;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
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
	 * @return the category
	 */
	public news_category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(news_category category) {
		this.category = category;
	}
	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the picPath
	 */
	public String getPicPath() {
		return picPath;
	}
	/**
	 * @param picPath the picPath to set
	 */
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the user
	 */
	public xuesheng getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(xuesheng user) {
		this.user = user;
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
	/**
	 * @return the modifyDate
	 */
	public Date getModifyDate() {
		return modifyDate;
	}
	/**
	 * @param modifyDate the modifyDate to set
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	
	
}
