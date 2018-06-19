package pe.edu.cibertec.cliente.cabify;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

public class CabifyApp {

	public static void main(String[] args) {

		String servicio = "http://localhost:8080/EL4_VILLARREALMARCELO/Cabify/ObtenerCosto";
		Client client = ClientBuilder.newClient();

		RequestEnvioMercanciaDTO dto = new RequestEnvioMercanciaDTO();
		dto.setDestino("San Miguel");
		dto.setOrigen("Miraflores");
		dto.setMercancia("1 Pavo");
		dto.setPeso_mercancia_kg(15.50);

		String response = client.target(servicio).request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(dto, MediaType.APPLICATION_JSON), String.class);

		System.out.println("Resultado de la consulta " + response);
	}
}
