package tema159;

import java.io.File;

public class Acceso_Ficheros {

	public static void main(String[] args) {

		//File ruta = new File("C:/Users/mhida/git/Java/pildorasinformaticas"); // De este modo solo confirmamos que servira en Windows, no en LinuXy Mac
		
		File ruta = new File("C:"+File.separator+"Users"+File.separator+"mhida"+File.separator+"git"+File.separator+"Java"+File.separator+"pildorasinformaticas");// Podemos crear unas rutas universales que sirvan para todas la plataformas para ello hay que usar SEPARATOR

		System.out.println(ruta.getAbsolutePath());

		String[] nombres_archivos = ruta.list(); // Hemos hecho un Array de todos los archivos de la ruta

		for (int i = 0; i < nombres_archivos.length; i++) {

			System.out.println(nombres_archivos[i]); // imprime con el FOR cada uno de los archivos guardados en el Array
			
			File f=new File(ruta.getAbsolutePath(),nombres_archivos[i]); //Vamos a indicar que en el caso que encuentre una carpeta entre y nos diga los archivos dentro
			
			if(f.isDirectory()) {
				
				String[] archivos_subcarpeta=f.list(); //Guardamos los archivos dentro de las subcarpetas, pero solo una primera ramificacion
				
				for(int j=0;j<archivos_subcarpeta.length;j++) {
					
					System.out.println(archivos_subcarpeta[j]);
				}
			}
			
		}

	}

}
