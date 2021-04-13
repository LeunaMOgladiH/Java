package tema92;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaChecks {

	public static void main(String[] args) {

		MarcoChecks mimarco=new MarcoChecks();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoChecks extends JFrame{
	
	public MarcoChecks() {
		
		setBounds(2600,300,500,350);
		
		setTitle("Prueba de Checks");
		
		setVisible(true);
		
		LaminaChecks milamina=new LaminaChecks();
		
		add(milamina);
		 
	}
}

class LaminaChecks extends JPanel{
	
	public LaminaChecks() {
		
		setLayout(new BorderLayout());
		
		Font miletra=new Font("Serif", Font.PLAIN, 24); // Caracteristicas del tipo de letra que hemos decidido para el texto
		
		texto=new JLabel("En un lugar de la Mancha de cuyo nombre ...");
		
		texto.setFont(miletra); //indicamos que texto es de tipo FONT
		
		JPanel laminatexto=new JPanel();
		
		laminatexto.add(texto);
		
		add(laminatexto,BorderLayout.CENTER);
		
		check1=new JCheckBox("Negritas");
		
		check2=new JCheckBox("Cursiva");
		
		check1.addActionListener(new ManejaChecks());
		
		check2.addActionListener(new ManejaChecks());
		
		JPanel laminachecks=new JPanel();
		
		laminachecks.add(check1);
		
		laminachecks.add(check2);
		
		add(laminachecks,BorderLayout.SOUTH);
		
	}
	
	private class ManejaChecks implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int tipo=0;
			
			if(check1.isSelected()) tipo+=Font.BOLD; // si es TRUE incrementa el valor de la variable en 1, en el caso que no este seleccionado el valor de variables es 0; segun la API, el valor de la constante BOLD de FONT es 1
			
			if(check2.isSelected()) tipo+=Font.ITALIC; // si es TRUE incrementa el valor de la variable en 1, en el caso que no este seleccionado el valor de variables es 0; segun la API, el valor de la constante BOLD de FONT es 2
			
			texto.setFont(new Font("Serif",tipo,24));
			
		}
		
		
	}
	
	private JLabel texto;
	
	private JCheckBox check1,check2;
}