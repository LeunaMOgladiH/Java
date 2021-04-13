package tema94_5;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PruebaRadioButton3 {

	//Vamos a desarrollar el proyecto de una forma mas comprimida que el PruebaRadioButton
	
	public static void main(String[] args) {

		MarcoPrueba mimarco=new MarcoPrueba();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPrueba extends JFrame{
	
	public MarcoPrueba() {
		
		setBounds(2600,300,500,350);
		
		LaminaRadio milamina=new LaminaRadio();	

		add(milamina);
			
		setVisible(true);
		
	}
}

class LaminaRadio extends JPanel{
	
	public LaminaRadio() {
		
		setLayout(new BorderLayout());
		
		texto=new JLabel("En un lugar de la Mancha de cuyo nombre ...");
		
		texto.setFont(new Font("Serif",Font.PLAIN,12));
		
		add(texto,BorderLayout.CENTER);
		
		laminabotones=new JPanel(); //iniciamos la lamina para que no tenga valor NULL y nos de un error
		
		migrupo=new ButtonGroup(); //iniciamos la varible group para que no tenga valor NULL y nos de un error
		
		colocarBoton("Pequeño", false, 8);
		
		colocarBoton("Mediano", false, 10);
		
		colocarBoton("Grande", false, 18);
		
		colocarBoton("Muy Grande", true, 24);
		
		add(laminabotones,BorderLayout.SOUTH);
		
	}
	
	public void colocarBoton(String nombre, boolean selecc,int size) { //Este constructor no servira para esvribir menos codigo creando botones con las mismas caracteristicas, posicionandolos y ademas porniendolos a la escucha
				
		JRadioButton boton=new JRadioButton(nombre,selecc);
		
		migrupo.add(boton); // todos los botones creados los asigna al grupo
		
		laminabotones.add(boton); // añadimos los botones a un lamina para poder manipularlos
		
		ActionListener mievento=new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				texto.setFont(new Font("Serif",Font.PLAIN,size));
				
			}
		};// Ponemos a la escucha ademas todos los botones
		
		boton.addActionListener(mievento);
		
	}
	
	private JLabel texto;

	private JButton boton1,boton2,boton3,boton4;
	
	private ButtonGroup migrupo;
	
	private JPanel laminabotones;
	
}

