package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase(); // assim sera armazenado o uppercase na variavel
		s = s.concat(" !!!!");
		
		
		System.out.println(s);
		System.out.println("Leo".toUpperCase());
		
		String y = "Bom Dia X"
				.replace("X", "Fer").toUpperCase().concat(" cucucucu"); // se pode concatenar varias chamadas em cadeia
		System.out.println(y);
		
		
		// Tipos primitivos nao tem operador "." nao se usa neles.
		
		int a = 3;
		System.out.println(a);
	}

}
