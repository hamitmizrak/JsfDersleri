package com.hamit.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "bean4")
@SessionScoped
public class Bean4_CDIBean implements Serializable {
	private static final long serialVersionUID = -7088437315331345348L;

	private String name;
	private String surname;

	public String methodSend() {
		return null;
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
