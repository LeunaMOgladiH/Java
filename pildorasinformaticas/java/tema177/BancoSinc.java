package tema177;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinc {

	public static void main(String[] args) {

		Banco b=new Banco();
		
		for(int i=0;i<100;i++) {
			
			EjecucionTransferencia r=new EjecucionTransferencia(b, i, 2000);
			
			Thread t=new Thread(r);
			
			t.start();
			
		}

	}

}

class Banco{
	
	//Tenemos que crear 100 cuentas con 200€
	//Las cuentas seran identificadas con un solo digito
	
	public Banco() {
		
		cuentas=new double[100];
		
		for(int i=0;i<cuentas.length;i++) {
			
			cuentas[i]=2000;
		}
		
		saldoSuficiente=cierreBanco.newCondition(); //Que cierreBanco debe funcionar bajo la premisa de saldoSuficiente, es una forma de poner condicionales para los bloqueos LOCK
		
	}
	
	public void transferencia(int cuentaOrigen,int cuentaDestino,double cantidad) throws InterruptedException {
		
		cierreBanco.lock();
		
		try { //Tenemos que crear el try, cuyo contenido quedara bloqueado mientras el hilo este activo, para que no haya dos hilos funcionando a la vez
		
		//Tenemos que controlar que antes de realizar una transferencia tiene que haber saldo para ello
		
		while(cuentas[cuentaOrigen]<cantidad) { //Vamos a transformar el bucle If por un While y ademas vamos a eliminar la opcion RETURN para que los hilos no se pierdan
			
			//return; //Si el Hilo no tiene dinero para ingresar, avisaria a return y ese Hilo se pierde
		
			saldoSuficiente.await();  //Ponemos el hilo a la espera, el problema es que este metodo lanza un Exception del tipo Interrupted, asi que tenemos que tenemos que lanzar una declaracion, que nos la hace Eclipse
			
		}
		
		//Imprimimos el hilo que realiza la transferencia
		 
		System.out.println(Thread.currentThread());
		
		cuentas[cuentaOrigen]-=cantidad; //restamos la cantidad de cuentaOrigen
		
		System.out.printf("%10.2f de %d para %d ",cantidad,cuentaOrigen,cuentaDestino); //Cantidad de dos decimales %10.2f de cuentaOrigen a cuentaDestino
		
		cuentas[cuentaDestino]+=cantidad;
		
		System.out.printf("El saldo total: %10.2f%n",getSaldoTotal());
		
		saldoSuficiente.signalAll(); //Despierta a todos los hilos que estan a la espera, para que no se queden bloqueados eternamente y por tanto todos los hilos realizan la transferencia cuando puedan
		
		}finally { //Si ocurre o no una excepcion, entonces libera el metodo cierreBanco
			
			cierreBanco.unlock();
			
		}
		
	}
	
	//Con este metodo estamos sumando todos los valores de cada una de las cuentas.
	
	public double getSaldoTotal() {
		
		double suma_cuentas=0;
		
		for(double a:cuentas) {
			
			suma_cuentas+=a;
			
		}
		
		return suma_cuentas;
		
	}
	
	private final double[]cuentas;
	
	//Clase para poder para un hilo, como un semaforo hasta que se acabe otro hilo en espera
	
	private Lock cierreBanco=new ReentrantLock();
	
	private  Condition saldoSuficiente;
	
}

class EjecucionTransferencia implements Runnable{
	
	public EjecucionTransferencia(Banco b,int de,double max) {
		
		banco=b;
		deLaCuenta=de;
		cantidadMax=max;
		
	}

	public void run() {

		while(true) {
			
			try {
				
			int paraLaCuenta=(int)(100*Math.random());
			
			double cantidad=cantidadMax*Math.random();
			
			banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);

				Thread.sleep((int)(Math.random()*100));
				
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
	}
	
	private Banco banco;
	
	private int deLaCuenta;
	
	private double cantidadMax;
	
	
}
