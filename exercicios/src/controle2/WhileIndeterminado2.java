package controle2;

import java.util.Scanner;

public class WhileIndeterminado2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String resposta = "";

		while (!resposta.equalsIgnoreCase("sair")) {
			System.out.println(" o que deseja: ");
			resposta = entrada.nextLine();
		}
		System.out.println("fim");

		entrada.close();

	}
}
