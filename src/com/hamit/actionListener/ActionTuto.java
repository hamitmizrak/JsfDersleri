package com.hamit.actionListener;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletResponse;

@Named(value = "actionClassTuto")
@SessionScoped
public class ActionTuto implements Serializable {
	private static final long serialVersionUID = -1203469892180711725L;
	// nesne değişkenleri
	private String adi;

	// method
	public void method() {

	}

	// method 2 overloading
	public String method(String ad) {

		return null;
	}

	// method 2 overloading
	public String method2() {

		return "index";
	}

	// method 3
	public String method3() {

		return "index?faces-redirect=true";
	}

	public void method4() {

		try {
			HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext()
					.getResponse();
			response.sendRedirect("Login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// getter and setter
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
