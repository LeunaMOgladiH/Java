package tema83_84_85;

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
		
		ActionListener orden=new AccionOrden(); // creamos una instancia que este a la escucha de las operaciones numericas 
		
		ponerBoton("%",orden);
		ponerBoton("CE",orden);
		ponerBoton("C",orden);
		ponerBoton("DEL",orden);
		
		ponerBoton("1/x",orden);
		ponerBoton("x^2",orden);
		ponerBoton("x^1/2",orden);
		ponerBoton("/",orden);
		
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		ponerBoton("x",orden);
		
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		ponerBoton("-",orden);
		
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		ponerBoton("+",orden);
		
		ponerBoton("+/-",orden);
		ponerBoton("0",insertar);
		ponerBoton(",",orden);
		ponerBoton("=",orden);
		
		add(milamina2,BorderLayout.CENTER);

		ultimaOperacion="="; // Le damos un valor inicial de = para que funcione la calculdadora incialmente, con el fin de que el primer valor lo grabe en los IF de las lineas inferiores
	}
	
	private void ponerBoton(String rotulo,ActionListener oyente) { // es un metodo que agregara los botones y ademas los pondra a la escucha
		
		JButton boton=new JButton(rotulo);
		
		boton.addActionListener(oyente); // Ponemos el boton a la escucha
		
		milamina2.add(boton);
	}
	
	private class Insertanum implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String entrada=e.getActionCommand(); //Nos devuelve el string asociado con la accion, capturamos el texto del boton pulsado
			
			if (principio){ // si no asignamos un comparativo al if siempre lo compara con true
				
				pantalla.setText("");
				
				principio=false;
			}
			
			pantalla.setText(pantalla.getText()+entrada);
			
		} 
				
	}
	
	private class AccionOrden implements ActionListener{ 

		public void actionPerformed(ActionEvent e) { //Se encargara de las operaciones numericas
			
			String operacion=e.getActionCommand(); // Almaceno el valior de texto de la operacion
			
			//System.out.println("Has pulsado la operacion: "+operacion); // es un modo de confirmar que se esta grabando en la variable operacion el texto asociado a la operacion matematica
			
			calcular(Double.parseDouble(pantalla.getText())); // llamamos a un metodo para ir realizando las operaciones matematicos, al cual le pasaremos el parametro del display, ademas convertimos un String en Double

			ultimaOperacion=operacion;
			
			principio=true; //reseteamos el display
			
		}
		
		public void calcular(double x) {
			
			if(ultimaOperacion.equals("+")) { //
				
				resultado+=x; //suma el valor pulsado a resultado, en caso que sea una suma
								
			}else if(ultimaOperacion.equals("=")) { 
				
				resultado=x;
				
			}else if(ultimaOperacion.equals("-")) {
				
				resultado-=x;
				
			}else if(ultimaOperacion.equals("/")) {
				
				resultado/=x;
				
			}else if(ultimaOperacion.equals("x")) {
				
				resultado*=x;
				
			}
			
			pantalla.setText(""+resultado);  //concatenamos la variable resultado que es u numero con un valor vacio para convertirlo en String
			
		}
		
		
	}
	
	private JPanel milamina2;
	
	private JButton pantalla;
	
	private boolean principio; // si no la definimos una variable boolean siempre es false
	
	private double  resultado; //variable para grabra los numeros de las operaciones
	
	private String ultimaOperacion;
}

