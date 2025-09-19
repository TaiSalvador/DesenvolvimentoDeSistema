public class Floricultura {
    private String nome;
    private double preco;
    private String cliente;
    private boolean presente;

    public Floricultura(String nome, double preco, String cliente, boolean presente) {
        setNome(nome);
        setPreco(preco);
        setCliente(cliente);
        setPresente(presente);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Você deve informar o nome da flor");
        } else {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("A flor não pode custar menos de zero reais");
        } else {
            this.preco = preco;
        }
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        if(cliente == null || cliente.isBlank()) {
            throw new IllegalArgumentException("Você deve informar o nome do cliente");
        } else {
            this.cliente = cliente;
        }
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    @Override
    public String toString() {
        return "Floricultura: (Flor: " + nome + ", Preço: " + preco + ", Cliente: " + cliente + ", Presente: " + presente + "\n";
    }
}
