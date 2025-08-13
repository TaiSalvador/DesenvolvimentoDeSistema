import java.util.Scanner;

public class Exercicio05 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    Empregado funcionario1 = new Empregado();
    funcionario1.identidade = "126307";
    funcionario1.nome = "Tainá";
    funcionario1.sobrenome = "Salvador";
    funcionario1.salario = 1930.00;


        System.out.println(funcionario1.calcularSalarioAnul());
        System.out.println(funcionario1.adicionarnomes());

        System.out.println("Informe quantos porcentos o salário do funcionario irá aumentar: ");
        double aumento = sc.nextDouble();

        System.out.println("O salário depois do aumeto será de: " + funcionario1.modificarSalario(aumento));
    }
}
