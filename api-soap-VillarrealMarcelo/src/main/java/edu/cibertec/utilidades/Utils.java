package edu.cibertec.utilidades;

import java.util.ArrayList;
import java.util.List;

import edu.cibertec.model.Continente;
import edu.cibertec.model.Pais;

public class Utils {

	private List<Continente> listadoContinentes;

	private static Utils utils;

	public static Utils newInstance() {
		if (utils == null)
			utils = new Utils();
		return utils;
	}

	private Utils() {
		cargarData();
	}

	private void cargarData() {
		System.out.println("Cargando continentes..............");
		listadoContinentes = new ArrayList<>();

		// Creando paises
		Pais peru = new Pais("Peru", "Lima", "Español");
		Pais chile = new Pais("Chile", "Santiago", "Español");
		Pais venezuela = new Pais("Venezuela", "Caracas", "Español");

		List<Pais> listadoPaisesAmerica = new ArrayList<>();
		listadoPaisesAmerica.add(peru);
		listadoPaisesAmerica.add(chile);
		listadoPaisesAmerica.add(venezuela);

		// Agregando continente america
		Continente continenteAmerica = new Continente("America Latina", listadoPaisesAmerica);

		// Creando paises
		Pais mexico = new Pais("Mexico", "Mexi", "Español");
		Pais eeuu = new Pais("Eeuu", "New York", "Ingles");
		Pais canada = new Pais("Canada", "Canada1", "Ingles");

		List<Pais> listadoPaisesNorteAmerica = new ArrayList<>();
		listadoPaisesNorteAmerica.add(mexico);
		listadoPaisesNorteAmerica.add(eeuu);
		listadoPaisesNorteAmerica.add(canada);

		// Agregando continente america
		Continente continenteNorteAmerica = new Continente("Norte America", listadoPaisesNorteAmerica);

		listadoContinentes.add(continenteAmerica);
		listadoContinentes.add(continenteNorteAmerica);
	}

	public Continente buscarContinente(String continente) {
		Continente continenteEncontrado = null;
		for (Continente contienenteEnLista : listadoContinentes) {
			if (contienenteEnLista.getNombre().equals(continente))
				continenteEncontrado = contienenteEnLista;
		}

		return continenteEncontrado;
	}

	public List<Pais> obtenerListadoPaisesXContinente(String continente) {
		Continente continenteEncontrado = null;
		for (Continente contienenteEnLista : listadoContinentes) {
			if (contienenteEnLista.getNombre().equals(continente))
				continenteEncontrado = contienenteEnLista;
		}
		if (continenteEncontrado == null)
			return null;
		else
			return continenteEncontrado.getLstPaises();
	}

}
