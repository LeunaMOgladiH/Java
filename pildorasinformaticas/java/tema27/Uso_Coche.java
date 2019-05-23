package tema27;

import javax.swing.JOptionPane;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche Renault=new Coche();
		
		Renault.establece_color(JOptionPane.showInputDialog("Introduce el color: "));
		
		Renault.config_climatiza(JOptionPane.showInputDialog("Desea Climatizador, Si o No: "));
		
		Renault.config_asientos(JOptionPane.showInputDialog("Desea asiento de cuero, Si o No: "));
		
		System.out.println(Renault.dame_datos());
		
		System.out.println(Renault.dame_color());
		
		System.out.println(Renault.dame_climatiza());
		
		System.out.println(Renault.dame_asiento());
		
		System.out.println(Renault.dame_peso());
		
		System.out.println("El precio total del coche es "+Renault.dame_precio()+" €");

	}

}
