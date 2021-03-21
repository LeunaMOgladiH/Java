package tema72_73;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventoRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton miraton=new MarcoRaton();
		
		miraton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		
		setVisible(true);
		
		setBounds(2600,300,600,450);
		
		EventodeRaton click=new EventodeRaton();
		
		addMouseListener(click);
		
		EventosdeRaton2 click2=new EventosdeRaton2();
		
		addMouseMotionListener(click2);
	}
}
 
//Siempre podemos heredar de la clase MouseAdapter, para solo implementar el evento que necesitamos y no los 5
//eliminamos "implements MouseListener" y lo cambiamos por "extends MouseAdapter"

class EventodeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {

		
		System.out.println("Has hecho CLICK con el raton en la coordenada X:"+e.getX()+" y la coordenada Y:"+e.getY());
		System.out.println("Has realizado "+e.getClickCount()+" Clicks seguidos");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		//System.out.println("Acabas de presionar el boton");
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			
			System.out.println("Has pulsado el boton Izquierdo del Raton");
			
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			
			System.out.println("Has pulsado la rueda del Raton");
			
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			
			System.out.println("Has pulsado el boton Derecho del Raton");
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//System.out.println("Acabas de levantar el dedo del boton");
		
	}
	
	//Para controlar el el movimiento del raton usamos MouseMotionListener

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//System.out.println("Acabas de entrar en la ventana");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//System.out.println("Acabas de salir de la ventana");
		
	}
		
}

class EventosdeRaton2 implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {

		System.out.println("Estas Arrastrando el Cursor");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		System.out.println("Estas moviendo el Cursor");
		
	}
	
	
}