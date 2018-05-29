package edu.cibertec.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import edu.cibertec.model.Pais;

@WebService
public interface MapaMundo {

	@WebMethod
	public String obtenerCantidadPaises(String continente);

	@WebMethod
	public List<Pais> obtenerListaPaises(String continente);
}
