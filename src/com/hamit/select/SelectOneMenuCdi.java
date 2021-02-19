package com.hamit.select;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "selectOneMenuCdi")
@SessionScoped
public class SelectOneMenuCdi implements Serializable {
	private static final long serialVersionUID = -8624309562968454161L;

	private String dersler;

	/// methods
	public String sendMethod() {

		return null;
	}

	// getter and setter
	public String getDersler() {
		return dersler;
	}

	public void setDersler(String dersler) {
		this.dersler = dersler;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
