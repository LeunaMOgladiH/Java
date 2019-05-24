package tema33;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

	private String nom;
	private double sue;
	private Date altacontrato;

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

			
		this.nom=nom;
		this.sue=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
		
		altacontrato=calendario.getTime();
	}
	
	public String damenombre() {
		
		return nom;
	}
	
	public double damesueldo() {
		
		return sue;
	}
	
	public Date damecontrato() {
		
		return altacontrato;
		
	}
	
	public void subesueldo(double porcentaje) {
		
		double aumento=sue*porcentaje/100;
		
		sue+=aumento;
	}

}
