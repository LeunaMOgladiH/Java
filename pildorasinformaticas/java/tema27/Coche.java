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

	public String dame_datos() {  //GETTER

		return "La longitud del coche es " + largo/1000 + " m, tiene "+ruedas+" ruedas, un ancho de "
				+ancho/100+" m, un motor de "+motor+"  cc y tiene un peso de plataforma "+peso_plataforma+ "kg";

	}

	public void establece_color(String color_coche) {  //SETTER

		color =color_coche;
	}
	
	public String dame_color() {
		
		return "El color del coche es "+color;
	}
	
	public void config_asientos(String asientos_cuero) {
		
		if(asientos_cuero=="si") {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}; //a las variables se le pone this. para distinguirlos
		

				
			
		
	}

}
