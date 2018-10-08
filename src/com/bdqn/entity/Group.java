package com.bdqn.entity;

import java.io.Serializable;

public class Group implements Serializable {
private int id;
private String name;
private String text;
private int num;
private String image;

public Group() {
	super();
	// TODO Auto-generated constructor stub
}
public Group(int id, String name, String text, int num, String image) {
	super();
	this.id = id;
	this.name = name;
	this.text = text;
	this.num = num;
	this.image = image;
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
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
}
