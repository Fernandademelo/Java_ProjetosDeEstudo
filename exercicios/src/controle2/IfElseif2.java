package controle2;

import java.util.Scanner;

public class IfElseif2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("dIGITE A nOTA: ");
		
		double nota = entrada.nextDouble();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota Invalida");
		} else if (nota > 8.1) {
			System.out.println("Conceito A");
		} else if (nota > 6.1) {
		System.out.println("Conceito B");
		}  else if (nota > 4.1) {
		System.out.println("Conceito C");
		} else {
			System.out.println("ah bue");
		}
	System.out.println("FIM");
		entrada.close();
		}
}
