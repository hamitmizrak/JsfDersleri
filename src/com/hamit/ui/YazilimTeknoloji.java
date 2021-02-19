package com.hamit.ui;

public class YazilimTeknoloji {

	private long id;
	private String adi;

	public YazilimTeknoloji() {
		this.id = 0;
		this.adi = "teknoloji adı";
	}

	public YazilimTeknoloji(long id, String adi) {
		super();
		this.id = id;
		this.adi = adi;
	}

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

	@Override
	public String toString() {
		return "YazilimTeknoloji [id=" + id + ", adi=" + adi + "]";
	}

}
