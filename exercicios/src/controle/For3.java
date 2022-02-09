package controle;

public class For3 {

	public static void main(String[] args) {
		
		
//		int i = 0; // colocar fora do laço para poder acesar a var
//		for(; i < 10; i++) { // tirar a declaracao de dentro, senao só vai ate 9
//			System.out.println(i);
//		}
//		
//		System.out.println("Fora do laço:");
//		System.out.println(i);
		
		
		for(int i = 0; i<10; i++) {
			for(int j = 0; j <10; j++) {
				System.out.printf("[%d %d]\n", i, j); 
			}
		}
	}

}
