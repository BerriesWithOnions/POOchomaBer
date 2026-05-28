package listas.lista4.exercicio04;

public class Aluno {
    private String nome;
    private StatusAluno status;

    public Aluno(String nome, StatusAluno status) {
        this.nome = nome;
        this.status = status;
    }

    public String getNome() { return nome; }
    public StatusAluno getStatus() { return status; }
}
