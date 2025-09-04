public class OnibusEscolar {
    private int qtdAlunos;
    private int qtdProfessor;

    public OnibusEscolar() {

    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        if(qtdAlunos > 40) {
            qtdAlunos = 40;
            throw new IllegalArgumentException("É somente permitido 40 alunos no ônibus");
        } else {
            this.qtdAlunos = qtdAlunos;
        }
    }

    public int getQtdProfessor() {
        return qtdProfessor;
    }

    public void setQtdProfessor(int qtdProfessor) {
        if(qtdProfessor == 0) {
            qtdAlunos = 0;
            throw new IllegalArgumentException("Se nenhum professor acompanhar os estudantes, então nenhum aluno poderá ir no ônibus");
        } else {
            this.qtdProfessor = qtdProfessor;
        }
    }


}

