package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Hola gente!".charAt(3)); // chamar funcionalidades ler letras especificas por indice.

		String s = "Boa Tarde";
		s = s.toUpperCase();
		s = "Bom Dia";
		System.out.println(s.concat(" !!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("Bom"));
		System.out.println(s.toLowerCase().endsWith("dia"));
		System.out.println(s.length());
		System.out.println(s.equals("Bom Dia"));
		System.out.println(s.equalsIgnoreCase("bom dia"));

		var nome = "Fernanda";
		var sobrenome = "Melo";
		var idade = 30;
		var salario = 12000.45;

		String maisUmaFrase = "Nome: " + nome + " Sobrenome: " + sobrenome;
		System.out.println(maisUmaFrase);

		System.out.printf("Nome: %s %s tem %d anos e ganha %.2f R$", nome, sobrenome, idade, salario);

		String frase = String.format(" \nNome: %s %s tem %d anos e ganha %.2f R$", nome, sobrenome, idade, salario);

		System.out.println(frase);

		System.out.println("Frase Qualquer".contains("Qual"));
		System.out.println("Frase Qualquer".indexOf("qual"));
		System.out.println("Frase Qualquer".substring(6));
		System.out.println("Frase Qualquer".substring(6, 8));
		System.out.println("Frase Qualquer");
	}
}
