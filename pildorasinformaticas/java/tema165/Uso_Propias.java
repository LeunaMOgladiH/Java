package tema165;

public class Uso_Propias {

	public static void main(String[] args) {

		Clases_Propias<String> una=new Clases_Propias<String>();
		
		una.setPrimero("Antonio");	// Vamos a darla unvalor diferente a null que es el valor de "primero", lo importante de usar clases genericas, es que como Clases_Propias esta definida de forma generica,
									// al crear un constructo STRING, el se de adapta y sin crear nada mas puedo usar la clase, por lo que el constructor Clases_Propias puedes reusarlo en todos los programas que quieras
		
		System.out.println(una.getPrimero());
		
		Persona pers1=new Persona("Ana"); // Hemos instanciado de la clase Persona
		
		Clases_Propias<Persona> otra=new Clases_Propias<Persona>(); //Creamos un Array instanciando de Persona
		
		otra.setPrimero(pers1); // La clase generica se adapata al tipo y SET. pide un objeto de tipo persona
		
		System.out.println(otra.getPrimero()); 
		// Del mismo modo ahora el GET. se adapta para devolver un obejeto del tipo persona, si queremos el ver el nombre del objeto, podemos usar el metodo TOSTRING para devolver el objeto que esta grabado dentro
		
	}

}

class Persona{
	
	public Persona(String nombre) {
		
		this.nombre=nombre;
		
	}
	
	/*public String toString() {
		
		return nombre;
		
	}*/
	
	private String nombre;
	
}
