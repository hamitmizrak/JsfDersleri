package com.hamit.uiform;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named(value = "outputTextForm")
@Dependent
public class OutputTextForm implements Serializable {
	private static final long serialVersionUID = -5861458453216245250L;

	private String adi;

	public OutputTextForm() {
		this.adi = "<b><i>bir şey yazmadınız</i></b>";
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
