package com.hamit.valueChangeListener;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

@Named(value = "valueChangeBean")
@SessionScoped
public class ValueChangeBean implements Serializable {
	private static final long serialVersionUID = 5439503629170769478L;

	private String adi;
	private String sayi;

	public ValueChangeBean() {
		this.adi = "Hamit Mizrak";
	}

	// value change method
	public void changeMethod(ValueChangeEvent event) {
		System.out.println(event.getComponent().getId());
		System.out.println(event.getOldValue());
		System.out.println(event.getNewValue());

		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "başlık", "içerik alanıdır");
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);

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

	public String getSayi() {
		return sayi;
	}

	public void setSayi(String sayi) {
		this.sayi = sayi;
	}

}
