import java.text.DecimalFormat;

public class Exercicio04 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

    Circulo area1 = new Circulo();
    area1.raio = 5.89;

    Circulo area2 = new Circulo();
    area2.raio = 8.96;

    Circulo area3 = new Circulo();
    area3.raio = 7.55;

    Circulo area4 = new Circulo();
    area4.raio = 5;

    Circulo area5 = new Circulo();
        area5.raio = 4;

        System.out.println("A area desse circulo é: " + (df.format(area1.calcularArea())));
        System.out.println("A area desse circulo é: " + (df.format(area2.calcularArea())));
        System.out.println("A area desse circulo é: " + (df.format(area3.calcularArea())));
        System.out.println("A area desse circulo é: " + (df.format(area4.calcularArea())));
        System.out.println("A area desse circulo é: " + (df.format(area5.calcularArea())));
    }
}
