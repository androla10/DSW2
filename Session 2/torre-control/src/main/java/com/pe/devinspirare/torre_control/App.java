package com.pe.devinspirare.torre_control;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.pe.devinspirare.model.SecretMessageDTO;


/**
 * Hello world!
 *
 */
public class App {
	public static final int PUERTO = 5555;
	private static ServerSocket servidor = null;

	public static void main(String[] args) {
		try {
			new App().levantarServidor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void levantarServidor() throws IOException, ClassNotFoundException {
		servidor = new ServerSocket(5555);
		while (true) {
			System.out.println("SERVIDOR DE MENSAJE ACTIVADO");

			Socket socket = servidor.accept();

			System.out.println("SERVIDOR DETECTO UN MENSAJE");

			// Definimos el flujo de Entrada
			ObjectInputStream flujoEntrada = new ObjectInputStream(socket.getInputStream());


			SecretMessageDTO secretMessageDTO = (SecretMessageDTO) flujoEntrada.readObject();
			
			System.out.println(String.format("Mensaje : %s", secretMessageDTO.getMessage()));
			
			//Definimos el flujo de salida para dar la respuesta al cliente
			ObjectOutputStream flujoSalida = new ObjectOutputStream(socket.getOutputStream());
			
			//Definimos un objeto de salida
			SecretMessageDTO dto = new SecretMessageDTO();
			dto.setMessage("ATACAR !!!!!");
			
			flujoSalida.writeObject(dto);
			
			System.out.println(String.format("Enviando Orden : %s", dto.getMessage()));

			// Cierro el canal de comunicación
			socket.close();
		}
	}
}
