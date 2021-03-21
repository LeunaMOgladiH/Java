package tema75;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventoFoco2 {

	public static void main(String[] args) {
	
		MarcoFoco marco=new MarcoFoco();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		
		setVisible(true);
		
		setBounds(2600,300,600,450);
		
		add(new LaminaFoco());
	}
}

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
		
		cuadro1.addFocusListener(elFoco);
		
	}
	
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
	
			
			
		}

		@Override
		public void focusLost(FocusEvent e) {

			String email=cuadro1.getText(); //Captura el texto del cuadro
			
			boolean comprobar=false;
			
			for  (int i=0;i<email.length();i++) {
				
				if (email.charAt(i)=='@') {
					
					comprobar=true;
				}
			}
			
		//Evaluamos solamente si tiene una @, es muy basico
			
			if(comprobar) {
				
				System.out.println("El mail es Correcto");
			}else {
				
				System.out.println("El mail es Incorrecto");
			}
			
		}
		
		
		
	}
	
	JTextField cuadro1;
	
	JTextField cuadro2;
	
}