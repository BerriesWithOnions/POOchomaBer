package listas.lista4.exercicio07;

public class Atividade {
    private String nome;
    private Usuario responsavel;

    public Atividade(String nome, Usuario responsavel) {
        this.nome = nome;
        this.responsavel = responsavel;
    }

    public String getNome() { return nome; }
    public Usuario getResponsavel() { return responsavel; }
}
