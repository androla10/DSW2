package com.devinspirare.commons.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pokemon {
	private String nombre;
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
