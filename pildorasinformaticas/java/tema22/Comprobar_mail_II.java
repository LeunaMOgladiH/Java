package tema22;

import javax.swing.JOptionPane;

public class Comprobar_mail_II {

		public static void main(String[] args) {

			int arroba = 0;
			boolean punto=false;

			String mail = JOptionPane.showInputDialog("Introduzca el mail ");

			for (int i = 0; i < mail.length(); i++) {

				if (mail.charAt(i) == '@') {

					arroba++;

				}
				if (mail.charAt(i)=='.') {
					
					punto=true;
				}

			}

			if (arroba==1 && punto==true) {

				System.out.println("Su email es correcto");
			} else {

				System.out.println("Su mail no es correcto");
			}

		}

	}