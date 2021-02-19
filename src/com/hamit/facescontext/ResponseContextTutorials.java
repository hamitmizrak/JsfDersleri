package com.hamit.facescontext;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.HttpServletResponse;

@Named
@SessionScoped
public class ResponseContextTutorials implements Serializable {
	private static final long serialVersionUID = -4473120457066019153L;

	private String str1 = "";
	private String str2 = "";
	private String str3 = "";
	private String str4 = "";
	private String str5 = "";

	// response method
	public void responseMethod1() {
	}

	public String responseMethod2() {
		return null;
	}

	public String responseMethod3() {
		return "ResponsePage";
	}

	public String responseMethod4() {
		return "ResponsePage?faces-redirect=true";
	}

	public void responseMethod5() {
		HttpServletResponse response = FacesUtils.getResponse();
		try {
			response.sendRedirect("ResponsePage.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// getter and setter
	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public String getStr3() {
		return str3;
	}

	public void setStr3(String str3) {
		this.str3 = str3;
	}

	public String getStr4() {
		return str4;
	}

	public void setStr4(String str4) {
		this.str4 = str4;
	}

	public String getStr5() {
		return str5;
	}

	public void setStr5(String str5) {
		this.str5 = str5;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
