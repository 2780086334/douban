package com.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class Dianying implements Serializable {
 private int filmid;
 private String tupian;
 private int pingfen;
 private String leixing;
 private String jieshao;
 private Date shijian;
 private String filmname;
 
public Dianying() {
	super();
	// TODO Auto-generated constructor stub
}
public Dianying(int filmid, String tupian, int pingfen, String leixing,
		String jieshao, Date shijian, String filmname) {
	super();
	this.filmid = filmid;
	this.tupian = tupian;
	this.pingfen = pingfen;
	this.leixing = leixing;
	this.jieshao = jieshao;
	this.shijian = shijian;
	this.filmname = filmname;
}
public int getFilmid() {
	return filmid;
}
public void setFilmid(int filmid) {
	this.filmid = filmid;
}
public String getTupian() {
	return tupian;
}
public void setTupian(String tupian) {
	this.tupian = tupian;
}
public int getPingfen() {
	return pingfen;
}
public void setPingfen(int pingfen) {
	this.pingfen = pingfen;
}
public String getLeixing() {
	return leixing;
}
public void setLeixing(String leixing) {
	this.leixing = leixing;
}
public String getJieshao() {
	return jieshao;
}
public void setJieshao(String jieshao) {
	this.jieshao = jieshao;
}
public Date getShijian() {
	return shijian;
}
public void setShijian(Date shijian) {
	this.shijian = shijian;
}
public String getFilmname() {
	return filmname;
}
public void setFilmname(String filmname) {
	this.filmname = filmname;
}
}
