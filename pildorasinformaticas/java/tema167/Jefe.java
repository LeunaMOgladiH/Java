package tema167;

public class Jefe extends Empleado{
	
	public Jefe(String nombre,int edad,double salario) {
		
		super(nombre,edad,salario); //llamamos el contructor de la clase padre Empleado
		
	}
	
	double incentivo(double inc) {
		
		return inc;
	}

}
