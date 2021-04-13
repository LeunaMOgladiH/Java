package tema93;

import javax.swing.*;

public class PruebaRadioButton {

	public static void main(String[] args) {

		MarcoRadioB mimarco=new MarcoRadioB();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRadioB extends JFrame{
	
	public MarcoRadioB() {
		
		setBounds(2600,300,500,300);
		
		setVisible(true);
		
		LaminaRadioB milamina=new LaminaRadioB();
		
		add(milamina);
		
	}
}

class LaminaRadioB extends JPanel{
	
	public LaminaRadioB() {
		
		ButtonGroup migrupo1=new ButtonGroup(); //Al agruparlos se tienen que dar los booleans que aladiremos, 1 solo true y dos false siempre
		
		ButtonGroup migrupo2=new ButtonGroup();
		
		JRadioButton boton1=new JRadioButton("Azul",true);
		
		JRadioButton boton2=new JRadioButton("Rojo",false);
		
		JRadioButton boton3=new JRadioButton("Verde",false);
		
		JRadioButton boton4=new JRadioButton("Masculino",true);
		
		JRadioButton boton5=new JRadioButton("Femenino",false);
		
		migrupo1.add(boton1);
		
		migrupo1.add(boton2);
		
		migrupo1.add(boton3);
		
		migrupo2.add(boton4);
		
		migrupo2.add(boton5);
		
		// no podemos añadir los grupos a la lamina hay que añadir los botones uno a uno, despues de haberlos agrupaods
		
		add(boton1);
		
		add(boton2);
		
		add(boton3);
		
		add(boton4);
		
		add(boton5);
	}
}