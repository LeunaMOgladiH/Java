package tema173_174_175_176;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSinc {

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
	
	public void transferencia(int cuentaOrigen,int cuentaDestino,double cantidad) {
		
		cierreBanco.lock();
		
		try { //Tenemos que crear el try, cuyo contenido quedara bloqueado mientras el hilo este activo, para que no haya dos hilos funcionando a la vez
		
		//Tenemos que controlar que antes de realizar una transferencia tiene que haber saldo para ello
		
		if(cuentas[cuentaOrigen]<cantidad) {
			
			System.out.println("Dinero Insuficiente en la cuenta: "+cuentaOrigen+" para transferir "+cantidad+" con Saldo: "+cuentas[cuentaOrigen]); //Si una cuenta no tiene suficiente saldo, que no imprima cual es, para buscar errores de programacion
			
			return; //Si el Hilo no tiene dinero para ingresar, avisaria a return y ese Hilo se pierde
			
		}else {
			
			System.out.println("Dinero Suficiente para la transferencia desde "+cuentaOrigen);
			
		}
		
		//Imprimimos el hilo que realiza la transferencia
		 
		System.out.println(Thread.currentThread());
		
		cuentas[cuentaOrigen]-=cantidad; //restamos la cantidad de cuentaOrigen
		
		System.out.printf("%10.2f de %d para %d ",cantidad,cuentaOrigen,cuentaDestino); //Cantidad de dos decimales %10.2f de cuentaOrigen a cuentaDestino
		
		cuentas[cuentaDestino]+=cantidad;
		
		System.out.printf("El saldo total: %10.2f%n",getSaldoTotal());
		
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
