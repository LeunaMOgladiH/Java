package tema167;

public class HerenciaGenericos {

	public static void main(String[] args) {

	/*  Empleado Administrativa=new Empleado("Elena",45,1500);
		
		Jefe DirectorComercial=new("Ana",27,3500);
		
		Empleado nuevoEmpleado=DirectorComercial; */ //Como DirectorGeneral es un Empleado, podemos heredar usan "Si es un...
		
		Pareja<Empleado>Administrativa=new Pareja<Empleado>();
		
		Pareja<Jefe>DirectoraComercial=new Pareja<Jefe>();
		
		//Pareja<Empleado>nuevoEmpleado=DirectoraComercial; //Esto no lo podemos realizar con los metodos Genericos, tenemos que usar tipos comodin

		Pareja.imprimirTrabajador(Administrativa); //Como Administrativa es del metodo Empleado e imprimirTrabajdor es de la clase Empleador no hay poblema
		
		Pareja.imprimirTrabajador(DirectoraComercial); //Nos da error pues no se puede heredar. Vemos en Pareja que hemos añadido ?extends para poder heredar de subclases
		
	}

}
