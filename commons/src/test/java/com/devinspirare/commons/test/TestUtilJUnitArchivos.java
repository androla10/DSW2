package com.devinspirare.commons.test;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.devinspirare.commons.GestoTextoPlano;
import com.devinspirare.commons.GestorXML;
import com.devinspirare.commons.UtilArchivo;
import com.devinspirare.commons.interfaces.OperacionesArchivos;
import com.devinspirare.commons.model.EntrenadorPokemon;
import com.devinspirare.commons.model.Pokemon;

public class TestUtilJUnitArchivos {

	private static final String rutaEntrenadorXML = "D:\\grabados\\archivo.xml";
	private String rutaCompletaOrigen = "carpetaInterna/miArchivo.txt";
	private String rutaCompletaDestino = "carpetaDestino/copiaMiArchivo.txt";

	/**
	 * Created File Tarea
	 */

	private String rutaHacker = "D:\\avaEsLoMejor\\hacker";
	private String rutaVirus = "D:\\avaEsLoMejor\\virus";

	@Test
	@Ignore
	public void testCrearEntrenadorPokemonXML() {
		System.out.println("Inicio ::: ");

		EntrenadorPokemon entrenadorPokemon = new EntrenadorPokemon();
		entrenadorPokemon.setNombre("Ash");
		entrenadorPokemon.setPueblo("Paletazo");

		Pokemon pokemon = new Pokemon();
		pokemon.setNombre("Picabru");
		pokemon.setTipo("Electrica");

		entrenadorPokemon.setMascotaPrincipal(pokemon);

		/**
		 * Other pokemons
		 */
		Pokemon pokemon1 = new Pokemon();
		pokemon1.setNombre("Squartus");
		pokemon1.setTipo("Aqua");

		Pokemon pokemon2 = new Pokemon();
		pokemon2.setNombre("Charizar");
		pokemon2.setTipo("Fuego");

		entrenadorPokemon.setPokemones(Arrays.asList(pokemon1, pokemon2));

		OperacionesArchivos operacionesArchivos = new GestorXML();
		try {
			operacionesArchivos.escribir(rutaEntrenadorXML, entrenadorPokemon);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}

		Assert.assertTrue(true);

		System.out.println("Fin ::: ");
	}

	@Test
	@Ignore
	public void testLeerEntrenadorPokemonXML() {
		System.out.println("Inicio ::: ");

		OperacionesArchivos operacionesXML = new GestorXML();

		EntrenadorPokemon entrenador = null;
		try {
			entrenador = (EntrenadorPokemon) operacionesXML.leerArchivo(rutaEntrenadorXML, new EntrenadorPokemon());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}

		System.out.println(entrenador.toString());

		System.out.println("Fin ::: ");
	}

	@Test
	public void testCopiarArchivo() {
		System.out.println("INI Test Copiar Archivo");

		UtilArchivo utilArchivo = UtilArchivo.newInstance();
		try {
			utilArchivo.copiarArchivo(rutaCompletaOrigen, rutaCompletaDestino);
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}

		System.out.println("FIN Test Copiar Archivo");

	}

	@Test
	public void tarea(){
		UtilArchivo utilArchivo = UtilArchivo.newInstance();
		//Creamos la carpeta hacker
		utilArchivo.createdFile(rutaHacker);
		//Creamos la carpeta virus
		utilArchivo.createdFile(rutaVirus);
		
		//Creando el archivo configuracion.txt
		OperacionesArchivos operacionesArchivos = new GestoTextoPlano();
		//Escribimos el xml dentro de la ruta hacker
		String contenido = "<?xml version='1.0' encoding='UTF-8'?><appConfig><carpetaInterna>carpetaTarea</carpetaInterna><data>java,c,python,ruby,php</data></appConfig>";
		try {
			operacionesArchivos.escribir(rutaHacker, contenido);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
