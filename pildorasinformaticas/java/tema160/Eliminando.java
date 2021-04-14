package tema160;

import java.io.File;

public class Eliminando {

	public static void main(String[] args) {

		File ruta = new File("C:"+File.separator+"Users"+File.separator+"mhida"+File.separator+"git"+File.separator+"Java"+File.separator+"pildorasinformaticas"+File.separator+"java"+File.separator+"tema160"+File.separator+"prueba"+File.separator+"prueba_texto.txt");// Podemos crear unas rutas universales que sirvan para todas la plataformas para ello hay que usar SEPARATOR

		ruta.delete(); //Borramos ficheros de una ruta determinada

	}

}
