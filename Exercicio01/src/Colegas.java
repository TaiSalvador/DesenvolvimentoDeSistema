import java.util.Objects;
import java.util.Scanner;

public class Colegas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um nome para puxar informações dele:");
        String nome = sc.nextLine().toLowerCase();

        if (Objects.equals(nome, "vitoria")){
            vitoria();
        } else if (Objects.equals(nome, "thomas")){
            thomas();
        } else if (Objects.equals(nome, "camilly")) {
            camilly();
        } else {
            System.out.println("Essa pessoa não se encontra no metodos");
        }

    }

    public static void vitoria(){
        System.out.println("O nome dela é Vitória Maria");
        System.out.println("Ela tem 18 anos");
        System.out.println("Ela é estudante do Senai");
    }
    public static void camilly(){
        System.out.println("O nome dela é Camilly Xavier");
        System.out.println("Ela tem 17 anos");
        System.out.println("Ela é estudante do Senai");
    }
    public static void thomas(){
        System.out.println("O nome dela é Thomas Edson");
        System.out.println("Ele tem 18 anos");
        System.out.println("Ele não é estudante do Senai");
    }
}
