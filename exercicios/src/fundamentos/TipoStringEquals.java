package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		String s1 = new String ("2");
		
		//System.out.println("2" == s1);
		//System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner (System.in);
		
		String s2 = entrada.next(); // next tira os espaços em branco, nem precisaria do trim. o nextline precisa do trim
		//System.out.println("2" == s2);
		System.out.println("2".equals(s2.trim())); //equals sempre para ver o valor de dentro da String, e o trim para fazer um trim nos espaços q o usuario colcocar 
		
		
		
	
	}
}
