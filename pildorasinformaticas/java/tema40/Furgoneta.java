package tema40;

import tema27.Vehiculo; //tenemos que importar Coche para poder usar la extension 

public class Furgoneta extends Vehiculo { // Furgoneta es la clase HIJO de Coche y por tanto hereda todas las
										// caracteristicas de Coche que es la clase PADRE

	private int capacidad_carga;

	private int plazas_extras;

	public Furgoneta(int plazas_extra, int capacidad_carga) { // Constructor

		super(); // llama al constructor de la clase PADRE, y por tanto le damos las
					// caracteristicas del constructor de Coche()

		this.capacidad_carga = capacidad_carga;
		this.plazas_extras = plazas_extra;
	}

	public String dimeDatosFurgoneta() {

		return "La capcidad de carga es: " + capacidad_carga + "kg" + " y sus plazas son: " + plazas_extras;
	}
}

//A la hora de crear las herencias, hay una regla denominada "ES UN...". Furgoneta es un coche ?? No, Esta herencia no esta bien diseñada, deberiamos renombrar Coche como Vehiculo, asi tendria logica
