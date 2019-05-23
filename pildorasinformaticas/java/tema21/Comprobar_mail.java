package tema21;

import javax.swing.JOptionPane;

public class Comprobar_mail {

	public static void main(String[] args) {

		boolean arroba = false;

		String mail = JOptionPane.showInputDialog("Introduzca el mail ");

		for (int i = 0; i < mail.length(); i++) {

			if (mail.charAt(i) == '@') {

				arroba = true;

			}

		}

		if (arroba == true) {

			System.out.println("Su email es correcto");
		} else {

			System.out.println("Su mail no es correcto");
		}

	}

}
