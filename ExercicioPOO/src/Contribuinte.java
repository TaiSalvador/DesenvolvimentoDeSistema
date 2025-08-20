public class Contribuinte {
    private String nome;
    private  String  cpf;
    private String uf;

    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        setNome(nome);
        setCpf(cpf);
        setUf(uf);
        setRendaAnual(rendaAnual);
    }

    public double calcularAliquota() {
        double aliquota;
        if (rendaAnual <= 0){
            aliquota  = 0.0;
        }else if (rendaAnual > 4000 && rendaAnual < 9000) {
            aliquota = 0.058;
        }else if (rendaAnual > 9000 && rendaAnual < 25000){
            aliquota = 0.15;
        } else if (rendaAnual > 25000 && rendaAnual < 35000) {
            aliquota = 0.275;
        } else{
            aliquota = 0.30;
        }
        return aliquota;
    }

    public double calcularimposta() {
        return rendaAnual * calcularAliquota();
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if(rendaAnual < 0) {
            System.err.println("Erro,você não pode ser desempregado, tem que ter uma renda");
        } else {
            this.rendaAnual = rendaAnual;
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private double rendaAnual;
}

