package tema68;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventosVentana {

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
	
	MVentana oyenteVentana=new MVentana();
	
	addWindowListener(oyenteVentana);
	
	}
	
}

//Creamos una clase Oyente que imprementa WindowListener, y por tanto tenemos que implementar todos los metodos e WindowListener. En el tema 69 veremos
//que para no escribir todos los eventos podemos implementar a WindowAdapter,  y asi podemos seleccionar los eventos que deseamos

class MVentana implements WindowListener{
	
	public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana Activada");
		
	}
	
	public void windowClosed(WindowEvent e) {
		
	}
	
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrando Ventana");
		
	}
	
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Ventana Desactivada");
		
	}
	
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana Restaurada");
		
	}
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana Minimizada");
		
	}
	
	public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana Abierta");
		
	}

}