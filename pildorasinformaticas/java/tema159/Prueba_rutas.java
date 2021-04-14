package tema159;

import java.io.*;

public class Prueba_rutas {

	public static void main(String[] args) {

		File archivo=new File("bin");
		
		System.out.println(archivo.getAbsolutePath()); //Ruta absoluta
		
		System.out.println(archivo.exists()); //Si existe el archivo da un boolean

	}

}
