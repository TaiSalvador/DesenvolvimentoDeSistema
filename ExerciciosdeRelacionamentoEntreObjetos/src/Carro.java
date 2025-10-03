public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private double ano;
    private double preco;

    public Carro(String marca, String modelo, String placa, int ano, double preco) {

        setMarca(marca);
        setModelo(modelo);
        setPlaca(placa);
        setAno(ano);
        setPreco(preco);
    }

    public double DiferecaDeAno (double anoFuturo) {
        if(anoFuturo <= 2025){
            throw new IllegalArgumentException("A ano da despriação não pode ser menor ou igual ao ano atual");
        } return this.ano = anoFuturo - ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Dado Inválido");
        } else {
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Dado Inválido");
        } else {
            this.modelo = modelo;
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Dado Inválido");
        } else {
            this.placa = placa;
        }
    }

    public double getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano <= 0) {
            throw new IllegalArgumentException("Esse ano não pode ser informado, informe um ano válido");
        } else {
            this.ano = ano;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0){
            throw new IllegalArgumentException("Preço inválido, um carro não pode ser vendido por 0 reais");
        } else {
            this.preco = preco;
        }
    }

    @Override
    public String toString() {
        return "Carro(" + "marca = " + marca + '\'' + ", modelo = " + modelo + '\'' + ", placa = " + placa + '\'' + ", ano = " + ano + ", preco = " + preco + ')' + "\n";
    }
}
