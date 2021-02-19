package com.hamit.ui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class YazilimTeknolojiController implements Serializable {
	private static final long serialVersionUID = -6037712022177391524L;

	private List<YazilimTeknoloji> teknolojis;

	public YazilimTeknolojiController() {
		teknolojis = new ArrayList<YazilimTeknoloji>();
		teknolojis.add(new YazilimTeknoloji(1, "Html5"));
		teknolojis.add(new YazilimTeknoloji(2, "Css3"));
		teknolojis.add(new YazilimTeknoloji(3, "JS"));
		teknolojis.add(new YazilimTeknoloji(4, "Jquery"));
		teknolojis.add(new YazilimTeknoloji(5, "Bootstrap"));
		teknolojis.add(new YazilimTeknoloji(6, "Vue"));
		teknolojis.add(new YazilimTeknoloji(7, "Angular"));
		teknolojis.add(new YazilimTeknoloji(8, "Java se"));
		teknolojis.add(new YazilimTeknoloji(9, "Hibernate"));
		teknolojis.add(new YazilimTeknoloji(10, "EF"));
		teknolojis.add(new YazilimTeknoloji(11, "Mysql"));
		teknolojis.add(new YazilimTeknoloji(12, "Mssql"));
		teknolojis.add(new YazilimTeknoloji(13, "Postgresql"));
		teknolojis.add(new YazilimTeknoloji(14, "NoSql"));
		teknolojis.add(new YazilimTeknoloji(15, "Oracle db"));
		teknolojis.add(new YazilimTeknoloji(16, "web servisler"));
		teknolojis.add(new YazilimTeknoloji(17, "Git"));
		teknolojis.add(new YazilimTeknoloji(18, "web servisler"));
		teknolojis.add(new YazilimTeknoloji(19, "Servlet"));
		teknolojis.add(new YazilimTeknoloji(20, "Jsp"));
		teknolojis.add(new YazilimTeknoloji(21, "JSF"));
		teknolojis.add(new YazilimTeknoloji(22, "Spring Boot"));

	}

	public List<YazilimTeknoloji> getTeknolojis() {
		return teknolojis;
	}

	public void setTeknolojis(List<YazilimTeknoloji> teknolojis) {
		this.teknolojis = teknolojis;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// getterand setter

}
