package com.hamit.implicit;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletResponse;

@Named(value = "login")
@SessionScoped
public class Login implements Serializable {
	private static final long serialVersionUID = -6828683945223697601L;

	// nesne değişkeni
	private long id;
	private String email;
	private String password;
	private boolean adminResult = true;

	// parametresiz kurucu method
	public Login() {
		this.id = 0;
		this.email = "hamitmizrak@gmail.com";
		this.password = "root";
	}

	// 1.Method
	public String postAdminPage() {
		System.out.println(getId() + "\n" + getEmail() + "\n" + getPassword());
		String defaultEmail = "root@gmail.com", defaultPassword = "123";
		if ((defaultEmail.equalsIgnoreCase(getEmail())) && (defaultPassword.equals(getPassword()))) {
			return "admin/admin.xhtml?faces-redirect=true";
		} else {
			return "Ders55_ImplicitNavigation?faces-redirect=true";
		}
	}

	// 2.Method Faces Redirect
	public void postAdminPageFacesRedirect() {
		try {

			System.out.println(getId() + "\n" + getEmail() + "\n" + getPassword());
			String defaultEmail = "root@gmail.com", defaultPassword = "123";
			HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext()
					.getResponse();

			if ((defaultEmail.equalsIgnoreCase(getEmail())) && (defaultPassword.equals(getPassword()))) {
				FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Success ", "Admin başarılı ");
				FacesContext.getCurrentInstance().addMessage(null, facesMessage);
				response.sendRedirect("admin/admin.xhtml?faces-redirect=true");
			} else {
				FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error ",
						"email veya şifre yanlış ");
				FacesContext.getCurrentInstance().addMessage(null, facesMessage);
				response.sendRedirect("Ders56_ImplicitNavigationFacesRedirect.xhtml?faces-redirect=true");
			}
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	// 3.method implicit Navigation
	public String postAdminPageImplicitNavigation() {
		System.out.println(getId() + "\n" + getEmail() + "\n" + getPassword());
		String defaultEmail = "root@gmail.com", defaultPassword = "123";
		if ((defaultEmail.equalsIgnoreCase(getEmail())) && (defaultPassword.equals(getPassword()))) {
			return "success";
		} else {
			return "fail";
		}
	}

	// getter and setter
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isAdminResult() {
		return adminResult;
	}

	public void setAdminResult(boolean adminResult) {
		this.adminResult = adminResult;
	}

}
