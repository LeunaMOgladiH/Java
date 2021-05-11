package tema163;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteradores {

	public static void main(String[] args) {
		
	//Vamos a poder buscar hacia adelante y hacia atras un Array de datos
	
		ArrayList <Empleado> listaEmpleado=new ArrayList<Empleado>(); // Este Array se ha designado que usara solo elementos del tipo <EMPLEADO> en caso contrario daria error 
		
		listaEmpleado.add(new Empleado("Ana",45,2500));
		
		listaEmpleado.add(new Empleado("Antonio",55,3500));
		
		listaEmpleado.add(new Empleado("Vicente",25,2200));
		
		listaEmpleado.add(new Empleado("Mario",47,2800));
		
		listaEmpleado.add(new Empleado("Ana",45,2500));
		
		listaEmpleado.set(1, new Empleado("Laura", 22, 2700)); 	
		
		Iterator<Empleado> mi_iterador=listaEmpleado.iterator();
		
		while(mi_iterador.hasNext()) {
			
			System.out.println(mi_iterador.next().dameDatos()); // NEXT() recorre el ArrayList pero tenemos que usar dameDAtos para qu eno den los valosres, sino , nos dria solamente los elementos Empleado@******* 
						
		}

	}

}

class Empleado{
	
	public Empleado(String nombre,int edad,double salario) {
	
	this.nombre=nombre;
	
	this.edad=edad;
	
	this.salario=salario;
	
	}
	
	public String dameDatos() {
		
		return"El empleado se llama "+nombre+" tiene "+edad+" años. Y un salario "+salario;
		
	}
	
	private String nombre;
	
	private int edad;
	
	private double salario;
	
}
