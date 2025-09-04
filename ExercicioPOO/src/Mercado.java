public class Mercado {
    String nome;
    int macaVendidasPorAno;
    double precoMaca;
    int laranjaVendidasPorAno;
    double precoLaranja;

    public double obterReceitaMaca() {
        return macaVendidasPorAno * precoMaca;
    }

    public double obterReceitaLaranja () {
        return laranjaVendidasPorAno * precoLaranja;
    }

    public double obterReceitaTotal () {
        return obterReceitaLaranja() + obterReceitaMaca();
    }
}

