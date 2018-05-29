package edu.cibertec.model;

public class Pais {
	private String nombre;
	private String capital;
	private String idioma;

	public Pais(String nombre, String capital, String idioma) {
		this.nombre = nombre;
		this.capital = capital;
		this.idioma = idioma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}
