package fundamentos;

public class Inferencia {
	// pelo valor da var ele infere o tipo da variavel, nao se pode mudar depois o tipo da variavel. amarra o tipo //

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		double d; //se pode declarar
		d = 12.64; // logo inicializar
		System.out.println(d); // usar!
		
		// nao se pode declarar sem inicializar sem usar, sendo VAR.
		//se pode declarar double e trocar pra inteiro, porem nao ao contrario.
		
		var e = 123.2;
		System.out.println(e);
	}
}
