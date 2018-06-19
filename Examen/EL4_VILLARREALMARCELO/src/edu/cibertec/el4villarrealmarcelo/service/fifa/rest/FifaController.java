package edu.cibertec.el4villarrealmarcelo.service.fifa.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.el4villarrealmarcelo.service.fifa.dto.FifaResponseDTO;
import edu.cibertec.el4villarrealmarcelo.service.fifa.utilitarios.UtilFifa;

@Path("/fifa")
public class FifaController {

	@GET
	@Path("/getMundial")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public FifaResponseDTO getMundial() {
		FifaResponseDTO dto = new FifaResponseDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dto.setFechaInicio(sdf.parse("14/06/2018"));
			dto.setFechaFin(sdf.parse("15/07/2018")); 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dto.setLugar("RUSIA");
		dto.setMascota("Zahivaka");
		dto.setListaPaises(UtilFifa.GetPaisesMundialistas());
		return dto;
	}
}
