public class Exercicio02 {
    public static void main(String[] args) {
        Mercado unidadeDeBlumenau = new Mercado();
        unidadeDeBlumenau.nome = "Super A";
        unidadeDeBlumenau.macaVendidasPorAno = 800;
        unidadeDeBlumenau.precoMaca = 6.99;
        unidadeDeBlumenau.laranjaVendidasPorAno = 1000;
        unidadeDeBlumenau.precoLaranja = 6.99;

        Mercado unidadeDeJoinville = new Mercado();
        unidadeDeJoinville.nome = "Super B";
        unidadeDeJoinville.macaVendidasPorAno = 200;
        unidadeDeJoinville.precoMaca = 15.99;
        unidadeDeJoinville.laranjaVendidasPorAno = 850;
        unidadeDeJoinville.precoLaranja = 6.99;

        Mercado unidadeDeFlorianopolis = new Mercado();
        unidadeDeFlorianopolis.nome = "Super C";
        unidadeDeFlorianopolis.macaVendidasPorAno = 500;
        unidadeDeFlorianopolis.precoMaca = 10.99;
        unidadeDeFlorianopolis.laranjaVendidasPorAno = 200;
        unidadeDeFlorianopolis.precoLaranja = 12.99;

        Mercado vetor[] = {unidadeDeBlumenau, unidadeDeJoinville, unidadeDeFlorianopolis};

        double maiorReceitaMaca = Double.MIN_VALUE;
        String unidadeMaca = "";

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].obterReceitaMaca() > maiorReceitaMaca) {
                maiorReceitaMaca = vetor[i].obterReceitaMaca();
                unidadeMaca = vetor[i].nome;
            }
        }
        System.out.println("O mercado com a maior receite de maçã vendidas no ano é: " + unidadeMaca + " com um total de " + maiorReceitaMaca + " reais vendidos");
        double menorReceitaLaranja = Double.MAX_VALUE;
        String unidadeLaranja = "";

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].obterReceitaLaranja() < menorReceitaLaranja) {
                menorReceitaLaranja = vetor[i].obterReceitaLaranja();
                unidadeLaranja = vetor[i].nome;
            }
        }
        System.out.println("O mercado com a menor receite de laranja vendidas no ano é: " + unidadeLaranja + " com um total de " + menorReceitaLaranja + " reais vendidos");


        double maiorReceita = Double.MIN_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].obterReceitaTotal() > maiorReceita) {
                maiorReceita = vetor[i].obterReceitaTotal();
            }
        }

        double segundaMaiorReceita = Double.MIN_VALUE;
        String unidadeDaSegundaMaior = "";

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].obterReceitaTotal() > segundaMaiorReceita && vetor[i].obterReceitaTotal() != maiorReceita) {
                segundaMaiorReceita = vetor[i].obterReceitaTotal();
                unidadeDaSegundaMaior = vetor[i].nome;
            }
        }
        System.out.println(unidadeDaSegundaMaior);
    }
}
