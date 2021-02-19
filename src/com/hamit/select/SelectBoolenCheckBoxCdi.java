package com.hamit.select;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value = "selectCdi")
@SessionScoped
public class SelectBoolenCheckBoxCdi implements Serializable {
	private static final long serialVersionUID = -3092133658603231785L;

	// selectBooleanCheckBox
	private boolean rememberMe = true;

	public void selectMethod() {

		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, " " + this.rememberMe, "Başlık");
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}

	// getter and Setter
	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
