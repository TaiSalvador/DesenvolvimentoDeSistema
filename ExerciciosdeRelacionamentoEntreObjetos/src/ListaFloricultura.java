import java.util.ArrayList;
import java.util.List;

public class ListaFloricultura {
    private List<Floricultura> listaFlores;

    public ListaFloricultura (){
        listaFlores = new ArrayList<>();
    }

    public void adicionarFlor (Floricultura a){
        listaFlores.add(a);
    }

    public List<Floricultura> obterListaFlores () {
        return listaFlores;
    }

    public Floricultura obterFlorMaisCara () {
        double florMaisCara = Double.MIN_VALUE;
        Floricultura Flor = null;

        for (Floricultura a : listaFlores) {
            if(a.getPreco() > florMaisCara) {
                florMaisCara = a.getPreco();
                Flor = a;
            }
        }
        return Flor;
    }

    public String obterReceitaPresenteOuNao () {
        int presente = 0;
        int naoPresente = 0;

        for (Floricultura a: listaFlores) {
            if(a.isPresente()) {
                presente++;
            } else {
                naoPresente++;
            }
        }
        if (presente > naoPresente){
            return "Presente venderam mais";
        } else {
            return "Não presente venderam mais";
        }
    }

}
