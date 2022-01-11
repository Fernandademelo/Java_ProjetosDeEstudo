package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro salario: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salario: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salario: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		
		Double salarionum1 = Double.parseDouble(salario1);
		Double salarionum2 = Double.parseDouble(salario2);
		Double salarionum3 = Double.parseDouble(salario3);
		
		
		Double soma = (salarionum1 + salarionum2 + salarionum3);
		Double media = (salarionum1 + salarionum2 + salarionum3) / 3;
		
		System.out.println("A soma dos salários é " + soma);
		System.out.println("A média salarial do funcionário é " + media);
		
		entrada.close();
		
		
	}
}
