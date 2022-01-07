package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia!\n"); // o \n pula linha, quebra de linha
		
		System.out.println("BOM");
		System.out.println("DIA!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n" , 1, 2, 3, 4, 5, 6); //caracteres especiais para logo depois da virgula subtituir o texto formatdado.
		System.out.printf("Salario: %.1f %n", 1234.6789);
		System.out.printf("Nome: %s %n", "Fernandinha");
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite algo: ");
		String nome = entrada.nextLine();
		System.out.print("Digite algo: ");
		String nome = entrada.nextLine();
		
		System.out.println("Algo é : " + nome);
	}
}
