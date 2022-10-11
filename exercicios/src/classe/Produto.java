package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial, double precoInicial, 
			double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
		
	}
	
	Produto(){
		//se coloco assim o construtor padrao, posso utilizar a criacao de um objeto sem necessidade de parametros!
	}
	
	
	double precoComDesconto() {
		return preco * (1 - desconto);
		
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
		
	} // dois metodos com o mesmo nome, o que tem aprametros só passar os parametros
	
}
