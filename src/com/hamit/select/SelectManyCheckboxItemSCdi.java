package com.hamit.select;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "selectManyCheckboxItemSCdi")
@SessionScoped
public class SelectManyCheckboxItemSCdi implements Serializable {
	private static final long serialVersionUID = -628204025272111268L;

	private String[] data = new String[3];

	private Map<String, Object> mapList;

	public SelectManyCheckboxItemSCdi() {
		data[0] = "1";
		data[2] = "3";

		mapList = new LinkedHashMap<String, Object>();
		mapList.put("JSF", "1");
		mapList.put("JSP", "2");
		mapList.put("AWT", "3");
		mapList.put("JavaFX", "4");

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

	public Map<String, Object> getMapList() {
		return mapList;
	}

	public void setMapList(Map<String, Object> mapList) {
		this.mapList = mapList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
