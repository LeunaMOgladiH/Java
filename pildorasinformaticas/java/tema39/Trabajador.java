package tema39;

import java.util.Date;
import java.util.GregorianCalendar;

public class Trabajador {

	private String nom;
	private double sue;
	private Date altacontrato;

	public Trabajador(String nom, double sue, int agno, int mes, int dia) {

		this.nom = nom;
		this.sue = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

		altacontrato = calendario.getTime();
	}

	public Trabajador(String nom) {

		// this.nom=nom; //varios constructores con el mismo nombre pero con distintas
		// caracteristicas, es una sobrecarga de constructores

		this(nom, 30000, 2010, 05, 20); // llama al constructo de igual nombre y añade los valores que son constantes
										// y llamaria evidentemente al constructo de igual nombre que pide el mismo
										// numero de parametros. Denominada Sobrecarga de constructores
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

		double aumento = sue * porcentaje / 100;

		sue += aumento;
	}

	class Jefatura extends Trabajador {

		public Jefatura(String nom, double sue, int agno, int mes, int dia) {

			super(nom, sue, agno, mes, dia); // al ser un constructor con parametros, debemos llamar al constructor
												// PADRE con los parametros que queremos pasar

		}

		public void estableceIncentivo(double b) {

			incentivo = b;
		}

		public double damesueldo() {

			double sueldoJefe = super.damesueldo();

			return sueldoJefe + incentivo;
		}

		private double incentivo;

	}

}
