import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = sc.nextInt();
        vintesDepois(numero);
    }
    public static int vintesDepois(int x) {
        for (int i = x; i <= x + 20; i++){
            System.out.print(i +", ");
        }
        return x;
    }
}
