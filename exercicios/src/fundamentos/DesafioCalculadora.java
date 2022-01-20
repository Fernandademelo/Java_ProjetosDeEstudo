package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler num1
		// Ler num 2
		// Qual operacao ele quer fazer ?
		// Fazer a operacao

		
		System.out.println("____________Calculadora____________");


		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Informe o numero: ");
		double num2 = entrada.nextDouble();

		System.out.println("Informe a operacao: ");
		String op = entrada.next();
		
		//logica
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;	
		resultado = "*".equals(op) ? num1 * num2 : resultado;	
		resultado = "/".equals(op) ? num1 / num2 : resultado;	
		resultado = "%".equals(op) ? num1 % num2 : resultado;	
		
	
	     System.out.printf("%.2f %s %.2f = %.2f", 
	    		 num1, op, num2, resultado);
		
	
		


	//System.out.println("Qual o Primeiro Numero da Operação? ");
	//String numLetras1 = entrada.nextLine();
	//	Double num1 = Double.parseDouble(numLetras1);
	//	System.out.println("Qual o Segundo Numero da Operação? ");
	//	String numLetras2 = entrada.nextLine();
	//	Double num2 = Double.parseDouble(numLetras2);

		// System.out.println(num1 + " " + num2);

	//	Double soma = (num1 + num2);
	//	Double subtrair = (num1 - num2);
	//	Double multiplicar = (num1 * num2);
	//	Double dividir = (num1 / num2);
	//	Double modulo = (num1 % num2);


	//	System.out.println("Que operação você deseja realizar? ");
	//	String operLetras = entrada.nextLine();


		entrada.close();

	//System.out.println("A Operação escolhida foi " + soma);

	}
}