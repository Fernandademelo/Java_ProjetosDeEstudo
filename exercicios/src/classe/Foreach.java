public class Foreach {
    public static void main(String[] args) {

        double[] notas = { 9.9, 8.7, 7.2, 9.4};

        //for comum
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + " ");
        }

        //foreach
        for(double nota: notas) {
            System.out.println(nota + " ");
        }
    }

}
