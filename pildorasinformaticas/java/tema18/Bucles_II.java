package tema18;

import java.util.Scanner;

public class Bucles_II {

	public static void main(String[] args) {

		int aleatorio = (int) (Math.random() * 100);

		Scanner entrada = new Scanner(System.in);

		int respuesta = 0;
		int intentos = 0;

		do {

			System.out.println("Que numero estoy pensando? ");
			respuesta = entrada.nextInt();
			intentos++;

			if (respuesta < aleatorio) {
				System.out.println("El numero que pienso es mayor");
			} else if (respuesta > aleatorio) {
				System.out.println("El numero que pienso es menor");
			}

		} while (respuesta != aleatorio);
		System.out.println("Enhorabuena!, has necesitado " + intentos + " intentos");
	}

}
