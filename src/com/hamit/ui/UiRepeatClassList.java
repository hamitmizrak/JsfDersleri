package com.hamit.ui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "uiRepeatClassList")
@SessionScoped
public class UiRepeatClassList implements Serializable {
	private static final long serialVersionUID = 9094103331239585991L;

	// nesne değişkenleri
	List<Teknoloji> teknoList;

	public UiRepeatClassList() {
		teknoList = new ArrayList<Teknoloji>();
		teknoList.add(new Teknoloji(1, "JSP", "100"));
		teknoList.add(new Teknoloji(2, "JSF", "200"));
		teknoList.add(new Teknoloji(3, "Spring", "300"));
	}

	// getter and setter
	public List<Teknoloji> getTeknoList() {
		return teknoList;
	}

	public void setTeknoList(List<Teknoloji> teknoList) {
		this.teknoList = teknoList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
