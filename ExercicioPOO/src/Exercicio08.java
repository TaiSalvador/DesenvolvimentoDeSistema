public class Exercicio08 {
    public static void main(String[] args) {

        Contribuinte p1 = new Contribuinte("Pedro", "115.665.998-98", "SC", 40000);
        Contribuinte p2 = new Contribuinte("João", "117.559.719-85", "RS", 53000);
        Contribuinte p3 = new Contribuinte("Ana", "559.697.535-98", "PR", 89000);
        Contribuinte p4 = new Contribuinte("Julia", "564.966.986-36", "SC", 80000);
        Contribuinte p5 = new Contribuinte("Nilson", "589.554.534-86", "SC", 56660);

        Contribuinte vetor[] = {p1, p2, p3, p4, p5};

        double maisImposto = Double.MIN_VALUE;
        String pessoaMaisImposto = "";

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getRendaAnual() > maisImposto) {
                maisImposto = vetor[i].getRendaAnual();
                pessoaMaisImposto = vetor[i].getNome();
            }
        }
        System.out.println("A pessoa que mais paga imposto é a: " + pessoaMaisImposto);

        double soma = 0;
         for (int i = 0; i < vetor.length; i++) {
             soma = soma + vetor[i].calcularimposto();
         }
        System.out.println("O total de imposto pago pelos 5 contribuintes é: " + soma);
    }
}
