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
			System.out.println("Infelizmente não pude comprar TV, ficamos em casa! ");
		}

		entrada.close();

		System.out.println("___RESOLUÇÃO DO PROFESSOR___");

		boolean traabalho1 = true;   //aqui troca para ver os resultados
		boolean traabalho2 = true;
		
		
		boolean comprouTV50 = traabalho1 && traabalho2;
		boolean comprouTV32 = traabalho1 ^ traabalho2;
		boolean comprouSorvete = traabalho1 || traabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"?" + comprouTV50);
		System.out.println("Comprou TV 32\"?" + comprouTV32);
		System.out.println("Comprou TV 32\"Sorvete?" + comprouSorvete);

			//OPERADOR UNARIO
		System.out.println("Mais Saudavel? " + maisSaudavel);
	}
}
