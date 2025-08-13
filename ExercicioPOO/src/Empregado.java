public class Empregado {
    String identidade;
    String nome;
    String sobrenome;
    double salario;

    public double calcularSalarioAnul() {
        return salario * 12;
    }

    public String adicionarnomes() {
        return nome + " " + sobrenome;
    }

    public double modificarSalario(double x) {
        double porcento = x / 100;
        double salarioFinal = (porcento * salario) + salario;

        return salarioFinal;
    }
}
