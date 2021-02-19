package com.hamit.ajax;

import java.util.ArrayList;
import java.util.List;

public class UstKategoriDto {

	private long ustKategoriID;
	private String ustKategoriAdi;

	private List<AltKategorilerDto> altKategorilers;

	public UstKategoriDto() {
		// TODO Auto-generated constructor stub
	}

	public UstKategoriDto(long ustKategoriID, String ustKategoriAdi) {
		super();
		this.ustKategoriID = ustKategoriID;
		this.ustKategoriAdi = ustKategoriAdi;
	}

	public long getUstKategoriID() {
		return ustKategoriID;
	}

	public void setUstKategoriID(long ustKategoriID) {
		this.ustKategoriID = ustKategoriID;
	}

	public String getUstKategoriAdi() {
		return ustKategoriAdi;
	}

	public void setUstKategoriAdi(String ustKategoriAdi) {
		this.ustKategoriAdi = ustKategoriAdi;
	}

	public List<AltKategorilerDto> getAltKategorilers() {
		return altKategorilers;
	}

	public void setAltKategorilers(List<AltKategorilerDto> altKategorilers) {
		if (this.altKategorilers == null)
			this.altKategorilers = new ArrayList<AltKategorilerDto>();
		this.altKategorilers = altKategorilers;
	}
}