package pe.edu.cibertec.cliente.bcr;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class BcrApp {

	public static void main(String[] args) {

		try {
			double sumaTotal = 0.0;

			String codigoMoneda = "EUR";

			String servicio = "http://localhost:8080/EL4_VILLARREALMARCELO/bcr/tipoCambio/" + codigoMoneda;

			Client client = ClientBuilder.newClient();

			String valorEur = client.target(servicio).request(MediaType.APPLICATION_JSON).get(String.class);

			codigoMoneda = "GBP";
			servicio = "http://localhost:8080/EL4_VILLARREALMARCELO/bcr/tipoCambio/" + codigoMoneda;
			String valorGBP = client.target(servicio).request(MediaType.APPLICATION_JSON).get(String.class);

			codigoMoneda = "USD";
			servicio = "http://localhost:8080/EL4_VILLARREALMARCELO/bcr/tipoCambio/" + codigoMoneda;
			String valorUSD = client.target(servicio).request(MediaType.APPLICATION_JSON).get(String.class);
			double valorParseUSD = Double.parseDouble(valorUSD);
			double valorParseEUR = Double.parseDouble(valorEur);
			double valorParseGBP = Double.parseDouble(valorGBP);
			sumaTotal = (25 * valorParseUSD) + (33 * valorParseEUR) + (12 * valorParseGBP);
			System.out.println("El resultado es : " + sumaTotal);
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error al parse el valor del tipo de cambio");
		}
	}
}
