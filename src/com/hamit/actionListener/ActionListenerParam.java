package com.hamit.actionListener;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Named(value = "actionListenerParam")
@SessionScoped
public class ActionListenerParam implements Serializable {
	private static final long serialVersionUID = 5754176247756136112L;

	// ActionListenerAttributesMethod
	public void ActionListenerAttributesMethod(ActionEvent event) {
		System.out.println((event.getComponent().getClientId()));
		String actionEvent = (String) event.getComponent().getAttributes().get("adi");
		System.out.println(actionEvent);
	}

	// Action request.getParameter
	public void ActionRequestGetParameterMethod() {
		try {
			HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
					.getRequest();
			String soyadim = request.getParameter("soyadi");
			System.out.println(soyadim);

			HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext()
					.getResponse();
			response.sendRedirect("Login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Action request.getParameter
	public void ActionMapParameterMethod() {
		Map<String, String> mapParameter = FacesContext.getCurrentInstance().getExternalContext()
				.getRequestParameterMap();
		String memleket = mapParameter.get("memleket");
		System.out.println(memleket);
	}

}
