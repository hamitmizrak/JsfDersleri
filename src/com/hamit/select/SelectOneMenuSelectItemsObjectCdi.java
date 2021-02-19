package com.hamit.select;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "selectOneMenusSelectItemsObjectCdi")
@SessionScoped
public class SelectOneMenuSelectItemsObjectCdi implements Serializable {
	private static final long serialVersionUID = -5653128581668972607L;

	private int secilmis;

	public SelectOneMenuSelectItemsObjectCdi() {
		this.secilmis = 2;
	}

	public List<Student> getStudentsList() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "Hamit Mızrak"));
		studentList.add(new Student(2, "Hulusi Mızrak"));
		studentList.add(new Student(3, "Harun Bayer"));
		return studentList;
	}

	public void methods() {

	}

	// getter and setter
	public int getSecilmis() {
		return secilmis;
	}

	public void setSecilmis(int secilmis) {
		this.secilmis = secilmis;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
