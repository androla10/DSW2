package com.devinspirare.commons.interfaces;

public interface OperacionesArchivos {
	void escribir(String ruta, Object params) throws Exception;
	
	Object leerArchivo(String ruta, Object... params) throws Exception;
}
