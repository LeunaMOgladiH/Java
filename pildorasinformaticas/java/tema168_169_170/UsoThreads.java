package tema168_169_170;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.*;

import javax.swing.*;

public class UsoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame marco=new MarcoRebote();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}

//Hilos MultiThreads

class PelotaHilos implements Runnable{
	
	public PelotaHilos(Pelota unaPelota, Component unComponente) {
		
		pelota=unaPelota;
		
		componente=unComponente;
		
	}
	
	public void run() {
		
		System.out.println("Estado del hilo al comenzar: "+Thread.currentThread().isInterrupted());
		
		/*for (int i=1; i<=3000; i++){
			
			pelota.mueve_pelota(componente.getBounds());
			
			componente.paint(componente.getGraphics());
			
			try {
				Thread.sleep(4);
				
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}*/
		
		while(!Thread.currentThread().isInterrupted()){
			
			pelota.mueve_pelota(componente.getBounds());
			
			componente.repaint();
			
			try {
				Thread.sleep(4);
				
			} catch (InterruptedException e) {
	
				Thread.currentThread().interrupt();
			}
			
		}
		
		System.out.println("Estado del hilo al comenzar: "+Thread.currentThread().isInterrupted());
		
	}
	
	private Pelota pelota;
	
	private Component componente;
	
}


//Movimiento de la pelota-----------------------------------------------------------------------------------------

class Pelota{
	
// Mueve la pelota invirtiendo posición si choca con límites
	
	public void mueve_pelota(Rectangle2D limites){
		
		x+=dx;
		
		y+=dy;
		
		if(x<limites.getMinX()){
			
			x=limites.getMinX();
			
			dx=-dx;
		}
		
		if(x + TAMX>=limites.getMaxX()){
			
			x=limites.getMaxX() - TAMX;
			
			dx=-dx;
		}
		
		if(y<limites.getMinY()){
			
			y=limites.getMinY();
			
			dy=-dy;
		}
		
		if(y + TAMY>=limites.getMaxY()){
			
			y=limites.getMaxY()-TAMY;
			
			dy=-dy;
			
		}
		
	}
	
//Forma de la pelota en su posición inicial
	
	public Ellipse2D getShape(){
		
		return new Ellipse2D.Double(x,y,TAMX,TAMY);
		
	}	
	
	private static final int TAMX=15;
	
	private static final int TAMY=15;
	
	private double x=0;
	
	private double y=0;
	
	private double dx=1;
	
	private double dy=1;
	
	
}

// Lámina que dibuja las pelotas----------------------------------------------------------------------


class LaminaPelota extends JPanel{
	
//Añadimos pelota a la lámina
	
	public void add(Pelota b){
		
		pelotas.add(b);
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		revalidate();
		
		for(Pelota b: pelotas){
			
			g2.fill(b.getShape());
		}
		

		
	}
	
	private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
}


//Marco con lámina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame{
	
	public MarcoRebote(){
		
		setBounds(2600,300,600,350);
		
		setTitle ("Rebotes");
		
		lamina=new LaminaPelota();
		
		add(lamina, BorderLayout.CENTER);
		
		JPanel laminaBotones=new JPanel();
		
		arranca1=new JButton("Hilo1");
		
		arranca1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego(evento);
									
			}
		});
		
		arranca2=new JButton("Hilo2");
		
		arranca2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego(evento);
									
			}
		});
		
		arranca3=new JButton("Hilo3");
		
		arranca3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego(evento);
									
			}
		});
		detener1=new JButton("Detener1");
		
		detener1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evento) {

				detener(evento);
									
			}
		});
		
		detener2=new JButton("Detener2");
		
		detener2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evento) {

				detener(evento);
									
			}
		});
		
		detener3=new JButton("Detener3");
		
		detener3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evento) {

				detener(evento);
									
			}
		});
		
/*		ponerBoton(laminaBotones, "Dale!", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				comienza_el_juego();
			}
			
		});*/
		
//Dibuja el boton de detener
		
/*		ponerBoton(laminaBotones, "Detener", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				detener();
				
			}
			
		});
		
		ponerBoton(laminaBotones, "Salir", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				System.exit(0);
				
			}
			
		});
*/		
		laminaBotones.add(arranca1);
		
		laminaBotones.add(arranca2);
		
		laminaBotones.add(arranca3);
		
		laminaBotones.add(detener1);
		
		laminaBotones.add(detener2);
		
		laminaBotones.add(detener3);
		
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	
//Ponemos botones
	
	/*public void ponerBoton(Container c, String titulo, ActionListener oyente){
		
		JButton boton=new JButton(titulo);
		
		c.add(boton);
		
		boton.addActionListener(oyente);
		
	}*/
	
//Añade pelota y la bota 1000 veces
	
	public void comienza_el_juego (ActionEvent e){
		
					
			Pelota pelota=new Pelota();
			
			lamina.add(pelota);
			
			Runnable r=new PelotaHilos(pelota, lamina);
			
			//Thread t=new Thread(r);	
			
			if(e.getSource().equals(arranca1)) {
				
				t1=new Thread(r);
				
				t1.start();
				
			} else if(e.getSource().equals(arranca2)) {
				
				t2=new Thread(r);
				
				t2.start();
				
			}else if(e.getSource().equals(arranca3)) {
				
				t3=new Thread(r);
				
				t3.start();
				
			}
			
		//	t=new Thread(r);
			
		//	t.start();
		
	}
	
	public void detener(ActionEvent e) {
		
		//t.stop(); // Nos indica que este metodo esta obsoleto, no se debe usar, ya que parar un hilo no es nada accesible
		
		if(e.getSource().equals(detener1)) {
			
			t1.interrupt(); //Cuando interrumpimos se lanza una excepcion InterruptedException, pero no interrumpe el hilo
		
		}else if(e.getSource().equals(detener2)) {
			
			t2.interrupt();
		
		}else if(e.getSource().equals(detener3)) {
			
			t3.interrupt();
			
		}
		
	}
	
	//Hacemos t accesible desde cualquier parte del Metodo
	
	Thread t1,t2,t3;
	
	JButton arranca1,arranca2,arranca3,detener1,detener2,detener3;
	
	private LaminaPelota lamina;
	
	
}

//PASOS A SEGUIR PARA UN PROGRAMA MULTITAREA
// 1.IMPLEMENTAR LA INTERFAZ RUNNABLE
// 2.ESCRIBIR EL CODIGO DE LA TAREA DENTRO DEL METODO RUN
// 3.INSTANCIAR LA CLASE CREADA Y ALMACENAR LA INSTANCIA EN VARIABLE DE TIPO RUNNABLE
// 4.CREAR INSTANCIA DE LA CLASE THREAD PASANDO COMO PARAMETRO AL CONSTRUCTOR DE THREAD EL OBJETO RUNNABLE
// 5.PONER EN MARCHA EL HILO DE EJECUCION CON EL METODO START() DE LA CLASE THREAD

