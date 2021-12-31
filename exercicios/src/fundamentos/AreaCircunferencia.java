package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; // final faz ser constante, e nao se podera mudar

		double area = PI * raio * raio;
		System.out.println("Area é igual a " + area);

		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area é igual a " + area);
	}

}
