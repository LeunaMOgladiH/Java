package tema16;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca su edad ");

		int edad = entrada.nextInt();

		if (edad < 18) {

			System.out.println("Usted es menor de edad ");
		} else if (edad < 30) {
			System.out.println("Usted es un adulto ");
		} else {
			System.out.println("Cuidate mucho, abuelo");
		}
	}

}
