package classe;

import java.util.Date;

public class EqualsHashcode {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "p.silva@hotmail.com";


        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "p.silva@hotmail.com";

        System.out.println(u1 == u2); //false
        System.out.println(u1.equals(u2)); //false
        System.out.println(u2.equals(u1)); //false


        System.out.println(u2.equals(new Date()));


    }
}
