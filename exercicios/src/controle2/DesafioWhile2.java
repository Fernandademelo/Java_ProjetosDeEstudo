package controle2;

import java.util.Scanner;

public class DesafioWhile2 {
	public static void main(String[] args) {

//      usuario digita nota 0-10 , nota valida, se vai
//		armazenar as notas em
//		uma var TOTAl e uma nota nota vai acrecentar na total e somando,
//		e outra var pra dizer quantas notas foram digitadas.. 
//		e a media (SOMA, TOTAL DE NOTAS E MEDIA) e botao sair.
//	

		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.print("Informe a Nota: ");
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0)
				total += nota;
			quantidadeDeNotas++;
		}

		// calcular a media
		double media = total / quantidadeDeNotas;
		System.out.println("Media= " + media);

		entrada.close();

	}
}
