package com.devinspirare.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class UtilArchivo {

	private static UtilArchivo utilArchivo;

	private UtilArchivo() {
	}

	public static UtilArchivo newInstance() {
		if (utilArchivo == null)
			utilArchivo = new UtilArchivo();

		return utilArchivo;
	}

	public boolean createdFile(String url) {
		File file = new File(url);
		if (!file.exists()) {
			return file.mkdir();
		}
		return false;
	}
	
	public boolean existsFile(String url){
		return new File(url).exists();
	}
	
	/**
	 * Método utilitario que permite copiar el contenido de un archivo a otra ubicación.
	 * @param rutaCompletaOrigen La ruta completa del archivo que se va a crear (nombre del nuevo archivo)
	 * @throws Exception Excepción que ocurre dentro del proceso de copia.
	 */
	public void copiarArchivo(String rutaCompletaOrigen, String rutaCompletaDestino) throws Exception {
		//1. Crear referencia al archivo de origen
		File refArchivoOrigen = new File(rutaCompletaOrigen);
		//2. Verificar si el archivo de origen existe.
		if (!refArchivoOrigen.exists()) {
			//3. Si no existe, se lanza una excepción
			throw new Exception("No se encuentra el archivo de origen en la ruta especificada.");
		}
		//4. Crear una referencia para el archivo que se va a crear
		File refArchivoDestino = new File(rutaCompletaDestino);
		//5. Crear un try-con-recursos para gestionar el proceso de copia
		try (FileInputStream fis = new FileInputStream(refArchivoOrigen);
				FileOutputStream fos = new FileOutputStream(refArchivoDestino);) {
			//6. Definir las variables necesarias para el proceso de copia
			//6a. Un bloque para guardar una secuencia de bytes
			byte[] bloque = new byte[1024];
			//6b. Variable que guarda la cantidad de bloque de bytes copiado
			int leido = 0;
			//7. Iniciar el proceso de copia
			while ((leido = fis.read(bloque, 0, bloque.length)) != -1) {
				fos.write(bloque, 0, leido);
			}
		}
	}
	
	/**
	 * Permite comprimir el contenido de una carpeta, siempre y cuando los archivos sean sueltos (no contenga otras carpetas - no recursivo)
	 * @param rutaCarpeta La ruta de la carpeta que contiene los archivos.
	 * @param rutaArchivoZip Es la ruta del archivo zip que se va a generar.
	 * @throws Exception Excepción que ocurre dentro del proceso de compresión.
	 */
	public void comprimirContenidoDeCarpeta(String rutaCarpeta, String rutaArchivoZip) throws Exception {
		File refCarpeta = new File(rutaCarpeta);
		if (!refCarpeta.exists() || !refCarpeta.isDirectory()) {
			throw new Exception("La ruta de la carpeta especificada no es válida.");
		}
		try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(rutaArchivoZip)))) {
			File[] archivosEnCarpeta = refCarpeta.listFiles();
			Arrays.asList(archivosEnCarpeta).forEach(archivo -> {
				if (!archivo.isDirectory()) {
					String nombreArchivo = archivo.getName();
					ZipEntry zipEntry = new ZipEntry(nombreArchivo);
					byte[] bloque = new byte[1024];
					int leido = 0;
					try (FileInputStream fis = new FileInputStream(refCarpeta);){
						zos.putNextEntry(zipEntry);
						while ((leido = fis.read(bloque, 0, bloque.length)) != -1) {
							zos.write(bloque, 0, leido);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
		
}
