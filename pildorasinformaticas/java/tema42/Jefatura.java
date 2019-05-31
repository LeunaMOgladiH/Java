package tema42;

import tema39.Trabajador;

public class Jefatura extends Trabajador{
	
		public Jefatura(String nom, double sue, int agno, int mes, int dia) {

			super(nom, sue, agno, mes, dia); // al ser un constructor con parametros, debemos llamar al constructor
												// PADRE con los parametros que queremos pasar

		}

		public void estableceIncentivo(double b) {

			incentivo = b;
		}

		public double damesueldo() {

			double sueldoJefe = super.damesueldo(); //

			return sueldoJefe + incentivo;
		}

		private double incentivo;

	}



