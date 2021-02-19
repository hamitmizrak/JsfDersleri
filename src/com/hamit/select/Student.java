package com.hamit.select;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = -5576569416064552222L;

	// nesne değişkenleri
	private long id;
	private String nameSurname;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(long id, String nameSurname) {
		super();
		this.id = id;
		this.nameSurname = nameSurname;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "id=" + id + ", nameSurname=" + nameSurname;
	}

}
