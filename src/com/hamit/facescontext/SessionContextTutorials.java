package com.hamit.facescontext;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named
@SessionScoped
public class SessionContextTutorials implements Serializable {
	private static final long serialVersionUID = -4473120457066119153L;

	// nesne değişkeni
	private String nameSurname;

	private String sessionInPage;

	public SessionContextTutorials() {
		// TODO Auto-generated constructor stub
	}

	// method session
	public String sessionMethod() {
		HttpSession session = FacesUtils.getSession();
		session.setAttribute("key", nameSurname);

		this.sessionInPage = (String) session.getAttribute("key");
		return "SessionPage?faces-redirect=true";
	}

	public void sessionLogout() {

		if (this.sessionInPage != null) {
			HttpSession session = FacesUtils.getSession();
			// session.removeAttribute(this.nameSurname);
			session.invalidate();
		}

	}

	// getter and setter
	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSessionInPage() {
		return sessionInPage;
	}

	public void setSessionInPage(String sessionInPage) {
		this.sessionInPage = sessionInPage;
	}

}
