import java.util.ArrayList;
import java.util.List;

public class Retangulo {
    private double altura;
    private double largura;


    public Retangulo(double altura, double largura) {
        setAltura(altura);
        setLargura(largura);
    }

    public double descobrirArea () {
        return altura * largura;
    }

    public double descobrirPerimetro () {
        return 2 * (altura * largura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero");
        } else {
            this.altura = altura;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura <= 0) {
            throw new IllegalArgumentException("Largura deve ser maior que zero");
        } else {
            this.largura = largura;
        }
    }

    @Override
    public String toString() {
        return "Retangulo: " + "(Altura: " + altura + ", Largura: " + largura + ")\n"
                ;
    }
}

