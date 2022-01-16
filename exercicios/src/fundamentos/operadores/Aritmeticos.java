package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		System.out.println(2+3);
		
		System.out.println("__________DOUBLES__________");
		var x = 3.56;
		double y = 3.45;
		
		System.out.println(x+y);
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		
		System.out.println("__________INTEIROS__________"); // inteiros geram resultados sempre em inteiros
		int a = 8;
		int b = 3;
 
		System.out.println(a+b);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a/(double)b); // se pode utilizar cast para q o resultado seja em double
		
		System.out.println("MODULO");
		
		System.out.println(8%3);
	}
	}
