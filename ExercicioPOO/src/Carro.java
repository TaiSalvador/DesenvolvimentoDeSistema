public class Carro {
    private double velocidade;

    public Carro() {
       setVelocidade(velocidade);
    }
    public double getVelocidade() {

        return velocidade;
    }
    public void setVelocidade(double velocidade) {
         this.velocidade = velocidade;
    }

    public void acelerar (double valor) {
        if (valor >= 0 || valor < 20) {
            setVelocidade(this.velocidade + valor);
        } else {
            throw new IllegalArgumentException("Velocidade inválida, tem que ser no intervalo de 0 e 19");
        }
    }
    public void reduzir (int valor) {
        if(valor >= 0 && valor < 30) {
            setVelocidade(this.velocidade + valor);
        } else {
            throw new IllegalArgumentException("Velocidade inválida, tem que ser no intervalo de 0 e 29");
        }
    }
}
