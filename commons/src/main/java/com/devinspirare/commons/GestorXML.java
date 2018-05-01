package com.devinspirare.commons;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.devinspirare.commons.interfaces.OperacionesArchivos;

public class GestorXML implements OperacionesArchivos {

	public void escribir(String ruta, Object contenido) throws Exception {
		// 1. Validar el contenido
		if (contenido == null) {
			throw new Exception("No hay contenido para guardar.");
		}
		// 2. Iniciar el contexto JAXB
		JAXBContext contextoXml = JAXBContext.newInstance(contenido.getClass());
		// 3. Crear el convertidor de objetos a XML
		Marshaller escritorXml = contextoXml.createMarshaller();
		// 4. Crear el archivo XML basado en el objeto de forma directa
		escritorXml.marshal(contenido, new File(ruta));

	}

	public Object leerArchivo(String ruta, Object... params) throws Exception {

		// 1. Iniciar el contexto JAXB y el valor de retorno
		JAXBContext contextoXml = null;
		Object objetoLeido = null;
		// 2. Validar la existencia del archivo que se quiere leer
		File refArchivo = new File(ruta);
		if (!refArchivo.exists()) {
			throw new Exception("El archivo no existe para la ruta especificada.");
		}
		// 3. Validar si hay parámetros de entrada para ver qué clases soporta
		// el contexto JAXB
		if (params == null || params.length == 0) {
			throw new Exception("Se requiere indicar los tipos de objetos soportados para este proceso.");
		}
		// 4. Obtener parámetros para la lectura (el primer parámetro)
		Object param = params[0];

		// 5. Validar el parámetro
		if (param == null) {
			throw new Exception("El parámetro enviado para la lectura es null.");
		} else {
			// 6. Crear el contexto para la clase soportada
			contextoXml = JAXBContext.newInstance(param.getClass());
			// 7. Crear un convertidor de data de archivo XML a objeto
			Unmarshaller lectorXml = contextoXml.createUnmarshaller();
			// 8. Leer el contenido hacia un objeto.
			objetoLeido = lectorXml.unmarshal(refArchivo);
		}
		// 9. Se retorna el objeto
		return objetoLeido;
	}

}
