package tema55;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class pruebaEventos2 {
	
	public static void main(String[] args) {
		
		Marcos mimarco=new Marcos();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marcos extends JFrame{
	
	public Marcos() {
		
		setTitle("Prueba con botones");
		
		setBounds(700,300,500,300);
		
		Laminas milamina=new Laminas();
		
		add(milamina);
	}
}

class Laminas extends JPanel{
	
	JButton botonAzul=new JButton("Azul");
	
	public Laminas() {
		
		add(botonAzul);
		
		ColorFondo Azul=new ColorFondo(Color.blue);
		
		botonAzul.addActionListener(Azul);
	}
	
	class ColorFondo implements ActionListener{
		
		public ColorFondo(Color c) {
			
			colordeFondo=c;
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colordeFondo);
		}
		
		private Color colordeFondo;
	}
	
}


