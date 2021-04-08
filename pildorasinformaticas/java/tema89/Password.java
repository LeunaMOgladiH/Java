package tema89;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Password {

	public static void main(String[] args) {
		
		MarcoPass mimarco=new MarcoPass();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPass extends JFrame{
	
	public MarcoPass() {
		
		setBounds(2600,300,550,400);
		
		LaminaPass milamina=new LaminaPass();
		
		add(milamina);
		
		setVisible(true);
		
	}
}

// Es muy importante de como vamos a organizar los LayOuts para crear el diseño de los botones y los textos.

class LaminaPass extends JPanel{
	
	public LaminaPass() {
		
		setLayout(new BorderLayout()); // Hemos creado el BorderLayout
		
		JPanel laminasup=new JPanel();
		
		laminasup.setLayout(new GridLayout(2,2)); // Distribucion en dos columnas y dos filas
		
		add(laminasup,BorderLayout.NORTH);
		
		JLabel etiq1=new JLabel("Usuario");
		
		JLabel etiq2=new JLabel("Contraseña");
		
		JTextField c_usuario=new JTextField(15);
		
		Comprueba_pass mievento=new Comprueba_pass();
		
		c_contra=new JPasswordField(15);
		
		c_contra.getDocument().addDocumentListener(mievento); // una unica linea para conseguir lo escrito y añadirlo al document listener
		
		laminasup.add(etiq1); // Los elementos se va agregando de izq a drch y de arriba a abajo
		
		laminasup.add(c_usuario);
		
		laminasup.add(etiq2);
		
		laminasup.add(c_contra);
		
		JButton enviar=new JButton("Enviar");
				
		add(enviar,BorderLayout.SOUTH);
	}
	
	private class Comprueba_pass implements DocumentListener{ //queremos resalta en rojo el password mal escrito y en blanco bien escrito


		public void insertUpdate(DocumentEvent e) {

			char[] pass;
			
			pass=c_contra.getPassword(); // Almacenamos en el array cada uno de los caracteres de la contrasña
			
			if(pass.length<8||pass.length>12) {
				
				c_contra.setBackground(Color.red);
				
			}else {
				
				c_contra.setBackground(Color.white);
			}
			
		}


		public void removeUpdate(DocumentEvent e) {
			
			char[] pass;
			
			pass=c_contra.getPassword(); 
			
			if(pass.length<8||pass.length>12) {
				
				c_contra.setBackground(Color.red);
				
			}else {
				
				c_contra.setBackground(Color.white);
			}

			
		}


		public void changedUpdate(DocumentEvent e) {

			
		}
		
		
	}
	
	private JPasswordField c_contra;
}
