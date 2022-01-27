package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("informe o número: ");
		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		// if(numero % 2 == 0) {
		// System.out.println("Numero par");
		// }

		// if(numero % 2 == 1) {
		// System.out.println("Numero impar");
		// }
	}
}
