package tema71;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventoTeclado {

	public static void main(String[] args) {

		MarcoconTeclas marco1=new MarcoconTeclas();
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoconTeclas extends JFrame{
	
	public MarcoconTeclas() {
		
		setVisible(true);
		
		setBounds(2600,300,600,450);
		
		//Insatanciamos una  variable del eventodeteclado y lo ponemos a la escucha
		
		EventodeTeclado tecla=new EventodeTeclado();
		
		addKeyListener(tecla);

	}
}

//Creamos un Oyente de la pulsacion de teclas

class EventodeTeclado implements KeyListener{

	//Se suelta la tecla
	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

		char letra=e.getKeyChar();
		
		System.out.println("La tecla presionada es: "+letra);
	}

	//Tecla pulsada
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int codigo=e.getKeyCode();
		
		System.out.println("El codigo de la tecla pulsada es: "+codigo);
		
	}

	//Se realiza ambas cosas
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}