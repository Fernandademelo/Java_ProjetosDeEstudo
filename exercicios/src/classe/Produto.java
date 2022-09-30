package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto() {
		return preco * (1 - desconto);
		
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
		
	} // dois metodos com o mesmo nome, o que tem aprametros só passar os parametros
	
}
