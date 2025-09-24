import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

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
    public String adicionarMaterialNoEstoque(String nomeMaterial, int quantidade) {
        for (Materias a : listaMateriais) {
            if (a.getNome().equalsIgnoreCase(nomeMaterial)) {
                a.adicionarMaterialNoEstoque(quantidade);
            }
        }
        return "Estoque atualizado";
    }

    public String venderMaterial(String nomeMaterial, int quantidade) {
        for (Materias a: listaMateriais) {
            if(a.getNome().equalsIgnoreCase(nomeMaterial)) {
                a.vender(quantidade);
            }
        }

        return "Venda realizada com sucesso!";
    }
    public String promocaoMaterial (String nomeMaterial, double desconto) {
        for(Materias a : listaMateriais) {
            if (a.getNome().equalsIgnoreCase(nomeMaterial)) {
                a.promocao(desconto);
            }
        }
        return "Desconto realizado com sucesso";
    }

    public Materias materialMaisCaro () {
        double materialCaro = Double.MIN_VALUE;
        Materias Material = null;

        for (Materias a : listaMateriais) {
            if (a.getPreco() > materialCaro) {
                materialCaro = a.getPreco();;
                Material = a;
            }
        }
        return Material;
    }

}


