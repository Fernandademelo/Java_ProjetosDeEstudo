package controle;

import javax.swing.JOptionPane;

public class IfElse2 {
	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe o n�mero: ");
		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("Impar");
		}

	}
}
