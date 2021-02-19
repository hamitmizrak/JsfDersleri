package com.hamit.select;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "selectManyCheckboxCdi")
@SessionScoped
public class SelectManyCheckboxCdi implements Serializable {
	private static final long serialVersionUID = -628204025272111268L;

	private String[] data = new String[3];

	public SelectManyCheckboxCdi() {
		data[0] = "1";
		data[2] = "3";
	}

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

	// method
	public void method() {

	}
}
