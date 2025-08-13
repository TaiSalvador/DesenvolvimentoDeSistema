import java.util.Scanner;

public class CalcularVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int [3];

        for (int i = 0; i < 3; i++){
            System.out.println("informe o "+ i + "º número: ");
            int numero = sc.nextInt();
            vetor[i] = numero;
        }
        menorNumero(vetor);
        maiorNumero(vetor);
        mediaNumero(vetor);
    }

    public static void menorNumero(int vetor[]){

        double menor = Double.MAX_VALUE;

        for (int i = 0; i < 3; i++){
            if (vetor[i] < menor){
                menor = vetor[i];
            }
        }
        System.out.println("O menor número do vetor é: " + menor);
    }

    public static void maiorNumero(int vetor[]){
        double maior = Double.MIN_VALUE;

        for (int i = 0; i < 3; i++){
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("O maior número do vetor é: " + maior);
    }

    public static void  mediaNumero (int vetor[]){

        int soma = 0;
        for (int i = 0; i < 3; i++){
            soma += vetor[i];
        }
        double media = soma / vetor.length;

        System.out.println("A média do vetor é: " + media);
    }
}
