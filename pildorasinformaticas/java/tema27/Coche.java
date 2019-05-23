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

	public String dame_largo() {  //GETTER

		return "La longitud del coche es " + largo + " mm";

	}

	public void establece_color() {  //SETTER

		color = "azul";
	}
	
	public String dame_color() {
		
		return "El color del coche es "+color;
	}

}
