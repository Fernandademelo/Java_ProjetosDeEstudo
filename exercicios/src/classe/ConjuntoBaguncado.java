import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1); //int -> Integer
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("Teste");
        System.out.println("Tamanho é " + conjunto.size());

        //set nao aceita repetiçao!!

        // remover elementos
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(
                nums);
        System.out.println(
                conjunto);

        //conjunto.addAll(nums);  //adiciona todos os elementos de nums no conjunto

        conjunto.retainAll(nums); //retira todos os elementos de conjunto que nao estao em nums
        System.out.println(
                conjunto);

        conjunto.clear(); //limpa o conjunto
        System.out.println(
                conjunto);


    }
}
