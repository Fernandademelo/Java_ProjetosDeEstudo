package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;
		
		
		System.out.println(c);	
		c %= a; // c = c % 2; 0 ou 1 (impar ou par)
		
		System.out.println(c);
	}

}
