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

    public List<Materias> ObterListaMateriais() {
        return listaMateriais;

    }
    public void adicionarMaterialNoEstoque(String nomeMaterial, int quantidade) {
        for (Materias a: listaMateriais) {
            if (a.getNome().equalsIgnoreCase(nomeMaterial)) {
                a.adicionarMaterialNoEstoque(quantidade);
                System.out.println("Estoque atualizado para " + nomeMaterial);
            }
        }
    }
}


