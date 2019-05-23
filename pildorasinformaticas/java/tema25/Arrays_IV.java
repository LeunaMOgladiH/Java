package tema25;

public class Arrays_IV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matriz=new int[3][4];
		
		matriz[0][0]=12; // FILA / COLUMNA
		matriz[0][1]=45;
		matriz[0][2]=-5;
		matriz[0][3]=24;
		
		matriz[1][0]=30;
		matriz[1][1]=1;
		matriz[1][2]=-2;
		matriz[1][3]=82;
		
		matriz[2][0]=52;
		matriz[2][1]=43;
		matriz[2][2]=-11;
		matriz[2][3]=33;
		
		for(int i=0;i<3;i++){ // Bucles anidado
			
			System.out.println();
			
			for(int j=0;j<4;j++){
				
				System.out.print(matriz[i][j]+" ");
			}
		}

	}

}
