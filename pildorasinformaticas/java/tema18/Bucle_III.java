package tema18;

import javax.swing.JOptionPane;

public class Bucle_III {

	public static void main(String[] args) {

		String genero = "";

		do {
			genero = JOptionPane.showInputDialog("Puede indicarme su genero, H o M ");

		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false); //ambas condiciones a la vez

		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm")); //tenemos que tratarlo pasarlo a INT pues JoptionPane trabaja con String
		
		int pesoideal=0;
				
				if(genero.equalsIgnoreCase("H")) {
					pesoideal=altura-110;
					
				}else if (genero.equalsIgnoreCase("M")) {
					pesoideal=altura-120;
				}
				
				System.out.println("Tu peso ideal es "+pesoideal+ " Kg");
		
	}
}