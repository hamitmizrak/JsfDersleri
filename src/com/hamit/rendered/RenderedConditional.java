package com.hamit.rendered;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("renderedConditional")
@SessionScoped
public class RenderedConditional implements Serializable {
	private static final long serialVersionUID = 8797268901011540209L;

	// Nesne değişkenleri
	private boolean karar;
	private String kelime;
	private int sayi;

	private String teknoloji = "Html5 Css3 Js Jquery Angular Vue Java Java EE Servler JSP JSF Spring ";

	// parametresiz constructor
	public RenderedConditional() {
		this.karar = false;
		this.kelime = "hamit";
		this.sayi = 44;
	}

	// getter and setter
	public boolean isKarar() {
		return karar;
	}

	public void setKarar(boolean karar) {
		this.karar = karar;
	}

	public String getKelime() {
		return kelime;
	}

	public void setKelime(String kelime) {
		this.kelime = kelime;
	}

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getTeknoloji() {
		return teknoloji;
	}

	public void setTeknoloji(String teknoloji) {
		this.teknoloji = teknoloji;
	}

}
