package tema96;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Sliders {

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
		
		JSlider control=new JSlider(0,100,50);
		
		control.setMajorTickSpacing(50); //Marcas mayores cada 25
		
		control.setMinorTickSpacing(25); //Marcas menores cada 5
		
		control.setPaintTicks(true); // Imprime las marcas
		
		control.setFont(new Font("Arial",Font.ITALIC,10));
		
		control.setPaintLabels(true);
		
		control.setSnapToTicks(true); // Metodo para que funciones el slider como un iman y se vaya a los valores mayores, no se quede en un valor intermedio de forma automatica
		
		add(control);
		
	}
	
}