package com.hamit.ajax;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("ustAltKategoriController")
@ViewScoped
public class UstAltKategoriController implements Serializable {
	private static final long serialVersionUID = 2739051103468221675L;

	private List<UstKategoriDto> ustList;
	private List<AltKategorilerDto> altList;

	private int ustID;
	private int altID;

	private UstKategoriDto ustKategoriDto;
	private AltKategorilerDto altKategorilerDto;

	public UstAltKategoriController() {
		UstAltKategoriDao ustAltKategoriDao = new UstAltKategoriDao();
		ustList = ustAltKategoriDao.getUstKategoriDtos();
	}

	// getter and setter
	public int getUstID() {
		return ustID;
	}

	public void setUstID(int ustID) {
		this.ustID = ustID;
		if (ustID == 0) {
			altID = 0;
			altList = new ArrayList<AltKategorilerDto>();
		}
		UstAltKategoriDao ustAltKategoriDao = new UstAltKategoriDao();
		ustKategoriDto = ustAltKategoriDao.getSecUstKategoriDto(ustID);
		if (ustKategoriDto != null) {
			altList = ustKategoriDto.getAltKategorilers();
		}
	}

	public int getAltID() {
		return altID;
	}

	public void setAltID(int altID) {
		this.altID = altID;
		UstAltKategoriDao ustAltKategoriDao = new UstAltKategoriDao();
		altKategorilerDto = ustAltKategoriDao.getSecAltKategoriDto(altID);
	}

	public List<UstKategoriDto> getUstList() {
		return ustList;
	}

	public void setUstList(List<UstKategoriDto> ustList) {
		if (this.ustList == null)
			this.ustList = new ArrayList<UstKategoriDto>();
		this.ustList = ustList;
	}

	public List<AltKategorilerDto> getAltList() {
		return altList;
	}

	public void setAltList(List<AltKategorilerDto> altList) {
		this.altList = altList;
	}

	public UstKategoriDto getUstKategoriDto() {
		return ustKategoriDto;
	}

	public void setUstKategoriDto(UstKategoriDto ustKategoriDto) {
		this.ustKategoriDto = ustKategoriDto;
	}

	public AltKategorilerDto getAltKategorilerDto() {
		return altKategorilerDto;
	}

	public void setAltKategorilerDto(AltKategorilerDto altKategorilerDto) {
		this.altKategorilerDto = altKategorilerDto;
	}

}
