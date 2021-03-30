package tema81_82;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Layouts_I {
	
	//Vamos a utilizar clases de Layouts como FlowLayout

	public static void main(String[] args) {

		Marco_Layout mimarco=new Marco_Layout();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}
}	
	class Marco_Layout extends JFrame{
		
		public Marco_Layout() {
		
		setTitle("Prueba LayOuts");
		
		setBounds(2700,350,600,300);
		
		Panel_Layout lamina=new Panel_Layout(); 
		
		//FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT); //Creamos un LayOut diferente para su posicionamiento, en este caso a la IZQUIERDA
		
		Panel_Layout2 lamina2=new Panel_Layout2();

		add(lamina,BorderLayout.NORTH); //Para no machacar las laminas superponiendolas, tenemos que añadir un Borderlayout 
		
		add(lamina2,BorderLayout.SOUTH);
		
		}
			
	}
	
	class Panel_Layout extends JPanel{
		
		public Panel_Layout() {
			
			//setLayout(new FlowLayout(FlowLayout.CENTER,50,100));	//Podemos simplificar el codigo, 50 es la distancia entre botones, y 100 distancia con los bordes
						
			setLayout(new FlowLayout(FlowLayout.CENTER)); //Vamos a usar el metodo BorderLayout para colocar los botones segun le indiquemos y ocupando todo el espacio designado
												//Los valores dentro del BorderLayout es para indicar la distancia entre ellos
											
			add(new JButton("Amarillo"));
			
			add(new JButton("Azul")); 
			

		}
	}

	class Panel_Layout2 extends JPanel{ 	//Si quieres mezclar los Flow y los Border deberemos crear una lamina para cada uno de los metodos
		
		public Panel_Layout2() {
			
			setLayout(new BorderLayout());
			
			add(new JButton("Rojo"),BorderLayout.EAST);
			
			add(new JButton("Verde"),BorderLayout.WEST);
			
			add(new JButton("Negro"),BorderLayout.CENTER);
		}
	}

