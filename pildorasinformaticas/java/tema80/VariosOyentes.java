package tema80;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VariosOyentes {

	public static void main(String[] args) {

		 MarcoPrincipal mimarco=new MarcoPrincipal();
		 
		 mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 mimarco.setVisible(true);

	}
	
}	
	
	class MarcoPrincipal extends JFrame{
		
		 public MarcoPrincipal() {
			 
			 setTitle("Varios Oyentes");
			 
			 setBounds(2700, 300, 300, 300);
			 
			 LaminaPrincipal lamina=new LaminaPrincipal();
			 
			 add(lamina);
			 
		 }
		
	}
	
	class LaminaPrincipal extends JPanel{
		
		public LaminaPrincipal() {
			
			JButton botonuevo=new JButton("Nuevo");
			
			add(botonuevo);
			
			botoncerrar=new JButton("Cerrar Todo");
			
			add(botoncerrar);
			
			OyenteNuevo miOyente=new OyenteNuevo();
			
			botonuevo.addActionListener(miOyente);
		}
		
		private class OyenteNuevo implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				
				MarcoEmergente marco=new MarcoEmergente(botoncerrar); //Usamos el metodo
				
				marco.setVisible(true);
				
			}
			
			
		}
		
		JButton botoncerrar; //Creamos fuera del constructor e instanciamos dentro pues lo usaremos en otros metodos, por ello lo tenemos que tener fuera
	}
	
	class MarcoEmergente extends JFrame{
		
		public MarcoEmergente(JButton bontondeprincipal) { //voy a usar botoncerrar para llamar a la clase que esta fuera de la clase marcoemergente
			
			contador ++;
			
			setTitle("Ventana"+contador); //Ira contando cada unade las ventanas que varamos creando, para ello sera una variable estatica para que puedar ser compartida por todas las instancias que tendran las misma caracteristicas
			
			setBounds(1800+40*contador,40*contador,300,150); //Vamos a ir abriendo ventanas en distinta posicion, para que se vean que se estan creando
			
			CierraTodos OyenteCerrar=new CierraTodos();
			
			bontondeprincipal.addActionListener(OyenteCerrar);
			
		}
		
	private class CierraTodos implements ActionListener{ //tenemos que referenciar al boton CIERRA TODO desde esta otra clase, 
														 //tenemos que hacer una referencia desde el marcoemergente.

		public void actionPerformed(ActionEvent e) {

			dispose();
				
		}
			
			
		}
		
		private static int contador=0;
	}
	

