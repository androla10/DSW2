package edu.cibertec.el4villarrealmarcelo.service.cabify.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import edu.cibertec.el4villarrealmarcelo.service.cabify.dto.EnvioMercanciaDTO;

@Path("/Cabify")
public class CabifyController {

	@POST
	@Path("/ObtenerCosto")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public String admisionRetornaString(EnvioMercanciaDTO envioMercanciaDTO) {
		String resultado = "";
		if (envioMercanciaDTO.getPeso_mercancia_kg() >= 15.0) {
			resultado = "El costo por el delivery es S/. [15] y se transporta en [Auto].";
		} else
			resultado = "El costo por el delivery es S/. [10] y se transporta en [Moto].";

		return resultado;
	}
}
