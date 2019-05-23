package tema27;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche Renault=new Coche();
		
		Renault.establece_color("marron");
		
		Renault.config_climatiza("si");
		
		Renault.config_asientos("no");
		
		System.out.println(Renault.dame_datos());
		
		System.out.println(Renault.dame_color());
		
		System.out.println(Renault.dame_climatiza());
		
		System.out.println(Renault.dame_asiento());
		
		System.out.println(Renault.dame_peso());
		
		System.out.println("El precio total del coche es "+Renault.dame_precio()+" €");

	}

}
