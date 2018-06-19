package edu.cibertec.el4villarrealmarcelo.service.fifa.dto;

import java.util.Date;
import java.util.List;

public class FifaResponseDTO {
	private Date fechaInicio;
	private Date fechaFin;

	private String lugar;
	private String mascota;
	private List<PaisDTO> listaPaises;

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getMascota() {
		return mascota;
	}

	public void setMascota(String mascota) {
		this.mascota = mascota;
	}

	public List<PaisDTO> getListaPaises() {
		return listaPaises;
	}

	public void setListaPaises(List<PaisDTO> listaPaises) {
		this.listaPaises = listaPaises;
	}

}
