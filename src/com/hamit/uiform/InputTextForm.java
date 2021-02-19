package com.hamit.uiform;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

//Bean= +constructor+POJO
@Named(value = "student44")
@ApplicationScoped
public class InputTextForm implements Serializable {
	private static final long serialVersionUID = -8107558516330723170L;

	private long id;
	private String adi;
	// private String soyadi = "okunabilir";
	private String soyadi;

	public InputTextForm() {
		this.id = 4;
	}

	public String adiSoyadi() {
		this.adi = this.adi.toUpperCase();
		// int sayi = (int) this.id;
		return "Ders009_UI_inputText.xhtml?faces-redirect=true";
	}

	// yeni metot
	public void ayniSayfaYonlendirmek(int id) {

	}

	public void ayniSayfaYonlendirmek44() {

	}

	public String farkliSayfaYonlendirmekNull(int id) {

		return null;

	}

	public String farkliSayfaYonlendirmek() {

		return "index";

	}

	public String farkliSayfaYonlendirmekUrlDegissin() {

		return "index?faces-redirect=true";

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	// toString
	@Override
	public String toString() {
		return "InputTextForm [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + "]";
	}

}
