package fundamentos.exerciciosfimdomodulo;

import java.util.Scanner;

public class CuadradoeCubo {

public static void main(String[] args) {
	//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Escreva o número: ");
	int num = entrada.nextInt();
	
	
	System.out.println(Math.pow(num, 2) + " Seu Numero ao quadrado!");
	System.out.println(Math.pow(num, 3) + " Seu Numero ao cubo!");
	
	entrada.close();
}
}
