import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio02 {
    public static void main(String[] args) {
        List <Integer> listNumeros = new ArrayList<>();

        listNumeros.add(1);
        listNumeros.add(2);
        listNumeros.add(3);
        listNumeros.add(4);
        listNumeros.add(5);

        Collections.reverse(listNumeros);
        System.out.println(listNumeros);
    }
}
