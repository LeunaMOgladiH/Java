package tema48;

public class Uso_Tallas1 {
		
	enum Talla1{
		
		MINI("S"),MEDIANA("M"),GRANDE("L"),MUYGRANDE("XL");
			
		private Talla1(String abreviatura) { //LOS CONSTRUCTORES SIEMPRE SERAN PRIVATE PARA QUE NO PUEDAN SER INVOCADOS DESDE FUERA DE LA CLASE
				
			this.abreviatura=abreviatura;
		}
			
		private String abreviatura;
	}
		

	public static void main(String[] args) {
			// TODO Auto-generated method stub

	}

}
