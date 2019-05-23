package tema24;

public class Array_III {

	public static void main(String[] args) {

		int[]matriz_aleatorios=new int[50];
		
		for(int i=0;i<matriz_aleatorios.length;i++) {
			
			matriz_aleatorios[i]=(int)Math.round(Math.random()*100); //Hacemos una refundicion para convertir el metodo Random que da decimales en enteros
			
					}
		for (int a:matriz_aleatorios) {
			
			System.out.print(a+" ");
		}

	}

}
