package fundamentos;

//import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
//		Scanner entrada = new Scanner(System.in); // para ler 
		
		
		//byte
		Byte b = 100;
		Short s = 1000;
		
		
//		Integer i = Integer.parseInt(entrada.next()); // convrete uma string a int
		Integer i = 10000;
		Long l = 100000L;
		
		System.out.println(b.byteValue()); //pega o valor associado a essa classe
		System.out.println(s.toString()); // s pra string ou outros
		System.out.println(i * 3);
		System.out.println(i / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
//		System.out.println(bo.toString().toUpperCase()); converter pra string pra poder usar upper case e variados
		System.out.println(("" + bo).toUpperCase()); // outra forma de se passar a string
		
		
		Character c = '#';
		System.out.println( c + "...");
		
//		entrada.close();
	}
}
