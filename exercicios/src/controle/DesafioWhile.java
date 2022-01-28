package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
//usuario digita nota 0-10 , nota valida, se vai
//		armazenar as notas em
//		uma var TOTAl e uma nota nota vai acrecentar na total e somando,
//		e outra var pra dizer quantas notas foram digitadas.. 
//		e a media (SOMA, TOTAL DE NOTAS E MEDIA) e botao sair.
//	
		
		Scanner entrada = new Scanner(System.in);
		
		int totalDeNotas = 0;
		int contador = 0;
		int nota =0;
		
		while((nota >= 0) && (nota <=10) ) {
			
			System.out.println("Digite suas notas, ao terminar digite -1 ");
			nota = entrada.nextInt();
			totalDeNotas += nota;
			contador ++;
			
		}
		
		System.out.println("A soma das notas é: " + totalDeNotas);
		System.out.println("A quantidade de notas é " + contador);
		System.out.println("A média é :" + totalDeNotas/contador);
		
		entrada.close();
		
	}
}
// esse programa possui bugs, nao esta completo, apenas teste