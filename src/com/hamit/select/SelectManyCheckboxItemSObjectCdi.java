package com.hamit.select;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "selectManyCheckboxItemSObjectxCdi")
@SessionScoped
public class SelectManyCheckboxItemSObjectCdi implements Serializable {
	private static final long serialVersionUID = -628204025272111268L;

	private String[] data = new String[3];

	private List<Student> list;

	public SelectManyCheckboxItemSObjectCdi() {
		data[0] = "1";
		data[2] = "3";

		list = new LinkedList<Student>();
		list.add(new Student(1, "Talha ŞEKEROĞLU"));
		list.add(new Student(2, "İbrahim IŞIK"));
		list.add(new Student(3, "Furkan IŞIK"));

	}

	// method
	public void method() {

	}
	// getter setter

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
