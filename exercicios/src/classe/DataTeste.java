package classe;

import javax.tools.Diagnostic;

public class DataTeste {

	public static void main(String[] args) {
		
		var d1 = new Data();
		d1.dia = 2;
		d1.mes = 12;
		d1.ano = 1991;
		
	
		var d2 = new Data();
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2022;

		//utilixando o metodo:
		System.out.printf(d1.obterDataFormatada());
		
		System.out.printf(d2.obterDataFormatada());
		
		
		//chamando o void q nao tem retorno
		d1.imprimirDataForm();
		
	}
}
