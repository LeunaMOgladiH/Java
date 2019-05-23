package tema23;

public class Arrays {

	public static void main(String[] args) {

		int[] matriz = new int[5];

		matriz[0] = 5;
		matriz[1] = 15;
		matriz[2] = 51;
		matriz[3] = -54;
		matriz[4] = 35;

		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de la posicion "+i+" es "+matriz[i]);
			
		}
		
		System.out.println("");
		int[]matriz2= {5,15,51,-54,35,67,45,89,0,12,4};
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println("Valor de la posicion "+i+" es "+matriz2[i]);
			
		}
		

	}
}
