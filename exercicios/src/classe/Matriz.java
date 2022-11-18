import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    /** Calculo da média de uma turma a partir de uma matriz onde
     * a matriz mais externa representa a qntd de alunos
     * e a matriz mais interna as qtd de notas
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos Alunos? ");
        int qtdAlunos = entrada.nextInt();

        System.out.print("Quantas Notas? ");
        int qtdNotas = entrada.nextInt();;

        double [][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length ; n++) {
                System.out.printf("Informe a nota %d do Aluno %d "
                        ,n +1 ,a +1);
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];

            }
            double media = total / (qtdAlunos * qtdNotas);
            System.out.println("A média da turma é de " + media);

        }
        for (double[] notasDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }
        entrada.close();
    }
}
