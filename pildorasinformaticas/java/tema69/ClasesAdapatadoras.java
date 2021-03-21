package tema69;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;


public class ClasesAdapatadoras {

	public static void main(String[] args) {

			MarcoVentana mimarco=new MarcoVentana();
			
			mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			MarcoVentana mimarco2=new MarcoVentana();
			
			mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			mimarco.setTitle("Ventana1");

			mimarco2.setTitle("Ventana2");
			
			mimarco.setBounds(2450,300,500,350);
			
			mimarco2.setBounds(2950, 300, 500, 350);
		}

	}

	//Indicamos al Marco que este listo para llamar a la clase Oyente

	class MarcoVentana extends JFrame {
		
		public MarcoVentana() {
		
		//setTitle("Respondiendo");
		
		//setBounds(2700,300,500,350);
		
		setVisible(true);
		
		//MVentana oyenteVentana=new MVentana();
		
		//addWindowListener(oyenteVentana);
		
		//Creamos una nueva instancia para el Tema 69 para poner el Marco en escucha e instanciarla directamente (simplificamos dos lineas en una)
		
		addWindowListener(new MVentana());
		
		}
		
	}

	//Para no escribir todos los eventos podemos implementar a WindowAdapter,  y asi podemos seleccionar los eventos que deseamos

	class MVentana extends WindowAdapter{
		
		public void windowIconified(WindowEvent e) {
			
			System.out.println("Ventana Minimizada");
			
		}


	}