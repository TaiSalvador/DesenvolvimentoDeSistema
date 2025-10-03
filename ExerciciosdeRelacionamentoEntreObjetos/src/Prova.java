public class Prova {
    public static void main(String[] args) {
        Carro c1 = new Carro( "Volkswagen", "Gol", "FTX2A45", 2010, 21000);
        Carro c2 = new Carro("Chevrolet", "Onix", "JKM9B12", 2015, 38000);
        Carro c3 = new Carro("Honda", "Civic", "LPR4C67", 2010,34000);
        Carro c4 = new Carro("Chevrolet", "Cruze", "QWE7D89",2019,79000);
        Carro c5 = new Carro("Volkswagen", "Polo", "ZTR1F23", 2019,58000);

        ListaCarro l1 = new ListaCarro();

        l1.adicionarCarro(c1);
        l1.adicionarCarro(c2);
        l1.adicionarCarro(c3);
        l1.adicionarCarro(c4);
        l1.adicionarCarro(c5);

        System.out.println(l1.obterListaCarro());
        System.out.println("O carro mais caro do ano: " + l1.ObterCarroMaisCarroAno(2015));
        System.out.println("Informe a marca e os dois valores: " + l1.ObterCarroDeUmValorEspecifico("Volkswagen", 12000, 70000));
        System.out.println(l1.DepreciacaoDoCarro("QWE7D89", 2030));
    }
}
