package com.hamit.facescontext;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Named
@SessionScoped
public class FacesUtils implements Serializable {
	private static final long serialVersionUID = 4162235131628280776L;

	// Request
	public static HttpServletRequest getRequest() {
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		return request;
	}

	// Response
	public static HttpServletResponse getResponse() {
		return (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
	}

	// Session
	public static HttpSession getSession() {
		return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
	}

	// Message
	public static void messageBox(String header, String content) {
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_FATAL, header, content);
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}

}
