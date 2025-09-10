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


}
