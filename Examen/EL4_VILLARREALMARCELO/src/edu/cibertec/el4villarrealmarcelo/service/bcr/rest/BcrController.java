package edu.cibertec.el4villarrealmarcelo.service.bcr.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bcr")
public class BcrController {

	@GET
	@Path("/tipoCambio/{Codigo_moneda}")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public String saludo(@PathParam("Codigo_moneda") String codigoMoneda) {
		// Código: USD Nombre: Dólar Americano Valor en Soles: S/.3.25
		// Código: EUR Nombre: Euro Valor en Soles: S/.3.83
		// Código: GBP Nombre: Libra esterlina Valor en Soles: S/.4.28
		
		if (codigoMoneda.equalsIgnoreCase("USD"))
			return "3.25";
		else if (codigoMoneda.equalsIgnoreCase("EUR"))
			return "3.83";
		else if (codigoMoneda.equalsIgnoreCase("GBP"))
			return "4.28";
		else
			return "No existe valor para el codigo de moneda especificado.";
	}
}
