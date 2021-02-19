package com.hamit.bean;

import java.io.Serializable;

//BEAN= POJO+parametresiz const. +parametreli const + serileştirme +metotlar(toString  ...)

public class Bean2_Bean implements Serializable {
	private static final long serialVersionUID = -2271905960204756762L;

	// nesne değişkeni
	private String name;
	private String surname;

	// parametresiz constructor
	public Bean2_Bean() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public Bean2_Bean(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String metotAdi() {
		return this.name + " " + this.surname;
	}

	// toString
	@Override
	public String toString() {
		return "Bean2_Bean [name=" + name + ", surname=" + surname + "]";
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
