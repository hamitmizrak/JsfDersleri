package com.hamit.ajax;

import java.util.ArrayList;
import java.util.List;

public class UstAltKategoriDao {

	private List<UstKategoriDto> ustKategoriDtos;

	public UstAltKategoriDao() {
		ustKategoriDtos = new ArrayList<UstKategoriDto>();

		UstKategoriDto java = new UstKategoriDto(1, "Java");
		java.setAltKategorilers(new ArrayList<>());
		java.getAltKategorilers().add(new AltKategorilerDto(1, "JSP"));
		java.getAltKategorilers().add(new AltKategorilerDto(2, "JSF"));
		java.getAltKategorilers().add(new AltKategorilerDto(3, "Spring"));
		ustKategoriDtos.add(java);

		UstKategoriDto html = new UstKategoriDto(2, "html");
		html.setAltKategorilers(new ArrayList<>());
		html.getAltKategorilers().add(new AltKategorilerDto(1, "semantic"));
		html.getAltKategorilers().add(new AltKategorilerDto(2, "music Video"));
		html.getAltKategorilers().add(new AltKategorilerDto(3, "html formatter"));
		ustKategoriDtos.add(html);

		UstKategoriDto css = new UstKategoriDto(3, "css");
		css.setAltKategorilers(new ArrayList<>());
		css.getAltKategorilers().add(new AltKategorilerDto(1, "inline css"));
		css.getAltKategorilers().add(new AltKategorilerDto(2, "external css"));
		css.getAltKategorilers().add(new AltKategorilerDto(3, "style"));
		ustKategoriDtos.add(css);
	}

	// üst kategori çağırma
	public UstKategoriDto getSecUstKategoriDto(int ustId) {
		if (ustId == 0)
			return null;
		for (UstKategoriDto tempUst : ustKategoriDtos) {
			if (tempUst.getUstKategoriID() == ustId) {
				return tempUst;
			}
		}
		return null;
	}

	// alt kategori
	public AltKategorilerDto getSecAltKategoriDto(int altId) {
		if (altId == 0) {
			return null;
		}

		for (UstKategoriDto tempUst : ustKategoriDtos) {
			for (AltKategorilerDto tempAlt : tempUst.getAltKategorilers()) {
				if (tempAlt.getAltKategorilerID() == altId) {
					return tempAlt;
				}
			}
		}
		return null;
	}

	// getter and setter
	public List<UstKategoriDto> getUstKategoriDtos() {
		return ustKategoriDtos;
	}
	// Üst Kategor Listesi

	public void setUstKategoriDtos(List<UstKategoriDto> ustKategoriDtos) {
		this.ustKategoriDtos = ustKategoriDtos;
	}

}
