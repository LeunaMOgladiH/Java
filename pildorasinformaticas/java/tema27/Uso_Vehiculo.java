package tema27;

import javax.swing.JOptionPane;

import tema40.Furgoneta;

public class Uso_Vehiculo {

	public static void main(String[] args) {

		/*
		 * Coche Renault=new Coche();
		 * 
		 * Renault.establece_color(JOptionPane.showInputDialog("Introduce el color: "));
		 * 
		 * Renault.config_climatiza(JOptionPane.
		 * showInputDialog("Desea Climatizador, Si o No: "));
		 * 
		 * Renault.config_asientos(JOptionPane.
		 * showInputDialog("Desea asiento de cuero, Si o No: "));
		 * 
		 * System.out.println(Renault.dame_datos());
		 * 
		 * System.out.println(Renault.dame_color());
		 * 
		 * System.out.println(Renault.dame_climatiza());
		 * 
		 * System.out.println(Renault.dame_asiento());
		 * 
		 * System.out.println(Renault.dame_peso());
		 * 
		 * System.out.println("El precio total del coche es "+Renault.dame_precio()+" €"
		 * );
		 */ // Pertenece al tema 27

		Vehiculo micoche1 = new Vehiculo();
		
		micoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7, 580);
		
		mifurgoneta1.establece_color("Naranja");
		
		mifurgoneta1.config_asientos("si");
		
		mifurgoneta1.config_climatiza("si");
		
		System.out.println(micoche1.dame_datos()+" "+micoche1.dame_color());
		
		System.out.println(mifurgoneta1.dame_datos()+" "+mifurgoneta1.dimeDatosFurgoneta());
		
		
	}

}
