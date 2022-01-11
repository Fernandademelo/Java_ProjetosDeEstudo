package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
//		Long.toString(num2)
//		Short.toString(0)
		
		
		System.out.println(("" + num1).length()); //usando concatenacao para converter
		System.out.println(("" + num2).length());
	}
}
