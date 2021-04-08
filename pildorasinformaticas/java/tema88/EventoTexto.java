package tema88;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventoTexto {

	public static void main(String[] args) {

		MarcoPrueba mimarco=new MarcoPrueba();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPrueba extends JFrame{
	
	public MarcoPrueba() {
		
		setBounds(2600,300,500,300);
		
		LaminaPrueba milamina=new LaminaPrueba();
		
		add(milamina);
		
		setVisible(true);		
	}
}

class LaminaPrueba extends JPanel{
	
	public LaminaPrueba() {
		
		JTextField micampo=new JTextField(20);
		
		EscuchaTexto elEvento=new EscuchaTexto(); // usamos el evento creado
		
		Document midoc=micampo.getDocument(); //Capturamos lo escrito en la varibale micampo
		
		midoc.addDocumentListener(elEvento);
				
		add(micampo);
		
	}
	
	private class EscuchaTexto implements DocumentListener{

		public void insertUpdate(DocumentEvent e) { //Comunica si se ha insertado tecto en el cuadro

			System.out.println("Has insertado texto");
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) { //Indica si se ha borrado texto en el cuadro

			System.out.println("Has borrado texto");
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {// Indica que se haya cambiado las propiedades del texto, negritas, subrayado, altura de texto, etc...

			
		}

		
		
	}
}