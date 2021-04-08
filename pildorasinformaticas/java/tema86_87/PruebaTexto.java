package tema86_87;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// Creamos una aplicacion donde escribir un tecto y grabaralo con el click de unboton

public class PruebaTexto {

	public static void main(String[] args) {

		MarcoTexto mimarco=new MarcoTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		
		setBounds(2600,300,600,350);
		
		LaminaTexto milamina=new LaminaTexto();
		
		add(milamina);
		
		setVisible(true);
	}
}

class LaminaTexto extends JPanel{
	
	public LaminaTexto(){
		
		setLayout(new BorderLayout());
		
		JPanel milamina2=new JPanel();
		
		milamina2.setLayout(new FlowLayout());
		
		resultado=new JLabel("",JLabel.CENTER); // Alineamos el texto de JLABEL
		
		JLabel texto1=new JLabel("Email: "); // Insertamos un Texto a la lamina
		
		milamina2.add(texto1);
		
		//JTextField campo1=new JTextField("Introduzca su nombre",20);//Creamos una instancia, y usamos el constructor por defecto, tenemos que ver en JAVA la sobrecarga de constructores para ver las posibilidades
		
		campo1=new JTextField(20); //inicializamos la varible dentro del constructor pero esta definida fuera de este y dentro de la clase LaminaTexto
		
		milamina2.add(campo1);//La agregamos a la lamina

		add(resultado,BorderLayout.CENTER); //Agregamos el resultado entre el cuadro de escritura y el boton de comprobacion
		
		//System.out.println("El nombre escrito es "+campo1.getText().trim()); //Trim le quita los espacios adicionales
		
		JButton miboton=new JButton("Comprobar");
		
		DameTexto mievento=new DameTexto();
		
		miboton.addActionListener(mievento);
		
		milamina2.add(miboton);
		
		add(milamina2,BorderLayout.NORTH); //Colocamos la lamina2 en el norte de la principal
	}
	
	private class DameTexto implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int correcto=0;	// Vamos a contar cuantas @ hay en el email, para ver si es correcto o no
			
			String email=campo1.getText().trim();	// Elimina los espacios antes y despues del email por si hay fallos
			
			for (int i=0;i<email.length();i++) {
				
				if(email.charAt(i)=='@') {
					
					correcto++;
				}
			}

			if(correcto!=1) {
				
				resultado.setText("Incorrecto");
				
			} else {
				
				resultado.setText("Correcto");
				
			}
			
			System.out.println(campo1.getText().trim());
			
		}

		
	}
		
	private JTextField campo1; //Incializo de la clase Lamina pero fuera del constructor para poder usarlo fuera de este
	
	private JLabel resultado;
	
}
