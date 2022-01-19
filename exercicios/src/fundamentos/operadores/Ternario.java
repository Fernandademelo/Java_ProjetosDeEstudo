package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 4.0;
		String resultadoParcial = media >= 5.0 ? "em Recuperação " : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado." : " em Recuperação." ;
		
		System.out.println("O Aluno está: " + resultadoParcial);
	}

}
