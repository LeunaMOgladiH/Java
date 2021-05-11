package tema165;

public class Clases_Propias<T> {

	// Las clases genericas por convencion se suelen definir con las letras T, U, K
	
	public Clases_Propias() {
		
		primero=null;
	}

	public void setPrimero(T nuevoValor) { //Creamos un metodo setter
		
		primero=nuevoValor;
		
	}
	
	public T getPrimero() {
		
		return primero;
		
	}
		
		private T primero; // variable
		
	}


