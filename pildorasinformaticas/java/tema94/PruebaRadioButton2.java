package tema94;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaRadioButton2 {

	public static void main(String[] args) {

		MarcoPrueba2 mimarco=new MarcoPrueba2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoPrueba2 extends JFrame{
	
	public MarcoPrueba2() {
		
		setBounds(2600,300,500,350);
		
		setVisible(true);
		
		LaminaRadio milamina=new LaminaRadio();
		
		add(milamina);
		
	}
	
}

class LaminaRadio extends JPanel{
	
	public LaminaRadio() {
		
		setLayout(new BorderLayout()); //Indicamos que vamos atrabajar con BorderLayouts
		
		texto=new JLabel ("En un lugar de la Mancha de cuyo nombre ...");
		
		add(texto,BorderLayout.CENTER);
		
		ButtonGroup migrupo=new ButtonGroup();
		
		boton1=new JRadioButton("Pequeño",true);

		boton2=new JRadioButton("Mediano",true);
		
		boton3=new JRadioButton("Grande",true);
		
		boton4=new JRadioButton("Muy Grande",true);
		
		JPanel laminaradio=new JPanel();
		
		Eventoradio mievento=new Eventoradio();
		
		boton1.addActionListener(mievento); // Ponemos el boton a la escucha
		
		boton2.addActionListener(mievento);
		
		boton3.addActionListener(mievento);
		
		boton4.addActionListener(mievento);
		
		migrupo.add(boton1);	
		
		migrupo.add(boton2);	
		
		migrupo.add(boton3);	
		
		migrupo.add(boton4);
		
		laminaradio.add(boton1);
		
		laminaradio.add(boton2);
		
		laminaradio.add(boton3);
		
		laminaradio.add(boton4);
		
		add(laminaradio,BorderLayout.SOUTH);
		
	}
	
	
	private class Eventoradio implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			if(e.getSource()==boton1) {
				
				//System.out.println("Has pulsado 1");
				
				texto.setFont(new Font("Serif",Font.PLAIN,10));
				
			}else if(e.getSource()==boton2) {
				
				texto.setFont(new Font("Serif",Font.PLAIN,12));

			}else if(e.getSource()==boton3) {
				
				texto.setFont(new Font("Serif",Font.PLAIN,18));

			}else if(e.getSource()==boton4) {
				
				texto.setFont(new Font("Serif",Font.PLAIN,34));

			}
			
		}
		
	}
	
	private JLabel texto;
	
	private JRadioButton boton1,boton2,boton3,boton4;
	
}

