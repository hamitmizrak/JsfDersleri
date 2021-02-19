package com.hamit.select;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "selectEnumItemSCdi")
@SessionScoped
public class SelectEnumItemsSCdi implements Serializable {
	private static final long serialVersionUID = -3291124788615148714L;

	// nesne değişkenleri
	private String data;
	private ChooiseProcess chooiseProcess;

	// parametresiz constructor
	public SelectEnumItemsSCdi() {
		data = "1";
	}

	// method
	public void method() {

	}

	public ChooiseProcess[] getChooiseProcessList() {
		// Arrays.sort(ChooiseProcess.values());
		return ChooiseProcess.values();
	}

	// getter setter
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ChooiseProcess getChooiseProcess() {
		return chooiseProcess;
	}

	public void setChooiseProcess(ChooiseProcess chooiseProcess) {
		this.chooiseProcess = chooiseProcess;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
