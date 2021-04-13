package tema97;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Sliders_Interactivo {

	public static void main(String[] args) {

		MarcoSliders mimarco=new MarcoSliders();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoSliders extends JFrame{
	
	public MarcoSliders() {
			
		setBounds(2600,300,500,350);
		
		LaminaSliders milamina=new LaminaSliders();
		
		add(milamina);
		
		setVisible(true);

	}
	
}

class LaminaSliders extends JPanel{
	
	public LaminaSliders() {
		
		setLayout(new BorderLayout());
		
		rotulo=new JLabel("En un lugar de la Mancha de cuyo nombre...");
		
		add(rotulo,BorderLayout.CENTER);
		
		control=new JSlider(8,48,8);
		
		control.setMajorTickSpacing(24);
		
		control.setMinorTickSpacing(6);
		
		control.setPaintLabels(true);
		
		control.setPaintTicks(true);
		
		control.setFont(new Font("Arial",Font.ITALIC,8));
		
		control.addChangeListener(new EventoSlider());
		
		JPanel laminaslider=new JPanel();
		
		laminaslider.add(control);
		
		add(laminaslider,BorderLayout.NORTH);
		
	}
	
	private class EventoSlider implements ChangeListener{
		
		public void stateChanged(ChangeEvent e) {

			rotulo.setFont(new Font("Arial",Font.PLAIN,control.getValue()));
			
		}
		
	}
	
	private JLabel rotulo; 
	
	private JSlider control;
	
}

