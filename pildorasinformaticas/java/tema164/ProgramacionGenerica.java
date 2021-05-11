package tema164;

import java.io.File;
import java.util.ArrayList;

public class ProgramacionGenerica {

	public static void main(String[] args) {
		
		ArrayList archivos=new ArrayList(5); // Inicialmente era valor 4 elementos. Despues aumentaremos a 5, y eso no causara error alguna, pero si generara un retraso en la compilacion y un consumo de memoria explicado en el tema anterior, ya
											// que realizaria una duplicacion del Array y un aumento automatico de los elementos para que quepa.
		
		archivos.add("Juan");
		
		archivos.add("Maria");
		
		archivos.add("Ana");
		
		archivos.add("Sandra");
		
		archivos.add(new File("gestion_pedidos.accdb")); // 
		
		String nombrePersona=(String)archivos.get(4); //Tenemos que hacer un casting cada vez que queremos usar un Object. El problema surge si almacenamos un objeto File y tratamos de recuperarlo con un casteo String, el programa no da error, en la ejecucion, hasta que pidamos el valor 
														// en ese caso nos dara un error de ClassCastException, al trata de recuperar la posicion 4 , pues aunque usamos un Array Generico este no puede cambiar su condicion para cada elemento.


		
		//File nombrePersona=(File)archivos.get(0);
		
		System.out.println(nombrePersona); //Nos imprimira Ana que es la 3º
		
	}

}
