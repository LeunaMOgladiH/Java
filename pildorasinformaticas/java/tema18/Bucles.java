package tema18;

import javax.swing.JOptionPane;

public class Bucles {

	public static void main(String[] args) {

		String clave = "Manuel";

		String pass = "";

		while (clave.equals(pass) == false) {

			pass = JOptionPane.showInputDialog("Introduce la contraseņa ");

			if (pass.equals(pass) == false) {
				System.out.println("Contraseņa incorrecta");
			}

		}

		System.out.println("Contraseņa correcta, Bienvenido !");
	}

}
