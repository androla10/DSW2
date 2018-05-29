package MapaMundoPublicador;

import javax.xml.ws.Endpoint;

import edu.cibertec.soap.impl.MapaMundoImpl;

public class ClaseLevantador {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/mapa", new MapaMundoImpl());
	}
}
