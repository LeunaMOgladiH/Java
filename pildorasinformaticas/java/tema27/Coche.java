package tema27;

public class Coche {

	private int ruedas;

	private int largo;

	private int ancho;

	private int motor;

	private int peso_plataforma;

	private String color;

	private int peso_total;

	private boolean asientos_cuero;

	private boolean climatizador;

	public Coche() {

		ruedas = 4;

		largo = 2000;

		ancho = 300;

		motor = 1600;

		peso_plataforma = 500;
	}

	public String dame_datos() { // GETTER

		return "La longitud del coche es " + largo / 1000 + " m, tiene " + ruedas + " ruedas, un ancho de "
				+ ancho / 100 + " m, un motor de " + motor + "  cc y un peso de plataforma " + peso_plataforma + "kg";

	}

	public void establece_color(String color_coche) { // SETTER

		color = color_coche;
	}

	public String dame_color() {

		return "El color del coche es " + color;
	}

	public void config_asientos(String asientos_cuero) {

		if (asientos_cuero.equalsIgnoreCase("si")) { //Siempre para comparar cadenas strings hay que usar siempre equalsIgnoreCase
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
		; // a las variables se le pone this. para distinguirlos

	}

	public String dame_asiento() {

		if (asientos_cuero == true) {

			return "El auto lleva asiento de cuero";
		} else {

			return "El auto no lleva asiento de cuero";
		}
	}

	public void config_climatiza(String climatizador) {

		if (climatizador.equalsIgnoreCase("si")) {

			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public String dame_climatiza() {

		if (climatizador == true) {

			return "El coche incorpora climatizador";
		} else {
			return "El coche incorpora aire acondicionado";
		}
	}

	public String dame_peso() { // Tratar de no hacerlo, es un GETTER y SETTER combinado.

		int peso_carroceria = 500;

		peso_total = peso_plataforma + peso_carroceria;

		if (asientos_cuero == true) {

			peso_total += 50;
		}
		if (climatizador == true) {

			peso_total += 20;
		}

		return "El peso total del coche es " + peso_total + " kg";
	}

	public int dame_precio() {

		int preciofinal = 10000;

		if (asientos_cuero == true) {

			preciofinal += 2000;
		}
		if (climatizador == true) {

			preciofinal += 1500;
		}

		return preciofinal;
	}

}
