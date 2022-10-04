package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	// tipo obterDataFormatada (...) vou passar uma string
	//nao passo parametros pqja esta contido na classe
	
	String obterDataFormatada () {
		return String.format("%d/%d/%d\n", dia, mes, ano);
		
	}
	
	void imprimirDataForm() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}
	
	//void imprimirDataForm() {
	//System.out.print(onterDataFormatada);
	//um método usando o outro, sem problemas
}
}
