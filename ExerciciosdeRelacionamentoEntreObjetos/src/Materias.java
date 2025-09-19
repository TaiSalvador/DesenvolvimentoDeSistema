public class Materias {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Materias(String nome, double preco, int qtdEstoque) {
        setNome(nome);
        setPreco(preco);
        setQtdEstoque(qtdEstoque);
    }

    public void adicionarMaterialNoEstoque(String nomeMaterial, int quantidade) {
        if(quantidade <= 0){
            throw new IllegalArgumentException("A quantidade adicionada não pode ser zero");
        }
        this.qtdEstoque += quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null){
            throw new IllegalArgumentException("O materia deve ter um nome para poder identifica-lo no estoque.");
        } else{
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco <= 0) {
            throw new IllegalArgumentException("O preco não pode ser menor ou igual a zero");
        } else {
            this.preco = preco;
        }
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return "Materias: " + "nome = " + nome +  ", preco = " + preco + ", qtdEstoque = " + qtdEstoque + '\n';
    }
}
