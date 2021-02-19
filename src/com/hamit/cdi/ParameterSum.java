package com.hamit.cdi;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value = "sumClass")
@SessionScoped
public class ParameterSum implements Serializable {
	private final static long serialVersionUID = 1L;

	// nesne değişkenleri
	private int number1;
	private int number2;

	public void sumMethod() {
		int toplam = this.number1 + this.number2;
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "toplam sonucu= " + toplam,
				"Başlık alanı");
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);

	}

	// getter setter
	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
