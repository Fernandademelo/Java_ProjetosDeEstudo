package controle2;

import java.util.Scanner;

public class doWhile2 {
	public static void main(String[] args) {

// if (...) sentencia; ou {}
// while(...) sentenca; ou {}
// for(...;...;...) sentenca; ou {}
//do sentenca; ou {} while(...);

	Scanner entrada = new Scanner(System.in);
	
	String texto = "por favor";
			
	do {System.out.println("VOCE PRECISA FALAR" + "\nAS PALAVRAS MAGICAS");
	System.out.println("Quer sair?");
	texto = entrada.nextLine();
	
	} while (!texto.equalsIgnoreCase("por favor"));
	

System.out.println("Thanks!");
	entrada.close();
	}
}
