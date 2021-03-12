package tema65;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos65 {

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

// Tema 66 Imncluiremos un boton con el constructor JButton
// Añadimos un evento al hacer un Click en el boton y por tanto la lamina es un Listener para cambiar su color


class LaminaBotones extends JPanel implements ActionListener{
	
	JButton botonAzul=new JButton("Azul");
	
	JButton botonAmarillo=new JButton("Amarillo");
	
	JButton botonRojo=new JButton("Rojo");
	
	public LaminaBotones() {
		
		add(botonAzul);
		
		add(botonAmarillo);
		
		add(botonRojo);
		
		botonAzul.addActionListener(this); //This recordamos que referencia al objeto donde nos encontramos en este caso a LaminaBotones
	
		botonAmarillo.addActionListener(this);
		
		botonRojo.addActionListener(this);
	
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
