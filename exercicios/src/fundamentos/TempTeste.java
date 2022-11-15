package fundamentos;

public class TempTeste {
	public static void main(String[] args) {
		
		//(f -32) * 5/9 = C
		
		int farenheit = 98;
		final int ajuste = -32;
		final double fator = 5.0/9;
		double celsius= (farenheit - ajuste)  * fator;
		
		
	
		
		System.out.println(celsius);
		
	}
}
