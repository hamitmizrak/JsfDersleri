package com.hamit.local;

import java.io.Serializable;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("localeCdiBean")
@SessionScoped
public class LocaleCdiBean implements Serializable {
	private static final long serialVersionUID = -4544833882249423934L;

	public Locale localeMethod() {
		return FacesContext.getCurrentInstance().getViewRoot().getLocale();
	}
}
