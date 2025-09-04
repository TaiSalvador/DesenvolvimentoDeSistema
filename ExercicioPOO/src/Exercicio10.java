import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OnibusEscolar aluno = new OnibusEscolar();

        System.out.println("Informe quantos alunos iram no ônibus");
        int qtdAlunos = input.nextInt();


        input.close();
    }
}
