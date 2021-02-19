package com.hamit.bean;

import java.io.Serializable;

//import javax.faces.bean.SessionScoped;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
//import javax.faces.bean.ViewScoped;
//import javax.faces.bean.NoneScoped;

// S-A-R C-N –V 

//BEAN= POJO+parametresiz const. +parametreli const + serileştirme +metotlar(toString  ...)

@ManagedBean(name = "managedBeanPage")
// @SessionScoped // farklı browserlarda çalışmadı.
@ApplicationScoped // farklı browserlarda çalışılıyor.
// @RequestScoped
// @ViewScoped
// @NoneScoped
// @CustomScoped

public class Bean3_ManagedBean implements Serializable {
	private static final long serialVersionUID = -2271905960204756762L;

	// nesne değişkeni
	private String name;
	private String surname;

	// parametresiz constructor
	public Bean3_ManagedBean() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public Bean3_ManagedBean(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String metotAdi() {
		return this.name + " " + this.surname;
	}

	// oturum yönetimi
	public String sessionPageRedirect() {
		// if (this.name.equalsIgnoreCase("hamitmizrak@gmail.com")) {
		// return "adminPage?faces-redirect=true";
		// } else {
		// return "userPage?faces-redirect=true";
		// }

		String result = this.name.equalsIgnoreCase("hamitmizrak@gmail.com") ? "adminPage?faces-redirect=true"
				: "userPage?faces-redirect=true";
		return result;
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
