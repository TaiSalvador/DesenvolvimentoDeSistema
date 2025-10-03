import java.util.ArrayList;
import java.util.List;

public class ListaCarro {
    private List<Carro> listaCarro;

    public ListaCarro () {
        listaCarro = new ArrayList<>();
    }

    public void adicionarCarro (Carro c) {
        listaCarro.add(c);
    }

    public List<Carro> obterListaCarro () {
        return listaCarro;
    }

    public Carro ObterCarroMaisCarroAno (int ano) {
        double carroMaisCaro = Double.MIN_VALUE;
        Carro nome = null;
        for (Carro c : listaCarro) {
            if (c.getAno() == ano) {
                if (c.getPreco() > carroMaisCaro) {
                    carroMaisCaro = c.getPreco();
                    nome = c;
                }
            }
        }
        return nome;
    }
    public Carro ObterCarroDeUmValorEspecifico (String nomeMarca, double x, double y) {
        Carro nome = null;
        for (Carro c : listaCarro) {
            if (c.getMarca().equalsIgnoreCase(nomeMarca)) {
                if (c.getPreco() >= x && c.getPreco() <= y) {
                   nome = c;
                }
            }
        }
        return nome;
    }

    public double DepreciacaoDoCarro (String nomePlaca, int anoFuturo) {
        double depreciacao = 0;
        double juro = 0;
        for (Carro c: listaCarro) {
            if(c.getPlaca().equalsIgnoreCase(nomePlaca)) {
                if (c.getAno() < 2015) {
                    double v = c.DiferecaDeAno(anoFuturo) * c.DiferecaDeAno(anoFuturo);
                    depreciacao = c.getPreco() * ((1 + 0.07) * v);
                    juro = c.getPreco() * depreciacao;;

                    }
                }
                else if (c.getAno() >= 2015) {
                    double v = c.DiferecaDeAno(anoFuturo) * c.DiferecaDeAno(anoFuturo);
                    depreciacao = c.getPreco() * ((1 + 0.05) * v);
                    juro = c.getPreco() * depreciacao;
            }
        }
            return juro;
        }
}
