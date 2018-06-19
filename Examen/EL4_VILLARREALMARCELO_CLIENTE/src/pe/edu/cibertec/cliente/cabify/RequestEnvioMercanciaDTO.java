package pe.edu.cibertec.cliente.cabify;

public class RequestEnvioMercanciaDTO {
	private String origen;
	private String destino;
	private String mercancia;
	private double peso_mercancia_kg;

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getMercancia() {
		return mercancia;
	}

	public void setMercancia(String mercancia) {
		this.mercancia = mercancia;
	}

	public double getPeso_mercancia_kg() {
		return peso_mercancia_kg;
	}

	public void setPeso_mercancia_kg(double peso_mercancia_kg) {
		this.peso_mercancia_kg = peso_mercancia_kg;
	}

}
