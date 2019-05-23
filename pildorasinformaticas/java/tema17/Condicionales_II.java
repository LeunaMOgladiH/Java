package tema17;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condicionales_II {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"La superficie de que figura quiere calcular: \n \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circunferencia ");

		int figura = entrada.nextInt();

		switch (figura) {

		case 1:

			int lado;

			lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

			System.out.println("El area del cuadrado es " + Math.pow(lado, 2));

			break;

		case 2:
			int base, altura;
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado mayor"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado menor"));

			System.out.println("el area del rectangulo es " + base * altura);
			break;

		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introducela altura"));

			System.out.println("el area del triangulo es " + (base * altura) / 2);
			break;
		case 4:
			int radio;

			radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));

			System.out.println("el area de la circunferencia es " + Math.pow(radio, 2) * Math.PI);
			break;

		default:
			System.out.println("La opcion no es correcta");
		}

	}

}
