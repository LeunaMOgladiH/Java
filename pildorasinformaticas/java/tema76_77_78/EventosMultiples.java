package tema76_77_78;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class EventosMultiples {

	public static void main(String[] args) {

		MarcoAccion Marco=new MarcoAccion();
		
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Marco.setVisible(true);
		
	}

}

class MarcoAccion extends JFrame{
	
	public MarcoAccion() {
		
		setTitle("Pueba de Acciones");
		
		setBounds(2600,350,600,300);
		
		PanelAccion lamina=new PanelAccion();
		
		add(lamina);
		
	}
}

class PanelAccion extends JPanel{
	
	
	public PanelAccion() {
		
		/*JButton botonamarillo=new JButton("Amarillo");
		
		JButton botonrojo=new JButton("Rojo");
		
		JButton botonazul=new JButton("Azul");
		
		add(botonamarillo);
		
		add(botonrojo);
		
		add(botonazul);*/
		
		Image imga=new ImageIcon("java/tema76_77_78_79/imagenes/004-d.png").getImage();
		ImageIcon img1=new ImageIcon(imga.getScaledInstance(75, 75, Image.SCALE_SMOOTH));
		
		Image imgb=new ImageIcon("java/tema76_77_78_79/imagenes/003-c.png").getImage();
		ImageIcon img2=new ImageIcon(imgb.getScaledInstance(75, 75, Image.SCALE_SMOOTH));
		
		Image imgc=new ImageIcon("java/tema76_77_78_79/imagenes/002-b.png").getImage();
		ImageIcon img3=new ImageIcon(imgc.getScaledInstance(75, 75, Image.SCALE_SMOOTH));
		
				
		AccionColor accionAmarillo=new AccionColor("Amarillo",img1,Color.yellow);
		
		AccionColor accionRojo=new AccionColor("Rojo",img2,Color.red);
		
		AccionColor accionAzul=new AccionColor("Azul",img3,Color.blue);
		
		add(new JButton(accionAmarillo)); //añadimos un boton a la lamina
		
		add(new JButton(accionRojo)); 
		
		add(new JButton(accionAzul)); 
		
		//Dentro del constructor de la lamina vamos a crear el Mapa de Entrada para empezar a programar la asignacion de teclas
		
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW); //El objeto del foco esta en la lamina
		
		//Seguimos creando la combinacion de teclas
		
		//KeyStroke teclaAmarilla=KeyStroke.getKeyStroke("Ctrl a"); Podemos simplificar asignando esta linea directamente en el mapa de Entrada
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"),"fondo_amarillo"); //Cuidado pues ctrl debe estar en singular y la letra en mayuscula
	
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"),"fondo_rojo"); 
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"),"fondo_azul"); 
		
		ActionMap mapaAccion=getActionMap(); //Creamos un  mapa de acciones para poder asignarles un vinculo con el mapa de entrada
		
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		
		mapaAccion.put("fondo_rojo", accionRojo);
		
		mapaAccion.put("fondo_azul", accionAzul);
		
	}
	

	// Clase Oyente. Cuando se produzca el Evento que informacion queremos almacenar
	// Guardaremos el nombre del boton, el Icono, la descripcion (saldra cuando pongamos el raton sobre el boton) y la acccion que realizara
	// Para ello usaremos putValue
	// Ademas encapsulamos la clase para que no pueda ser usada externamente "private"

	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre,Icon icono,Color color_boton) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color "+nombre);
			
			putValue("color_de_fondo",color_boton);
			
		}

	//Es la clase Oyente para indicar que tiene que hacer, como estamos tratando de guardar un objeto en un color, tenemos que hacer un CASTING (Color)
		
		public void actionPerformed(ActionEvent e) {

		Color c=(Color)getValue("color_de_fondo");

	//Este metodo no corresponde a la clase actionPerformed, asi que tenemos convertirla en accion interna de JPanel para poder reconocerla como metodo
		setBackground(c);
		
		System.out.println("Nombre de Boton pulsado: "+getValue(Action.NAME)+" Descripcion del Boton: "+getValue(Action.SHORT_DESCRIPTION));
			
		}
		
		
	}
}
