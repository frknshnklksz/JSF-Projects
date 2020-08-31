package com.frknshnklksz.models;

public class Person {
	
	private int id;
	private String name;
	private String surName;
	private String eMail;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getSurName() { 
		return surName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}
