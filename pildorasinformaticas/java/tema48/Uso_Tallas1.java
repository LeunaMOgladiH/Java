package tema48;

import java.util.Scanner;

public class Uso_Tallas1 {
		
	enum Talla1{
		
		MINI("S"),MEDIANA("M"),GRANDE("L"),MUYGRANDE("XL");
			
		private Talla1(String abrev) { //LOS CONSTRUCTORES SIEMPRE SERAN PRIVATE PARA QUE NO PUEDAN SER INVOCADOS DESDE FUERA DE LA CLASE
				
			this.abreviatura=abrev;
		}
		
		public String dameAbreviatura() {
			
			return abreviatura;
		}
			
		private String abreviatura;
	}
		

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe tu talla: MINI, MEDIANA, GRANDE, MUYGRANDE ");
		
		String entrada_datos=entrada.next().toUpperCase(); // pasamos a mayusculas lo introducido en consola

		Talla1 la_talla=Enum.valueOf(Talla1.class, entrada_datos); //Metodo valueOf que nos devuelve la constante ENUM respecto al dato introducido en Scanner
		
		System.out.println("Talla= "+la_talla);
		
		System.out.println("Abreviatura= "+la_talla.dameAbreviatura());
	}

}
