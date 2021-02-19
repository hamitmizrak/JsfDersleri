package com.ajax.action;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named(value = "studentAjax")
@ViewScoped
public class StudentAjax implements Serializable {
	private static final long serialVersionUID = 9003945893993771356L;

	private String adi;
	private String soyadi;
	private String adiSoyadi;

	// ajax method
	public void ajaxMethod2() {

	}

	public void ajaxActionMethod() {

	}

	// getter and setter
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAdiSoyadi() {
		return adiSoyadi;
	}

	public void setAdiSoyadi(String adiSoyadi) {
		this.adiSoyadi = adiSoyadi;
	}

}
