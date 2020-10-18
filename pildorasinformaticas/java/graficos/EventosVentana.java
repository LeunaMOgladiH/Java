package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventosVentana {

	public static void main(String[] args) {

		MarcoVentana mimarco=new MarcoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setTitle("Ventana1");
		
		mimarco.setBounds(300, 300, 500, 350);
		
		MarcoVentana mimarco2=new MarcoVentana();
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco2.setTitle("Ventana2");	
		
		mimarco2.setBounds(900, 300, 500, 350);
	}
}	
	
class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		//setTitle("Respondiendo");
		
		//setBounds(300, 300, 500, 350);
		
		setVisible(true);
		
		mVentana oyenteventana=new mVentana();
		
		addWindowListener(oyenteventana);
	}
}


class mVentana implements WindowListener{
	
	public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana Activada");
		
	}
	
	public void windowClosed(WindowEvent e) {
		
		System.out.println("La Ventana2 ha sido cerrada");
		
	}
	
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Ventana Cerrada");
		
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