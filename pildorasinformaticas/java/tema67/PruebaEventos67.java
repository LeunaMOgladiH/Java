package tema67;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Vamos hacer el mismo ejercicio del tema 65 pero en vez de ser el oyente el boton, sera la lamina ColorFondo

public class PruebaEventos67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marcobotones mimarco=new Marcobotones();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marcobotones extends JFrame{
	
	public Marcobotones() {
		
		setTitle("Botones y Eventos");
		
		setBounds(700, 300, 500, 300);
		
		LaminaBotones milamina=new LaminaBotones();
		
		add(milamina);
	}
}

class LaminaBotones extends JPanel  {
	
	JButton botonAzul=new JButton("Azul");
	
	JButton botonAmarillo=new JButton("Amarillo");
	
	JButton botonRojo=new JButton("Rojo");
	
	public LaminaBotones() {
		
		add(botonAzul);
		
		add(botonAmarillo);
		
		add(botonRojo);
		
		ColorFondo Amarillo=new ColorFondo(Color.yellow);
		ColorFondo Rojo=new ColorFondo(Color.red);
		ColorFondo Azul=new ColorFondo(Color.blue);
		
		botonAzul.addActionListener(Azul); //This recordamos que referencia al objeto donde nos encontramos en este caso a LaminaBotones
	
		botonAmarillo.addActionListener(Amarillo);
		
		botonRojo.addActionListener(Rojo);
	
	}
	
	private class ColorFondo implements ActionListener{
		
		public ColorFondo(Color c) {
			
			colordeFondo=c;
		}
		  
		public void  actionPerformed(ActionEvent e) {
			
			setBackground(colordeFondo);
		}
		
		private Color colordeFondo; //Variable encapsulada
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado=e.getSource(); // nos indica quien esta siendo pulsado
		
		if (botonPulsado==botonAzul){
		
		setBackground(Color.blue);
		
	} else if (botonPulsado==botonAmarillo){
		
		setBackground(Color.yellow);
		
	} else{
		
		setBackground(Color.red);
	}
		
	}
	
}
