package tema36;

public class Empleados {
	
	public Empleados(String nom) {
		
		this.nom=nom;
		
		seccion="Administracion";
		
	}
	
	private final String nom; //final creara de la variable nom una constante invariable
	
	private String seccion;
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
	}
	
	public String devuelveDatos() {
		
		return "El nombre es "+nom+" y la seccion es "+seccion;
	}

}
