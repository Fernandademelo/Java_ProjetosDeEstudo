package fundamentos;

public class Temperatura {
	
public static void main(String[] args) {
	double farenheit = 90;
	
	final int AJUSTE = -32;
	final double FATOR = 5.0/9;
	
	double celsius = (farenheit - AJUSTE) * FATOR;
	
	System.out.println("O Resultado é " + celsius + "*C.");
	
}
}
