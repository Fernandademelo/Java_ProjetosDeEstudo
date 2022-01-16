package fundamentos.operadores;

public class Logicos {
public static void main(String[] args) {
	
	boolean condicao1 = true;
	boolean condicao2 = 3 > 7;
	
	System.out.println(condicao1 && !condicao2);
	System.out.println(condicao1 || condicao2);
	System.out.println(condicao1 ^ condicao2);
	System.out.println(!!condicao1);
	System.out.println(!condicao2);
	
	
	System.out.println("\nTABELA VERDADE E\n");//TABELA VERDADE
	
	System.out.println(true&&true);
	System.out.println(true&&false);
//	System.out.println(false&&true);
//	System.out.println(false&&false);
	
	
	System.out.println("\nTABELA VERDADE OU \n");
	
//	System.out.println(true||true);
//	System.out.println(true||false);
	System.out.println(false||true);
	System.out.println(false||false);

	
	System.out.println("\nTABELA VERDADE OU EXCLUSIVO XOR \n");
	
	System.out.println(true^true);
	System.out.println(true^false);
	System.out.println(false^true);
	System.out.println(false^false);

	System.out.println("\nTABELA NOT ! \n");
	
	System.out.println(!true);
	System.out.println(!false);
}
}
//comentarios em codigo morto. 