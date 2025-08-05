import java.util.Scanner;

public class Estações {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um número de 1 a 4: ");
        System.out.println("Sendo: \n 1 - Verão \n 2 - Inverno \n 3 - Outono \n 4 - Primavera");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                verao();
                break;
            case 2:
                inverno();
                break;
            case 3:
                outono();
                break;
            case 4:
                primavera();
                break;
            default:
                System.out.println("Opçaõ inválida!");
        }

    }

    public static void verao() {
        System.out.println("É verão e o tempo está quente");
    }

    public static void inverno() {
        System.out.println("É inverno e o tempo está frio");
    }

    public static void outono() {
        System.out.println("As folhas estão caindo e o outono está logo ai");
    }

    public static void primavera() {
        System.out.println("As flores estão crescendo e a primavera está logo ai");
    }
}
