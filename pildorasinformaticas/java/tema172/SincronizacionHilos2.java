package tema172;

public class SincronizacionHilos2 {

		public static void main(String[] args) {

			HilosVarios hilo1=new HilosVarios();
			
			HilosVarios2 hilo2=new HilosVarios2(hilo1);
			
			hilo2.start();
		
			hilo1.start();
			
			System.out.println("Tareas terminadas"); //Es la primera instruccion que se ejecuta pues pertenece al metodo main() que queda liberado al sincronizarse los hilos
			
		}

	}

class HilosVarios extends Thread{
	
	public void run() {

		
		for(int i=0;i<15;i++) {
			
			System.out.println("Ejecutando hilo "+getName()); 
			
			
			try {
				
				Thread.sleep(700); //creamos una pausa de 700 milisegundos
				
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
	}
	
}

class HilosVarios2 extends Thread{
	
	public HilosVarios2(Thread hilo) {
		
		this.hilo=hilo;
		
	}
	
	public void run() {
		
		try {
			
			hilo.join();
			
		} catch (InterruptedException e1) {

			e1.printStackTrace();
		}
		
		for(int i=0;i<15;i++) {
			
			System.out.println("Ejecutando hilo "+getName()); //Al no sincronizar los hilos se intercalan entre si, pero sin orden alguno
			
			
			try {
				
				Thread.sleep(700); //creamos una pausa de 700 milisegundos
				
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
	}
	
	private Thread hilo;
	
}