package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; //conversao implicita! o double vale mais q int, porem o valor é menor.
		System.out.println(a);
		
		float b = (float)1.12345345345; // explicita trunca pq o float nao suporta esse valor, o casting foi feito explicitamente
		System.out.println(b);
		
		int c = 130; // fora do range, trunca!
		byte d = (byte) c; // explicita o (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; // explicita (cast)
		System.out.println(f);
	}
}
