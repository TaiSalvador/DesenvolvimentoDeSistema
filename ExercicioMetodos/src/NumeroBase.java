import java.util.Scanner;

public class NumeroBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número que sera a base: ");
        int base = sc.nextInt();
        System.out.println("Informe um valor: ");
        int num1 = sc.nextInt();
        System.out.println("Informe outro valor");
        int num2 = sc.nextInt();
        numeroBase(base,num1,num2);
    }
    public static void numeroBase (int x, int y, int z){
        int calculo1 = x - y;
        int calculo2 = x - z;
        int calculoPosivito = Math.abs(calculo1);
        int calculoPosivito2 = Math.abs(calculo2);

        if (calculoPosivito > calculoPosivito2) {
            System.out.println("O número mais perto do número base é: "+ z);
        } else {
            System.out.println("O número mais perto do número base é: " + y);
        }
    }
}
