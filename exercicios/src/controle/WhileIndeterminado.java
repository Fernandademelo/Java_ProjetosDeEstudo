package controle;

import java.util.Scanner;

public class WhileIndeterminado {
public static void main(String[] args) {


 Scanner entrada = new Scanner(System.in);
	
 String valor = ""; // string vazia apra receber o valor logo
 
 while(!valor.equalsIgnoreCase("sair")) {
	 System.out.println("Voce diz: ");
	 valor = entrada.nextLine(); //a string vazia recebe o valor da entrada
 }
 
 
	entrada.close();
}
}
