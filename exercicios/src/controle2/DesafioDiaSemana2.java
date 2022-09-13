package controle2;

import java.util.Scanner;

public class DesafioDiaSemana2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(" Escreva o dia: ");
		
		String dia = entrada.next();
		
		if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println("2");
		} else if ("terça".equalsIgnoreCase(dia) 
				|| "terca".equalsIgnoreCase(dia)) {
			System.out.println("3");
		}else if (dia.equalsIgnoreCase("terça")) {
			System.out.println("3");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		} else if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		entrada.close();
	}
}}
