package com.hamit.facescontext;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

@Named(value = "requestContextTutorials")
@SessionScoped
public class RequestContextTutorials implements Serializable {
	private static final long serialVersionUID = 8196506868170545232L;

	// nesne değişkeni
	private String gelenParametre = "";
	private String gidenAttribute = "";
	private String gidenSetAttributeValue = "";

	public RequestContextTutorials() {
		// <f:param ile gelen parametreyi gönderiyoruz
		HttpServletRequest request = FacesUtils.getRequest();
		this.gelenParametre = request.getParameter("adi");

	}

	// commandButton metotudu
	public String paramOtherPageFaces() {
		return "RequestPage?faces-redirect=true";
	}

	// commandButton metotudu
	public String paramOtherPageFacesSetAttribute() {
		// inputTexten gelen veriyi gönder
		HttpServletRequest setAttribute = FacesUtils.getRequest();
		setAttribute.setAttribute("settttt", this.gidenAttribute);
		this.gidenSetAttributeValue = (String) setAttribute.getAttribute("settttt");
		return "RequestSetAttribute.xhtml?faces-redirect=true";
	}

	// getter and setter
	public String getGelenParametre() {
		return gelenParametre;
	}

	public void setGelenParametre(String gelenParametre) {
		this.gelenParametre = gelenParametre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getGidenAttribute() {
		return gidenAttribute;
	}

	public void setGidenAttribute(String gidenAttribute) {
		this.gidenAttribute = gidenAttribute;
	}

	public String getGidenSetAttributeValue() {
		return gidenSetAttributeValue;
	}

	public void setGidenSetAttributeValue(String gidenSetAttributeValue) {
		this.gidenSetAttributeValue = gidenSetAttributeValue;
	}

}
