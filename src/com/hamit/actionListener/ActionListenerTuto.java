package com.hamit.actionListener;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named(value = "actionListenerTuto")
@SessionScoped
public class ActionListenerTuto implements Serializable {
	private static final long serialVersionUID = -2163238784308659907L;

	private String adi;

	// action
	public String method3() {
		return "Login?faces-redirect=true";
	}

	// actionListener method
	public void actionListenerMethod(ActionEvent event) {
		// System.err.println("Console in push: " + getAdi());
		System.out.println(event.getComponent().getId());
	}

	// getter and setter
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

}
