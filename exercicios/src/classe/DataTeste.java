package classe;

import javax.tools.Diagnostic;

public class DataTeste {

	public static void main(String[] args) {
		
		var d1 = new Data();
		d1.ano = 1987;
		
	
		var d2 = new Data(31,12,2020);


		//utilixando o metodo:
		System.out.printf(d1.obterDataFormatada());
		
		System.out.printf(d2.obterDataFormatada());
		
		
		//chamando o void q nao tem retorno
		d1.imprimirDataForm();
		
	}
}
