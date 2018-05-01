package com.devinspirare.commons;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.devinspirare.commons.interfaces.OperacionesArchivos;

public class GestoTextoPlano implements OperacionesArchivos {

	public void escribir(String ruta, Object contenido) throws Exception {
		// 1. Se crea la referencia al archivo que se va a crear
		File refArchivo = new File(ruta);

		// 2. Como este gestor se dedica exclusivamente a texto plano, validamos
		// si es una cadena
		if (!(contenido instanceof String)) {
			throw new Exception("El contenido que se va a escribir debe ser texto plano (cadena)");
		}

		// 3. Usar un try-with-resources para definir un componente que permite
		// escribir un archivo de texto
		try (BufferedWriter escritorArchivo = new BufferedWriter(new FileWriter(refArchivo))) {
			escritorArchivo.write((String) contenido);
		} catch (Exception e) {
			throw e;
		}
	}

	public Object leerArchivo(String ruta, Object... params) throws Exception {
		// 1. Crear un componente que permite guardar contenido de texto
		// (cadenas) de forma ordenada
		StringBuilder contenidoLeido = new StringBuilder();

		// 2. Crear la referencia al archivo usando NIO
		Path refArchivo = Paths.get(ruta);

		// 3. Verificar si el archivo existe, si no existe se lanza una
		// excepción.
		if (!refArchivo.toFile().exists()) {
			throw new Exception("El archivo no existe para la ruta especificada.");
		}

		try {
			// 4. Utilizar los mecanismos de lectura de archivos de texto de NIO
			List<String> lineasLeidas = Files.readAllLines(refArchivo);
			// 5. Si hay contenido en el archivo, copiamos las líneas en el
			// componente separando apropiadamente
			if (lineasLeidas != null && !lineasLeidas.isEmpty()) {
				lineasLeidas.forEach(linea -> contenidoLeido.append(linea).append(System.lineSeparator()));
			}

		} catch (Exception e) {
			throw e;
		}

		// 5. Se retorna el contenido
		return contenidoLeido.toString();
	}

}
