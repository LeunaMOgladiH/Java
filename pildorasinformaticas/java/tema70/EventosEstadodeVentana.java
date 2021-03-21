package tema70;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class EventosEstadodeVentana {

	public static void main(String[] args) {
		
		MarcoEstado mimarco=new MarcoEstado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		
		setVisible(true);
		
		setBounds(2600, 300,500,350);
		
		CambioEstado nuevo_estado=new CambioEstado();
		
		addWindowStateListener(nuevo_estado);
	}
}

//Cuando usamos getNewState, nos indica un valor que tiene un significado en la API segun su estado, 0=normal, 1=minimiza, etc...+
// Los valores a su vez guardan en un variable statica, que debemos aprender como el valor 6 correspondiente a Maximizar la venta es Frame.maximized_both

class CambioEstado implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e) {

		System.out.println("La ventana ha cambiado de estado");
		
		//System.out.println(e.getNewState());
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH){
			
			System.out.println("Pantalla Maximizada");
			
		}else if(e.getNewState()==Frame.NORMAL) {
			
			System.out.println("Pantalla Normal");
		}else if(e.getNewState()==Frame.ICONIFIED) {
			
			System.out.println("Ventana Minimizada");
		}
		
	}
}
