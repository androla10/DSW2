package edu.cibertec.el4villarrealmarcelo.service.fifa.utilitarios;

import java.util.Arrays;
import java.util.List;

import edu.cibertec.el4villarrealmarcelo.service.fifa.dto.PaisDTO;

public class UtilFifa {

	public static List<PaisDTO> GetPaisesMundialistas() {
		PaisDTO peru = new PaisDTO();
		peru.setGrupo("C");
		peru.setNombre("Perú");

		PaisDTO dinamarca = new PaisDTO();
		dinamarca.setGrupo("C");
		dinamarca.setNombre("Dinamarca");

		PaisDTO francia = new PaisDTO();
		francia.setGrupo("C");
		francia.setNombre("Francia");

		PaisDTO australia = new PaisDTO();
		australia.setGrupo("C");
		australia.setNombre("Australia");

		PaisDTO argentina = new PaisDTO();
		argentina.setGrupo("D");
		argentina.setNombre("Argentina");

		PaisDTO brasil = new PaisDTO();
		brasil.setGrupo("G");
		brasil.setNombre("brasil");

		PaisDTO alemania = new PaisDTO();
		alemania.setGrupo("D");
		alemania.setNombre("Alemania");

		return Arrays.asList(alemania, brasil, dinamarca, peru, argentina, francia, australia);
	}
}
