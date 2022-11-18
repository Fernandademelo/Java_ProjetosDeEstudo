import java.util.Arrays;

public class ArraysTestes {

    public static void main(String[] args) {

        double[] notasAlunA = new double[4];
        notasAlunA[0]= 7.9;
        notasAlunA[1] = 8;
        notasAlunA[2] = 6.7;
        notasAlunA[3] = 9.7;


       // Arrays.toString(notasAlunA);
        System.out.println(Arrays.toString(notasAlunA));
        System.out.println(notasAlunA[0]);
        System.out.println(notasAlunA[notasAlunA.length - 1]);

        //percorrer o array
        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunA.length; i++){
            totalAlunoA += notasAlunA[i];
        }

        System.out.println(totalAlunoA / notasAlunA.length);

          final double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10}; //dados fixos

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];

        }
        System.out.println( totalAlunoB / notasAlunoB.length);



    }
}
