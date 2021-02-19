package com.hamit.actionListener;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class NormalJavaClassAction implements ActionListener {
	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		System.out.println(event.getComponent().getId());
		ActionClassDeneme actionClassDeneme = (ActionClassDeneme) FacesContext.getCurrentInstance().getExternalContext()
				.getRequestMap().get("actionClassDeneme");
		System.out.println(actionClassDeneme.getFullName());
	}

}
