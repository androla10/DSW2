package com.devinspirare.commons.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EntrenadorPokemon {
	private String nombre;
	private String pueblo;
	private Pokemon mascotaPrincipal;
	private List<Pokemon> pokemones;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPueblo() {
		return pueblo;
	}

	public void setPueblo(String pueblo) {
		this.pueblo = pueblo;
	}

	public Pokemon getMascotaPrincipal() {
		return mascotaPrincipal;
	}

	public void setMascotaPrincipal(Pokemon mascotaPrincipal) {
		this.mascotaPrincipal = mascotaPrincipal;
	}

	public List<Pokemon> getPokemones() {
		return pokemones;
	}

	public void setPokemones(List<Pokemon> pokemones) {
		this.pokemones = pokemones;
	}

	@Override
	public String toString() {
		return "EntrenadorPokemon [nombre=" + nombre + ", pueblo=" + pueblo + ", mascotaPrincipal=" + mascotaPrincipal
				+ "]";
	}

}
