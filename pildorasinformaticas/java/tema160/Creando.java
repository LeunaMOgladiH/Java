package tema160;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {

		File ruta = new File("C:"+File.separator+"Users"+File.separator+"mhida"+File.separator+"git"+File.separator+"Java"+File.separator+"pildorasinformaticas"+File.separator+"java"+File.separator+"tema160"+File.separator+"prueba"+File.separator+"prueba_texto.txt");// Podemos crear unas rutas universales que sirvan para todas la plataformas para ello hay que usar SEPARATOR

		//ruta.mkdir(); //Vamos a crear un directorio
		
		String archivo_destino=ruta.getAbsolutePath(); //Almacenamos en la variable la ruta con la que trabajaremos
		
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Creara un archivo solo si no existe, y crea una excepcion IO
		
		Escribiendo accede_es=new Escribiendo();
		
		accede_es.escribir(archivo_destino); // archivo_destino es la ruta donde grabaremos
		
	}

}

class Escribiendo{
	
	public void escribir(String ruta_archivo) {
		
		String frase="Esto es un ejemplo. Aprendiendo";
		
		try {
			
			FileWriter escritura=new FileWriter(ruta_archivo); // Tenemos que crear siempre un try/catch a la hora de las escrituras
			
			for(int i=0;i<frase.length();i++) {
				
				escritura.write(frase.charAt(i)); //Escribe caracter a caracter lo que hay en escritura
			}
			
			escritura.close(); //Tenemos que cerrar siempre el String sino no grabaria el texto
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
