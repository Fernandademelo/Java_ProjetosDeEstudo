import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class DesafioArray {
    /* calcular a media de notas de aluno,
     * com o usuario passando notas: quantas notas vc quer informar?
     * criar array com o tamanho desse.
     * dois laços for: 1 com as notas em um array : for tradicional
     * percorrer o array com forech e somar notas e apresentar a media.
     **/
    public static void main(String[] args) {
        Scanner en = new Scanner(in);

        System.out.println("Indique quantas Notas: ");

        int qtdeNotas = en.nextInt();

        double[] notas = new double[qtdeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a Nota " + (i + 1) + ": ");
            notas[i] = en.nextDouble();
        }
        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A média  " + media + "!");

        en.close();
    }


}

