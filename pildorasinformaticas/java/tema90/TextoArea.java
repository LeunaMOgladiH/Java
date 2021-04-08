package tema90;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextoArea {

	public static void main(String[] args) {
		
		MarcoArea mimarco=new MarcoArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoArea extends JFrame{
	
	public MarcoArea(){
		
		setBounds(2600,300,500,350);
		
		LaminaArea milamina=new LaminaArea();
		
		add(milamina);
		
		setVisible(true);
		
	}
}

class LaminaArea extends JPanel{
	
	public LaminaArea() {
		
		miarea=new JTextArea(8,20); //Le da un area de escritura de 8 filas y 20 columnas
		
		JScrollPane milaminaBarras=new JScrollPane(miarea); //Crearemos una lamina secundario donde insertaremos el area de escritura y que pueden tener unas barras de scroll para movernos y que no cambien la dimension de la zona de escritura
		
		miarea.setLineWrap(true); // Vamos a permitir que haya saltos de linea para que no se redimensione el ancho del area de escritura, que es el caso base
		
		add(milaminaBarras);
		
		JButton miboton=new JButton("Pulsa");
		
		miboton.addActionListener(new GestionaArea());
		
		add(miboton);
		
	}
	
	private class GestionaArea implements ActionListener{


		public void actionPerformed(ActionEvent e) {

			System.out.println(miarea.getText());
			
		}
		
		
	}
	
	private JTextArea miarea;
}