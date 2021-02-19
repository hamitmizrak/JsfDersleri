package com.hamit.pageredirect;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named(value = "pageRedirect")
@SessionScoped
public class PageRedirect implements Serializable {
	private static final long serialVersionUID = 2008942357090366142L;

	// Nesne değişkenleri
	private String adi = "";
	private String soyadi = "";
	private String hazirParam;

	// Parametresiz constructor
	public PageRedirect() {
		this.hazirParam = "databasegelen";
	}

	// methodVoid
	public void methodVoid() {

	}

	// method null String
	public String methodNullString() {

		return null;
	}

	// method String
	public String methodOtherPageString() {

		return "other?adi=Java";
	}

	// method farklı url String
	public String methodOtherDifferentUrlString() {

		return "other?faces-redirect=true";
	}

	// ActionEvent (<f:attribute name="adi" value="44" />
	public String methodListener(ActionEvent event2) {
		String temp = (String) event2.getComponent().getAttributes().get("adi");
		String a2 = temp;
		return "other.xhtml?faces-redirect=true" + temp;
	}

	public String methodSetProperyActionListenerMethod() {

		return "other";
	}

	// getter setter
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

	public String getHazirParam() {
		return hazirParam;
	}

	public void setHazirParam(String hazirParam) {
		this.hazirParam = hazirParam;
	}

}
