public class Contribuinte {
    private String nome;
    private  String  cpf;
    private String uf;
    private double rendaAnual;

    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        setNome(nome);
        setCpf(cpf);
        setUf(uf);
        setRendaAnual(rendaAnual);
    }

    private double calcularAliquota() {
        if (rendaAnual <=4000){
            return  0.0;
        }else if (rendaAnual <= 9000) {
            return  0.058;
        }else if (rendaAnual <= 25000){
            return  0.15;
        } else if (rendaAnual <= 35000) {
            return  0.275;
        } else{
            return  0.30;
        }
    }

    public double calcularimposto() {
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
       if (uf == null || uf.length() != 2) {
           System.out.println("Erro, uf inválido");
       } else {
           this.uf = uf;
       }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
       if (cpf == null || cpf.length() != 14) {
           System.out.println("Erro, cpf inválido");
       } else {
           this.cpf = cpf;
       }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Erro, nome inválido");
        } else {
            this.nome = nome;
        }
    }


}

