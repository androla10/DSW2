package com.pe.devinspirare.soldadoA;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import com.pe.devinspirare.model.SecretMessageDTO;

/**
 * Hello world!
 *
 */
public class App {
	public static final int PUERTO = 5555;

	public static void main(String[] args) {
		try {
			System.out.println("CLIENTE :::::: Iniciando.............");

			// Establecer la comunicación con el Socket Servidor

			Socket socket = new Socket("localhost", PUERTO);

			System.out.println("CLIENTE :::::: CONEXION EXITOSA");

			// Establecemos un flujo de salida

			ObjectOutputStream flujoSalida = new ObjectOutputStream(socket.getOutputStream());
			System.out.println("CLIENTE :::::: PREPARANDO EL ENVIO DEL MENSAJE");

			SecretMessageDTO obj = new SecretMessageDTO();
			obj.setCoordinates("154 , 144");
			obj.setId("1");
			obj.setMessage("Solicito autorización para disparar");

			flujoSalida.writeObject(obj);

			System.out.println("CLIENTE :::::: ENVIADO AL SERVIDOR");

			ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
			System.out.println("CLIENTE :::::: OBTENIENDO RESPUESTA DEL SERVIDOR");

			SecretMessageDTO dtoEntrada = (SecretMessageDTO) inputStream.readObject();
			System.out.println(String.format("Mensaje : %s", dtoEntrada.getMessage()));

			System.out.println("TERMINA CLIENTE");
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
