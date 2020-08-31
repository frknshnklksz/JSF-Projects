package com.frknshnklksz;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.frknshnklksz.models.Person;

@ManagedBean(name = "indexBean")
@SessionScoped
public class IndexBean {
	
	private List<Person> personList;
	private Person person;
	private String name;
	private String surName;
	private String eMail;
	
	
	
	
	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurName() {
		return surName;
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


	public IndexBean() {
		personList = new ArrayList<Person>();
	}
	

	public List<Person> getPersonList() {
		return personList;
	}


	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	
	
	public void clickButtonForAddInTable() {
		person = new Person();
		person.setId(personList.size()+1);
		person.setName(name);
		person.setSurName(surName);
		person.seteMail(eMail);
		
		personList.add(person);
	}
	
	
	
	
	
}
