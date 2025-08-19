public class Aeronave {
    private String modelo;
    private int passageiros;
    private double velocidadeMaxima;
    private double capacidadeCombustivel;
    private double queimaCombustivelMinuto;

    public Aeronave(String modelo, int passageiros, double velocidadeMaxima, double capacidadeCombustivel, double queimaCombustivelMinuto) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivelMinuto = queimaCombustivelMinuto;
    }

    public double calcularAutonomia() {
        return capacidadeCombustivel / queimaCombustivelMinuto;
    }

    public double calcularDistanciaMaxima() {
        return calcularAutonomia() * velocidadeMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getQueimaCombustivelMinuto() {
        return queimaCombustivelMinuto;
    }

    public void setQueimaCombustivelMinuto(double queimaCombustivelMinuto) {
        this.queimaCombustivelMinuto = queimaCombustivelMinuto;
    }
}


