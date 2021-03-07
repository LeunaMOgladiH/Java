package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {

	public static void main(String[] args) {
		
		MarcoBotones mimarco=new MarcoBotones();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		
		setTitle("Botones y Eventos");
		
		setBounds (700,300,500,300);
		
		LaminaBotones milamina=new LaminaBotones();
		
		add(milamina);
	}
}

class LaminaBotones extends JPanel implements ActionListener{
	
	JButton botonAzul=new JButton("Azul");
	
	JButton botonAmarillo=new JButton("Amarillo");
	
	JButton botonRojo=new JButton("Rojo");
	
	public LaminaBotones() {
		
		add(botonAzul);
		
		add(botonRojo);
		
		add(botonAmarillo);
		
		botonAzul.addActionListener(this);
		
		botonRojo.addActionListener(this);
		
		botonAmarillo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object BotonPulsado=e.getSource();
		
		if(BotonPulsado==botonAzul) {
	
			setBackground(Color.blue);
		}
		else if (BotonPulsado==botonRojo) {
			
			setBackground(Color.red);
		}
		else {
			
			setBackground(Color.yellow);
		}
	} 
}