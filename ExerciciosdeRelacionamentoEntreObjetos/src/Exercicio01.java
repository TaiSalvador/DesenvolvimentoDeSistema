import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {
    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(12, 5);
        Retangulo r2 = new Retangulo(52,36);
        Retangulo r3 = new Retangulo(5,9);
        Retangulo r4 = new Retangulo(8,12);

        ListaRetangulos l1 = new ListaRetangulos();

        l1.adicionarMedidas(r1);
        l1.adicionarMedidas(r2);
        l1.adicionarMedidas(r3);
        l1.adicionarMedidas(r4);

        System.out.println(l1.obterListaRetangulo());
        System.out.println("O rentagulo com maior área é: " + l1.obterMaiorArea());
        System.out.println("O retangulo com maior perímetr é: " + l1.obterMaiorPerimetro());

    }
}
