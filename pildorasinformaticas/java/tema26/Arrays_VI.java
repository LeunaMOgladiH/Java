package tema26;

public class Arrays_VI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]matriz={
				{10,15,25,84},
				{12,-9,74,45,10},
				{56,9,-8,1,8}
		};
		
		for(int[] fila:matriz){
			System.out.println();
			for(int columna:fila){
				
				System.out.print(columna+" ");
			}
		}
		
	}

}