package tema91;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaArea {

	public static void main(String[] args) {
		
		MarcoPruebaArea mimarco=new MarcoPruebaArea();
		
		mimarco.setVisible(true);

	}

}

//Vamos a programar sin crear paquetes pequeños con cada clase. ES COMO HAYQUE HACERLO. esto es un experimento para ver que un poco mas confuso desordenado

class MarcoPruebaArea extends JFrame{
	
	public MarcoPruebaArea(){
		
		setTitle("Probando Area de texto");
		
		setBounds(2600,300,500,350);
		
		setLayout(new BorderLayout()); //Creamos una lamina en el sur con dos botones y otra para el resto
		
		laminaBotones=new JPanel();
		
		botonInsertar=new JButton("Inserta");
		
		botonInsertar.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {

				areaTexto.append("En un lugar de la mancha");
				
			}
		});
		
		laminaBotones.add(botonInsertar);
		
		botonSaltoLinea=new JButton("Salto Linea");
		
		botonSaltoLinea.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {

				boolean saltar=!areaTexto.getLineWrap(); //le damos lo contrario que haya en el area de texto, al no haber un  salto de linea se convierte en un TRUE
				
				areaTexto.setLineWrap(saltar); //que introduzca un salto de linea cuando es TRUE y quita las
				
			/*	if(saltar) {
					
					botonSaltoLinea.setText("Quitar salto");
										
				}else {
					
					botonSaltoLinea.setText("Salto Linea");
				} */
				
				//si usamos el operador ternario que funciona como un IF
				
				botonSaltoLinea.setText(saltar ? "Quitar salto" : "Salto Linea");
				
			}
		});
		
		laminaBotones.add(botonSaltoLinea); //Agregamos los botones
		
		add(laminaBotones,BorderLayout.SOUTH);
		
		areaTexto=new JTextArea(8,20);
		
		laminaConBarras=new JScrollPane(areaTexto);
		
		add(laminaConBarras,BorderLayout.CENTER);
	}
	
	private JPanel laminaBotones;
	
	private JButton botonInsertar,botonSaltoLinea;
	
	private JTextArea areaTexto;
	
	private JScrollPane laminaConBarras;
	
}

