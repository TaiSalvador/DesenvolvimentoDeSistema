import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        List<Double> listValores = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double valor = 1;

        while (valor != 0){
            System.out.println("Informe um valor décimal: (se for 0 o programa irá encerrar)");
            valor = input.nextDouble();
            listValores.add(valor);
        }

        System.out.println(listValores);

        double menorNumero = Double.MAX_VALUE;

        for (int i = 0; i < listValores.size(); i++) {

            }
        }
    }

