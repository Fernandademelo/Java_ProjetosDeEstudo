package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		int c = (int) Math.pow(a, 2);
//		
//
//		System.out.println(b);
//		
//		System.out.println(c);
		
		
		System.out.println("____MEU_DESAFIO_____");
		
		
		//variaveis
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 5;
		int e = 6;
		int f = 7;
		int g = 10;
		
		
		System.out.println("_____primeira porcao:______");
		
		int result1 = (e *(c + b ));
		
		int result2 = (int)Math.pow(result1, 2); // 900
		
		int result3 = result2 / (c * b);  //150
		
		System.out.println(result3);		
		
		System.out.println("_____segunda porcao:______");
		
		int result4 = (a - d) * (b - f) / b;
		int result5 = (int)Math.pow(result4, 2);
	
		System.out.println(result5);	
		
		System.out.println("_____porcao final:______");
		
		int result6 = ((result3 - result5));
		
		int resultfinal = (int)Math.pow(result6, 3) / (int)Math.pow(g, 3);
	
		System.out.println("A Resposta é " + resultfinal);
		
		System.out.println("\n____RESPOSTA PROFESSOR_____");
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3*2;
		
		double numB = (1-5) *(2-7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
	
		System.out.println("A Resposta é " + resultado);

	}

}
