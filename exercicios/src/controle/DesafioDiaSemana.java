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

		if (diaSemana.equalsIgnoreCase("segunda")) {  
			System.out.println("2");
		} else if (diaSemana.equalsIgnoreCase("terça")) {
			System.out.println("3");
		} else if (diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (diaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (diaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (diaSemana.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		} else if (diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		}
		//equalsIgnoreCase("domingo")
				//verifica se a String é igual, ignorando letras maiusculas/minusculas diferentes.
		entrada.close();
		
		
	}
}
