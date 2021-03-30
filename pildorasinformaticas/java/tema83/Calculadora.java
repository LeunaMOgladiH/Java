package tema83;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) { //Vamos a usar los GridLayout para crear una disposicion en reticula o rejilla para crear nuestra calculadora

		Marco mimarco=new Marco();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class Marco extends JFrame{
	
	public Marco() {
		
		setTitle("Claculadora");
		
		setBounds(2600,300,450,300);
		
		LaminaCalc milamina=new LaminaCalc();
		
		add(milamina);
		
		//pack(); //Se tiene que adaptar al tamaño de la ventana, que inicialmente le da un valor incial pequeñoy en la posicion 0,0 , y tendriamos que eliminar el Setbounds para que no entre en contradiccion
		
	}
}

class LaminaCalc extends JPanel{
	
	public LaminaCalc() {
		
		principio=true;
		
		setLayout(new BorderLayout());
		
		//JButton pantalla=new JButton("0"); Al haber defiinido pantalla fuera del constructos no podemos definir pantalla de este modo, en la siguiente linea se realiza como se debe de asignar
		
		pantalla=new JButton("0");
		
		pantalla.setEnabled(false); //podemos desactivar el boton mientras lo diseñamos
		
		add(pantalla,BorderLayout.NORTH);
		
		milamina2=new JPanel();
		
		milamina2.setLayout(new GridLayout(6,4));
		
		ActionListener insertar= new Insertanum(); // creamos una instancia de la clase insertanum
		
		//ponerBoton("%");
		//ponerBoton("CE");
		//ponerBoton("C");
		//ponerBoton("DEL");
		
		//ponerBoton("1/x");
		//ponerBoton("x^2");
		//ponerBoton("x^1/2");
		//ponerBoton("/");
		
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		//ponerBoton("x",insertar);
		
		ponerBoton("4",insertar);
		ponerBoton("6",insertar);
		ponerBoton("7",insertar);
	  //ponerBoton("-");
		
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		//ponerBoton("+");
		
		//ponerBoton("+/-");
		ponerBoton("0",insertar);
		//ponerBoton(",");
		//ponerBoton("=");
		
		add(milamina2,BorderLayout.CENTER);

	}
	
	private void ponerBoton(String rotulo,ActionListener oyente) { // es un metodo que agregara los botones y ademas los pondra a la escucha
		
		JButton boton=new JButton(rotulo);
		
		boton.addActionListener(oyente); // Ponemos el boton a la escucha
		
		milamina2.add(boton);
	}
	
	private class Insertanum implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String entrada=e.getActionCommand(); //Nos devuelve el string asociado con la accion, capturamos el texto del boton pulsado
			
			if (principio){
				
				pantalla.setText("");
				
				principio=false;
			}
			
			pantalla.setText(pantalla.getText()+entrada);
			
		} 
		
				
	}
	
	private JPanel milamina2;
	
	private JButton pantalla;
	
	private boolean principio;
}

