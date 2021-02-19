package com.hamit.ajax;

public class AltKategorilerDto {

	private long altKategorilerID;
	private String altKategorilerAdi;
	private UstKategoriDto ustKategori;

	public AltKategorilerDto() {
	}

	public AltKategorilerDto(long altKategorilerID, String altKategorilerAdi) {
		super();
		this.altKategorilerID = altKategorilerID;
		this.altKategorilerAdi = altKategorilerAdi;
	}

	public long getAltKategorilerID() {
		return altKategorilerID;
	}

	public void setAltKategorilerID(long altKategorilerID) {
		this.altKategorilerID = altKategorilerID;
	}

	public String getAltKategorilerAdi() {
		return altKategorilerAdi;
	}

	public void setAltKategorilerAdi(String altKategorilerAdi) {
		this.altKategorilerAdi = altKategorilerAdi;
	}

	public UstKategoriDto getUstKategori() {
		return ustKategori;
	}

	public void setUstKategori(UstKategoriDto ustKategori) {
		if (this.ustKategori == null) {
			ustKategori = new UstKategoriDto();
		}
		this.ustKategori = ustKategori;
	}

}
