package edu.cibertec.model;

import java.util.List;

public class Continente {
	private String nombre;
	private List<Pais> lstPaises;

	public Continente(String nombre, List<Pais> lsPais) {
		this.nombre = nombre;
		this.lstPaises = lsPais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadPaises() {
		return lstPaises.size();
	}

	public List<Pais> getLstPaises() {
		return lstPaises;
	}

	public void setLstPaises(List<Pais> lstPaises) {
		this.lstPaises = lstPaises;
	}

	public String obtenerMensajeCantidadPaises() {
		return this.nombre + " " + "tiene " + this.lstPaises.size() + " paises";
	}
}
