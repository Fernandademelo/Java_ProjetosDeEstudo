package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (v ou f)
		// Trabalho na quinta (v ou f)
		// se apenas um trabalho der certo tv de 32, se os dois 50, qq tv comprada tomar
		// sorvete, porem se nenhum trabalho der certo familia fica em casa.

//	boolean trab1 = true;
//	boolean trab2 = true;

		System.out.println("------COMPRAR OU NÃO AS TVS?------");

		String tvgrande = "Comprei a TV Grande de 50 polegadas! ";
		String tvpequena = "Comprei a TV Pequena de 32 pol.";
		String sorvetinho = " Mmm comprei Sorvetinho! ";

		Scanner entrada = new Scanner(System.in);
		System.out.println("Você realizou o Primeiro Trabalho? [Y/N]");
		String trabalho1 = entrada.nextLine().replace("y", "true").replace("Y", "true").replace("n", "false")
				.replace("N", "false"); // pra rtocar s e n por
										// valores booleanos, porem
										// ainda em string
		Boolean trab1 = Boolean.parseBoolean(trabalho1); // aqui devidamente passando a boolean

		System.out.println("Você realizou o Segundo Trabalho? [Y/N]");
		String trabalho2 = entrada.nextLine().replace("y", "true").replace("Y", "true").replace("n", "false")
				.replace("N", "false");

		Boolean trab2 = Boolean.parseBoolean(trabalho2);

		if (trab1 && trab2) {
			System.out.println(tvgrande + sorvetinho);
		} else if (trab1 || trab2) {
			System.out.println(tvpequena + sorvetinho);
		} else {
			System.out.println("Infelizmente não pude comprar TV, mas" + sorvetinho);
		}

		entrada.close();

	}
}
