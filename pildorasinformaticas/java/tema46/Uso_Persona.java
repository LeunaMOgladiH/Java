package tema46;

public class Uso_Persona {
	
	public static void main(String[] args) {
		
		
	}

}

abstract class Persona{
	
	public Persona(String nom) {
		
		nombre=nom;
	}
	
	public String dameNombre() {
		
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
}

class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
		
		altaContrato=calendario.get.getTime();
		
		++IdSiguiente;
		
	}
	
	public String dameDescripcion() {
		
		return "Este empleado tiene un Id: "+Id+" con un sueldo de: "+sueldo
	}
	
	public double dameSueldo() {
		
		return sueldo;
	}
}