package com.hamit.ui;

import java.io.Serializable;
import java.util.Arrays;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "uiRepeatList")
@SessionScoped
public class UiRepeatList implements Serializable {
	private static final long serialVersionUID = 9094103331279585991L;

	// nesne değişkenleri
	private String[] teknoloji;
	private boolean admincondition;

	// parametresiz constructor
	public UiRepeatList() {
		teknoloji = new String[15];
		for (int i = 0; i < teknoloji.length; i++) {
			teknoloji[i] = "Java " + (i + 1);
		}

		// admin boolean
		this.admincondition = false;

	}

	@Override
	public String toString() {
		return "UiRepeatList [teknoloji=" + Arrays.toString(teknoloji) + "]";
	}

	// getter and setter
	public String[] getTeknoloji() {
		return teknoloji;
	}

	public void setTeknoloji(String[] teknoloji) {
		this.teknoloji = teknoloji;
	}

	public boolean isAdmincondition() {
		return admincondition;
	}

	public void setAdmincondition(boolean admincondition) {
		this.admincondition = admincondition;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void main(String[] args) {
		UiRepeatList list = new UiRepeatList();
		System.out.println(list);
	}

}
