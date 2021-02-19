package com.hamit.select;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "selectOneRadioCdi")
@SessionScoped
public class SelectOneRadioSelectItemCdi implements Serializable {
	private static final long serialVersionUID = 3638283515568695045L;

	private String javaTeknolojileri;

	public void selectMethod() {

	}

	// getter and setter
	public String getJavaTeknolojileri() {
		return javaTeknolojileri;
	}

	public void setJavaTeknolojileri(String javaTeknolojileri) {
		this.javaTeknolojileri = javaTeknolojileri;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
