public class ContaBancaria {
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String nomeTitular, double saldo) {
        setNomeTitular(nomeTitular);
        setSaldo(saldo);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular == null) {
            throw new IllegalArgumentException("Você deve informa um nome titular");
        }
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo  )
    }
}
