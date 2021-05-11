package tema167;

public class Pareja<T> {
	
	public Pareja() {
		
		primero=null;
		
	}
	
	public void setPrimero(T nuevoValor) {
		
		primero=nuevoValor;
	
	}
	
	public static void imprimirTrabajador(Pareja<? extends Empleado> p){ // "? extends" nos permite que podamos usar subclases que herede de Empleado
		
		Empleado primero=p.getPrimero();
		
		System.out.println(primero);
		
		
	}
	
	public T getPrimero() {
		
		return primero;
		
	}
	
	private T primero;

}
