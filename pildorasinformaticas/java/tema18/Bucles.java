package tema18;

import javax.swing.JOptionPane;

public class Bucles {

	public static void main(String[] args) {

		String clave = "Manuel";

		String pass = "";

		while (clave.equals(pass) == false) {

			pass = JOptionPane.showInputDialog("Introduce la contrase�a ");

			if (pass.equals(pass) == false) {
				System.out.println("Contrase�a incorrecta");
			}

		}

		System.out.println("Contrase�a correcta, Bienvenido !");
	}

}
