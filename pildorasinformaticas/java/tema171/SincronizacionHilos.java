package tema171;

public class SincronizacionHilos {

	public static void main(String[] args) {

		HilosVarios hilo1=new HilosVarios();
		
		HilosVarios hilo2=new HilosVarios();
		
		hilo1.start();

		try {
			
			hilo1.join();
			
		} catch (InterruptedException e) {

			e.printStackTrace();
			
		} // Vamos a sincronizar los hilos con el fin de no ejecutar el segundo hilo hasta que se acabe el hilo1
		
		hilo2.start();
		
		try {
			hilo2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		System.out.println("Tareas terminadas"); //Aunque la impresion este tras el hilo2, esta se imporimira aleatoriamente cuanto quiera el hilo
												 //Tendriamos que crear otro join para que se ehecute despues del hilo2

	}

}

class HilosVarios extends Thread{
	
	public void run() {
		
		for(int i=0;i<15;i++) {
			
			System.out.println("Ejecutando hilo "+getName()); //Al no sincronizar los hilos se intercalan entre si, pero sin orden alguno
			
			
			try {
				
				Thread.sleep(700); //creamos una pausa de 700 milisegundos
				
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
	}
	
}