package tema74;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventoFoco {

	public static void main(String[] args) {
		
		MarcoFoco marco1=new MarcoFoco();
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		
		setVisible(true);
		
		setBounds(2600,300,600,450);
		
		add(new LaminaFoco());
	}
}

//Crearemos una lamina dentro del Marco
//Vamos a invalidad el layout que por defecto Java lo posiciona en su sitio constante

class LaminaFoco extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);
		
		cuadro1=new JTextField();
		
		cuadro2=new JTextField();
		
		cuadro1.setBounds(120,30,150,20);
		
		cuadro2.setBounds(120,70,150,20);
		
		add(cuadro1);
		
		add(cuadro2);
		
		LanzaFocos elFoco=new LanzaFocos();
		
		cuadro1.addFocusListener(elFoco); //Ponemos el cuadro1 a la escucha
	}
	
	//Tenemos que recurrir a variables que estan en una clase diferente, por lo que tenemos que usar son
	//clases internas y por tanto encapsularla con un private class

	private class LanzaFocos implements FocusListener{


		public void focusGained(FocusEvent e) {
			
			
		}


		public void focusLost(FocusEvent e) {
			
			System.out.println("Has perdido el foco en el cuadro1");
		}
		
		
	}
	
	//Sacamos estas variables del componente pero no de la clase LaminaFoco, para poder se utilizadas
	
	JTextField cuadro1;
	
	JTextField cuadro2;
}



