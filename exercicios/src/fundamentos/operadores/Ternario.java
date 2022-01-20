package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 5.0;
		String resultadoFinal = media >= 7.0 ? "Aprovado." : media >= 5.0 ? "em Recuperação " : "Reprovado" ;
		
		System.out.println("O Aluno está: " + resultadoFinal);
		
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Nao";
		
		System.out.printf("Tem Desconto? %s", resultado);
	}

}
