package tema36;

public class Empleados {
	
	public Empleados(String nom) {
		
		this.nom=nom;
		
		seccion="Administracion";
		
		id=idsig;
		idsig++;
		
	}
	
	private final String nom; //final creara de la variable nom una constante invariable
	
	private String seccion;
	
	private int id;
	
	private static int idsig=1;
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
	}
	
	public String devuelveDatos() {
		
		return "El nombre es "+nom+" y la seccion es "+seccion+" y el Id "+id;
	}
	
	public static String dameidsig() {
		
		return "El Id siguiente: "+idsig;
	}

}
