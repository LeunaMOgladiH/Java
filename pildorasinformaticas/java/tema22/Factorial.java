package tema22;

import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {

		long resultado=1L;
		
		int numero;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para calcular el Factorial"));
		
		for(int i=numero;i>0;i--) {
			
			resultado=resultado*i;
			
		}
		
		System.out.println("El factorial del valor "+numero+ " es "+resultado);
	}

}

