import java.util.ArrayList;
import java.util.List;

public class ListaMaterias {
    private List<Materias> listaMateriais;

    public ListaMaterias() {
        listaMateriais = new ArrayList<>();
    }

    public void adicionarMaterias (Materias a) {
        listaMateriais.add(a);
    }
    
}
