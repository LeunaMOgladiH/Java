package tema39;

import java.security.IdentityScope;
import java.util.Date;
import java.util.GregorianCalendar;

import tema36.Empleados;
import tema42.Jefatura;

// Al implementar en el tema 49 la interfaz de Array.sort, tenemos que construir el metodo CompareTo
public class Trabajador implements Comparable{
	
	public int compareTo(Object miObjeto) {
		
	//Tenemos que hacer un CASTING o REFUNDICION para poder comparar sueldos,Id, etc... de empleados
		
		Trabajador otroTrabajador=(Trabajador) miObjeto;
		
		if(this.id<otroTrabajador.id) {
			
			return -1;
		}
		
		if(this.id>otroTrabajador.id) {
			
			return 1;
		}
		
		return 0;

	}

	private String nom;
	private double sue;
	private Date altacontrato;
	private int id;
	private static int idsig=1;

	public Trabajador(String nom, double sue, int agno, int mes, int dia) {

		this.nom = nom;
		this.sue = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

		altacontrato = calendario.getTime();
		id=idsig;
		++idsig;

	}

	public Trabajador(String nom) {

		// this.nom=nom; //varios constructores con el mismo nombre pero con distintas
		// caracteristicas, es una sobrecarga de constructores

		this(nom, 30000, 2010, 05, 20); // llama al constructo de igual nombre y añade los valores que son constantes
										// y llamaria evidentemente al constructo de igual nombre que pide el mismo
										// numero de parametros. Denominada Sobrecarga de constructores
	}

	public String damenombre() {

		return nom+" Id: "+id;
	}

	public double damesueldo() {

		return sue;
	}

	public Date damecontrato() {

		return altacontrato;

	}

	public void subesueldo(double porcentaje) {

		double aumento = sue * porcentaje / 100;

		sue += aumento;
	}
	

}
