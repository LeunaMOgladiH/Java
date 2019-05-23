package tema24;

import javax.swing.JOptionPane;

public class Array_II {

	public static void main(String[] args) {
	
		//Primer modo de crear una matriz
		
		/*String [] paises=new String[8];
		
		paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Peru";
		paises[3]="Chile";
		paises[4]="Argentina";
		paises[5]="Ecuador";
		paises[6]="Venezuela";
		paises[7]="Colombia";*/
		
		//Segundo modo de crear una matriz
		
	//	String[] paises= {"España","Mexico","Peru","Chile","Argentina","Ecuador","Venezuela","Colombia"};
		
		String[] paises=new String[8];
		
		
	//Se trata del bucle normal	
		
	/*	for(int i=0;i<paises.length;i++) {
			
			System.out.println("Pais "+(i+1)+" "+paises[i]);
		}*/
	
	//Se trata del bucle mejorado
		
		for(int i=0;i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce el nombre de un pais "+(i+1));
		}
		
		for(String i:paises) {
			
			System.out.println(i);
		}
		
	}

}
