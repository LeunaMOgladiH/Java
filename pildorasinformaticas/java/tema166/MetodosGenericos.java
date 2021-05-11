package tema166;

public class MetodosGenericos {


	public static void main(String[] args) {

		String nombres[]= {"Jose","Pepe","Maria"};
		
		System.out.println(MisMatrices.getMenor(nombres));
		
		String elementos=MisMatrices.getElementos(nombres);
		
		System.out.println(elementos);
		
		Empleado listaEmpleados[]= {new Empleado("Ana",45,2500),
				
				new Empleado("Carlos",23,2500),
				
				new Empleado("Pedro",35,2500),
				
				new Empleado("Lucia",12,2500),
		};
		
		System.out.println(MisMatrices.getElementos(listaEmpleados));
		
		//Como todos los objetos de la clase listaEmpleados no implementan la clase comparteTo nos da error, otros metodos como String,GregoprianCalendar,etc... no daria el error
		
		System.out.println(MisMatrices.getMenor(listaEmpleados)); 

	}

}

class MisMatrices{ //Nos va a devolver un String, la longitud o numero de elementos frdel Array
	
	public static<T> String getElementos(T[]a) { //Metodo Generico con nombre getElementos y que recibira ARRAYS
		
		return "El array tiene "+a.length+" elementos";
		
	}
	
	public static <T extends Comparable> T getMenor(T[]a) { //Extends Comparable ya que todos los argumentos que pasen al metodo compareTO debecumpli
		
		if(a==null||a.length==0) { // Si el Array es nulo o 0 dame nulo
			
			return null;
			
		}
			
			T elementoMenor=a[0];
			
			for(int i=1;i<a.length;i++) { //empezamos a recorrer el Array desde 1 pues ya tenemos almacenado el 0 en la linea superior
			
				if(elementoMenor.compareTo(a[i])>0) { // lo objetos de este metodo debe implementar la interfaz Comparable, y para ello T debe extends Comparable
					
					
					elementoMenor=a[i];
				}
		}
			
			return elementoMenor;
	}
	
}


