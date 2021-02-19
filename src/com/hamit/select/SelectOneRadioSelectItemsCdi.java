package com.hamit.select;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "selectOneRadioSelectItemsCdi")
@SessionScoped
public class SelectOneRadioSelectItemsCdi implements Serializable {
	private static final long serialVersionUID = 6330627269393478360L;

	private String dersler;

	private static Map<String, Object> mapList;

	// 1.yol
	public SelectOneRadioSelectItemsCdi() {
		mapList = new LinkedHashMap<String, Object>();
		mapList.put("Servlet", "1");
		mapList.put("JSP", "2");
		mapList.put("JSF", "3");
	}

	// 2.yol
	static {

		mapList = new LinkedHashMap<String, Object>();
		mapList.put("Servlet", "1");
		mapList.put("JSP", "2");
		mapList.put("JSF", "3");
	}

	public void selectMethod() {

	}

	public String selectMethod2() {

		return null;
	}

	// getter and seetter

	public String getDersler() {
		return dersler;
	}

	public Map<String, Object> getMapList() {
		return mapList;
	}

	public void setMapList(Map<String, Object> mapList) {
		this.mapList = mapList;
	}

	public void setDersler(String dersler) {
		this.dersler = dersler;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
