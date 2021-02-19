package com.hamit.cdi;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named(value = "studentCdi")
@Dependent
public class StudentCdi implements Serializable {
	private static final long serialVersionUID = 1L;

	private String studentName;
	private String studentSurname;

	public StudentCdi() {
		this.studentName = "Ad girmediniz";
		this.studentSurname = "Soyad girmediniz";
	}

	public void studentNameAndSurname() {
		System.out.println(this.studentName + " " + this.studentSurname);
	}

	// Getter and setter
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurname() {
		return studentSurname;
	}

	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
