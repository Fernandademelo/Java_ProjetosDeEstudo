package fundamentos.exerciciosfimdomodulo;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Indique seu Peso: ");
		String peso = entrada.next().replace(",", ".");
		Double pesoDouble = Double.parseDouble(peso); 
		
		System.out.print("Indique sua Altura: ");
		String altura = entrada.next().replace(",", ".");
		Double alturaDouble = Double.parseDouble(altura); 
		
		
		double imc = pesoDouble / (alturaDouble * alturaDouble);
		
		System.out.printf("Seu IMC é de %.2f", imc);
		
		
		
		entrada.close();
	}
}
