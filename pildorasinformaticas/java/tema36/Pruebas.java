package tema36;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trab1=new Empleados("Paco");
		Empleados trab2=new Empleados("Ana");
		Empleados trab3=new Empleados("Antonio");
		
		trab1.cambiaSeccion("RRHH");
		
		System.out.println(trab1.devuelveDatos());
		System.out.println(trab2.devuelveDatos());
		System.out.println(trab3.devuelveDatos());
	}
	
}
