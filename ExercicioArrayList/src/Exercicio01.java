import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {
    public static void main(String[] args) {
        List<Integer> listaIdades = new ArrayList<>();

        listaIdades.add(65);
        listaIdades.add(24);
        listaIdades.add(8);
        listaIdades.add(15);
        listaIdades.add(56);
        listaIdades.sort(null);

        System.out.println(listaIdades);
    }
}
