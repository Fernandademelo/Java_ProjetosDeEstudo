package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informações de Funcionarios
		
		//Tipos Numericos Inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 54549;
		long pontosAcumulados = 1_234_345_234; // usar underlines com os milhoes. o L é um literal, e passa a inteiro, conversao.
		
		//Tipos Numericos Reais
		
		float salario = 11_445.44F; //indica q esta escrevendo um literal float, e nao double, preciso do F no final.
		double vendasAcumuladas = 2_234_234_234.01;
		
		//Tipo booleano
		boolean estadoDeFerias = false;

		// Tipo Char
		char status = 'A'; //Ativo se pode usar codicos unicode
				
		// Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de Viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha --> " + salario);
		System.out.println("Férias? " + estadoDeFerias);
		System.out.println("Status: " + status);
		
				
		
		
	}
}
