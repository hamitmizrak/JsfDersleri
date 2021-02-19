
package com.hamit.actionListener;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ActionClassDeneme implements Serializable {
	private static final long serialVersionUID = -9201233613523211684L;

	private String fullName = "Deneme";

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}