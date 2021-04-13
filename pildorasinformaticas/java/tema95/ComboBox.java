package tema95;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComboBox {

	public static void main(String[] args) {

		MarcoCombo micombo=new MarcoCombo();
		
		micombo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCombo extends JFrame{
	
	public MarcoCombo() {
		
		setBounds(2600,350,550,400);
		
		LaminaCombo milamina=new LaminaCombo();
				
		add(milamina);
		
		setVisible(true);
		
	}
}

class LaminaCombo extends JPanel{
	
	public LaminaCombo() {
		
		setLayout(new BorderLayout());
		
		texto=new JLabel("En un lugar de la Mancha de cuyo nombre ...");
		
		texto.setFont(new Font("Serif",Font.PLAIN,12));
		
		add(texto,BorderLayout.CENTER);
		
		JPanel laminanorte=new JPanel();
		
		micombo=new JComboBox();
		
		micombo.addItem("Serif");
		
		micombo.addItem("SansSerif");
		
		micombo.addItem("Courier");
		
		micombo.addItem("Monospaced");
		
		micombo.addItem("Dialog");
		
		EventoCombo mievento=new EventoCombo();
		
		micombo.addActionListener(mievento);
		
		laminanorte.add(micombo);
		
		add(laminanorte,BorderLayout.NORTH);
		 
	}
	
	private class EventoCombo implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,18)); // como necesitamos un String, tenemos que hacer un CASTING, se hace con (String), para convertir un Object en un String
			
		}
		
		
		
	}
	
	private JLabel texto;
	
	private JComboBox micombo;

}

