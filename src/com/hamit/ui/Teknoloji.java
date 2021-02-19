package com.hamit.ui;

public class Teknoloji {

	// nesne değişkenleri
	private long id;
	private String adi;
	private String fiyati;

	public Teknoloji() {
		// TODO Auto-generated constructor stub
	}

	public Teknoloji(long id, String adi, String fiyati) {
		super();
		this.id = id;
		this.adi = adi;
		this.fiyati = fiyati;
	}

	@Override
	public String toString() {
		return "Teknoloji [id=" + id + ", adi=" + adi + ", fiyati=" + fiyati + "]";
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getFiyati() {
		return fiyati;
	}

	public void setFiyati(String fiyati) {
		this.fiyati = fiyati;
	}

}
