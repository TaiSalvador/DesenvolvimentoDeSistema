public class Velocidade {
    private double velocidade;

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade >= 0 && velocidade < 20) {

        }
    }

    public Velocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
