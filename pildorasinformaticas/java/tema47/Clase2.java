package tema47;

import tema46.Clase3;

public class Clase2 {
	
	private void mian() {
		// TODO Auto-generated method stub
		
		Clase1 miobj=new Clase1(); //En este caso al no haberse creado un constructor Clase1(){}, si se crea por defecto y podemos llamarlo, porque estamos dentro del mismo paquete tema47.
		
		miobj.mivar3;//podemos llamar a mivar1, mivar2 porque son variables publicas, si colocamos el identifciador "private" no podremos llamarle desde otra clase
		
		Clase3 miobj2=new Clase3();
		
		miobj2.mivar2 //Siempre heredamos de la clase Object pues es la clase mas alta de la cadena

	}
	
}
