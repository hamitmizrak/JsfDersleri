package com.hamit.cdi;

import java.io.Serializable;

//import javax.enterprise.context.ConversationScoped;
//import javax.enterprise.context.Dependent; //defaulttta zincirleme:
//import javax.enterprise.context.SessionScoped;
//import javax.enterprise.context.ApplicationScoped;
//import javax.enterprise.context.RequestScoped;

//@Stereotype nedir= Eğer n tane anatosyonumuz var bunları hepsi 1 tane anatasyon olarak kullanmak istiyorsak kullanıyoruz.

//@Disposes =  Bean destroy edilmeden önce yapılması gerekenleri burada belirtebiliriz.

import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "teacherCdi")
// @Dependent
// @SessionScoped
// @ApplicationScoped
// @ConversationScoped
// @RequestScoped

public class TeacherCdi implements Serializable {
	private static final long serialVersionUID = 1L;

	private String teacherName;
	private String teacherSurname;

	@Inject
	private StudentCdi studentCdi;

	public TeacherCdi() {
		studentCdi = new StudentCdi();
	}

	// methods
	public void teacherNameSurname() {
		studentCdi.studentNameAndSurname();
	}
	// getter and setter

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherSurname() {
		return teacherSurname;
	}

	public void setTeacherSurname(String teacherSurname) {
		this.teacherSurname = teacherSurname;
	}

	public StudentCdi getStudentCdi() {
		return studentCdi;
	}

	public void setStudentCdi(StudentCdi studentCdi) {
		this.studentCdi = studentCdi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
