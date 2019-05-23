package tema18;

import javax.swing.JOptionPane;

public class Bucles {

	public static void main(String[] args) {

		String clave = "Manuel";

		String pass = "";

		while (clave.equals(pass) == false) {

			pass = JOptionPane.showInputDialog("Introduce la contraseña ");

			if (pass.equals(pass) == false) {
				System.out.println("Contraseña incorrecta");
			}

		}

		System.out.println("Contraseña correcta, Bienvenido !");
	}

}
