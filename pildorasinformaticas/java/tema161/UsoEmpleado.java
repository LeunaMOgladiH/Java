package tema161;

import java.util.ArrayList;

public class UsoEmpleado {

	public static void main(String[] args) {

	/*	Empleado listaEmpleado[]=new Empleado[3]; 

	  	// Al haber 4 elementos del Array pero tan solo se ha dei¡finido 3 elementos, nos dara un error del tipo ArrayIndexOutofBoundException
		// Para ello usaremos ARRAYLIST que es un Array dinamico, por lo que no necesitamos definir inicialmente los elementos que componen el Array
	
		listaEmpleado[0]=new Empleado("Ana",45,2500);
				
		listaEmpleado[1]=new Empleado("Antonio",55,2000);
		
		listaEmpleado[2]=new Empleado("Maria",40,2600);
		
		listaEmpleado[3]=new Empleado("Arturo",30,2800);*/
		
		ArrayList <Empleado> listaEmpleado=new ArrayList<Empleado>();// No permite almacenar datos primigenios, como variables numericas, tendriamos que envolverlos
			
		// listaEmpleado.ensureCapacity(14); // Podemos indicar la cantidad de elementos que va a guardar en el Array, para controlar la cantidad de recursos de memoria
		
		listaEmpleado.add(new Empleado("Ana",45,2500));
		
		listaEmpleado.add(new Empleado("Antonio",55,3500));
		
		listaEmpleado.add(new Empleado("Vicente",25,2200));
		
		listaEmpleado.add(new Empleado("Mario",47,2800));
		
		listaEmpleado.add(new Empleado("Ana",45,2500));
		
		listaEmpleado.set(1, new Empleado("Laura", 22, 2700)); 
		
		//Podemos posicionar el elmento donde queramos con SET, en este caso es 2º
		
		//listaEmpleado.trimToSize();// Para eliminar el exceso de consumo de memoria opdemos usar trimToSize()
		
		System.out.println(listaEmpleado.get(4).dameDatos());
		
		//Podemos recuperar un elemento desde una posicion en este caso el 5º
		
		System.out.println(listaEmpleado.size());
		
		/*for(Empleado e:listaEmpleado) {
			
			System.out.println(e.dameDatos());		
			
		}*/
		
		//Si queremos realizar una busqueda o usar un bucle FOR, ya no podremos usar LENGTH ya que no sabemos cuantos son los elementos que conforman el ARRAY
		
		for(int i=0;i<listaEmpleado.size();i++) {
			
			Empleado e=listaEmpleado.get(i);
			
			System.out.println(e.dameDatos());
			
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

