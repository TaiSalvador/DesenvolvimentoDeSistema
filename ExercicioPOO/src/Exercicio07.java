public class Exercicio07 {
    public static void main(String[] args) {

        Aeronave a1 = new Aeronave("SkyJet 200", 180, 870, 25000, 65);
        Aeronave a2 = new Aeronave("AeroLux 450", 320, 920, 60000, 150);
        Aeronave a3 = new Aeronave("TurboSky 90", 90, 720, 12000, 35);
        Aeronave a4 = new Aeronave("StarFlight X1", 50, 1020, 130000, 320);

        Aeronave vetor[] = { a1, a2, a3, a4 };

        int maisPassageiros = Integer.MIN_VALUE;
        String modeloMaisPassageiros = "";

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getPassageiros() > maisPassageiros) {
                maisPassageiros = vetor[i].getPassageiros();
                modeloMaisPassageiros = vetor[i].getModelo();
            }
        }
        System.out.println(modeloMaisPassageiros);

        double maiorAutonomia = Double.MIN_VALUE;
        String modeloMaiorAutonomia = "";

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i].calcularAutonomia() > maiorAutonomia) {
                maiorAutonomia = vetor[i].calcularAutonomia();
                modeloMaiorAutonomia = vetor[i].getModelo();
            }
        }
        System.out.println(modeloMaisPassageiros);

        double maiorDistancia = Double.MIN_VALUE;
        String modeloMaiorDistancia = "";

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].calcularDistanciaMaxima() > maiorDistancia) {
                maiorDistancia = vetor[i].calcularDistanciaMaxima();
                modeloMaiorDistancia = vetor[i].getModelo();
            }
        }

        System.out.println(modeloMaiorDistancia);


    }

}
