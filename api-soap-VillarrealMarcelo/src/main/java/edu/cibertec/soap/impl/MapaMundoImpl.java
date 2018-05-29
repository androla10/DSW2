package edu.cibertec.soap.impl;

import java.util.List;

import javax.jws.WebService;

import edu.cibertec.model.Continente;
import edu.cibertec.model.Pais;
import edu.cibertec.soap.MapaMundo;
import edu.cibertec.utilidades.Utils;

@WebService(endpointInterface = "edu.cibertec.soap.MapaMundo", serviceName = "mapaMundoAPI")
public class MapaMundoImpl implements MapaMundo {

	// Cargamos todos los datos de la instancia
	Utils utils = Utils.newInstance();

	@Override
	public String obtenerCantidadPaises(String continente) {
		Continente continenteEncontrado = utils.buscarContinente(continente);
		if (continenteEncontrado == null) {
			return "CONTINENTE NO EXISTE EN NUESTRA BASE DE DATOS LOCAL";
		}
		return continenteEncontrado.obtenerMensajeCantidadPaises();
	}

	@Override
	public List<Pais> obtenerListaPaises(String continente) {
		return utils.obtenerListadoPaisesXContinente(continente);
	}

}
