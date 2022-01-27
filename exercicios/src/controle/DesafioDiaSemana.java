package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		// Domingo -> 1
		// Quarta -> 4
		// terça -> 3 e assim sucessivamente. Criar um scanner, pegar
		// o nome da semana e retornar o numero associado ao dia.

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva o dia da Semana");
		String diaSemana = entrada.next();

		if (diaSemana.equals("segunda")) {
			System.out.println("2");
		} else if (diaSemana.equals("terça")) {
			System.out.println("3");
		} else if (diaSemana.equals("quarta")) {
			System.out.println("4");
		} else if (diaSemana.equals("quinta")) {
			System.out.println("5");
		} else if (diaSemana.equals("sexta")) {
			System.out.println("6");
		} else if (diaSemana.equals("sabado")) {
			System.out.println("7");
		} else if (diaSemana.equals("domingo")) {
			System.out.println("1");
		}

		entrada.close();
	}
}
