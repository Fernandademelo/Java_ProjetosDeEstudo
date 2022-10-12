package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1;
		mes= 1;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
		
		
	}
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
	//nao funciona em apps, pq só funciona nos terminal.
	//se retorna string, da pra suar em web, desktop, celular, mais flexivel.
}

