import java.util.ArrayList;
import java.util.List;

public  class ListaRetangulos{
    private List<Retangulo> listaMedidas;

    public ListaRetangulos(){
        listaMedidas = new ArrayList<>();
    }

    public void adicionarMedidas (Retangulo a) {
        listaMedidas.add(a);
    }

    public List<Retangulo> obterListaRetangulo(){
        return listaMedidas;
    }

    public Retangulo obterMaiorArea () {
       double maiorArea = Double.MIN_VALUE;
       Retangulo retanguloMaiorArea = null;
       for (Retangulo a: listaMedidas){
           if(a.descobrirArea() > maiorArea) {
               maiorArea = a.descobrirArea();
               retanguloMaiorArea = a;
           }
       }
       return retanguloMaiorArea;
    }

    public Retangulo obterMaiorPerimetro () {
        double maiorPerimetro = Double.MIN_VALUE;
        Retangulo retanguloMaiorPerimetro = null;

        for(Retangulo a: listaMedidas) {
            if(a.descobrirPerimetro() > maiorPerimetro) {
                maiorPerimetro = a.descobrirPerimetro();
                retanguloMaiorPerimetro = a;
            }
        }
        return retanguloMaiorPerimetro;
    }

}